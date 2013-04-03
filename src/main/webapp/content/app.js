angular.module('myApp', ['mobile-navigate'])
.service('facebookConnect', function($rootScope) {
    this.askFacebookForAuthentication = function(fail, success) {
        FB.getLoginStatus(function(response) {
            if (response.status === 'connected') {
                var uid = response.authResponse.userID;

                FB.api('/me', success);
            } else if (response.status === 'not_authorized') {
                alert('not authorized');
            } else {
                FB.login(function(response) {
                    if (response.authResponse) {
                        FB.api('/me', success);
                    } else {
                        $rootScope.$apply(function() {
                            fail('User cancelled login or did not fully authorize.')
                        });
                    }
                });
            }
        });
    }
})
.filter('range', function() {
    return function(input, total) {
        total = parseInt(total);
        for (var i=1; i<total + 1; i++)
            input.push(i);
        return input;
    };
})
.config(function($routeProvider) {
  $routeProvider
    .when("/category/:category", {
    templateUrl: "content/category.html",
    controller: CategoryController,
    transition: "modal" //this is overwritten by the go() in home.html
  }).when("/building/:type", {
    templateUrl: "content/building.html",
    controller: BuildingController,
    transition: "modal" //this is overwritten by the go() in home.html
  }).when("/wall", {
    templateUrl: "content/wall.html",
    controller: WallController,
    transition: "modal" //this is overwritten by the go() in home.html
  }).when("/", {
    templateUrl: "content/home.html"
  }).otherwise({
    redirectTo: "/"
  });
})
.value('levels', {
    'cannon' : [1,3,3,0,0],
    'archerTower' : [1,2,1,2,3,4],
    'mortar' : [2,2,0],
    'goldMine' : [10,11,11,10,9,11],
    'elixirCollector' : [11,11,10,10,9,1],
    'townHall' : [7],
    'archerQueen' : [2],
    'barrack' : [10,8,7]
})
.value('wallCountsPerLevel', {
    2 : 20,
    3 : 20,
    4 : 30,
   10 : 170
})
.value('types', {
    'cannon' : {name : 'Topçu', description : 'Topçu ilk üretilen binadır.', maxAvailable : 5, maxLevel : 11},
    'archerTower' : {name : 'Okçu Kulesi', description : 'Uzun menzilli atış yapar.', maxAvailable : 6, maxLevel : 11},
    'mortar' : {name : 'Havan', description : '4x4 lük bir alana etki eder.', maxAvailable : 3, maxLevel : 7},
    'goldMine' : {name : 'Altın Madeni', description : 'Altın toplar. En fazla saatte 3000 üretim yapar.', maxAvailable : 6, maxLevel : 11},
    'elixirCollector' : {name : 'İksir Toplayıcı', description : 'Eliksir toplar. En fazla saatte 3000 üretim yapar.', maxAvailable : 6, maxLevel : 11},
    'townHall' : {name : 'Köy Binası', description : 'Ana şehir. Herşeyin başı :) ', maxAvailable : 1, maxLevel : 9},
    'archerQueen' : {name : 'Okçu Kraliçe', description : 'Okçu kraliçe. Başka söze gerek var mı', maxAvailable : 1, maxLevel : 30},
    'barrack' : {name : 'Kışla', description : 'Savaşçılar burada üretilir.', maxAvailable : 4, maxLevel : 10},
    'wall' : {name : 'Duvar', description : 'Efsane duvarlarla şehrinin savunmasını kuvvetlendirebilirsin. Burada gruplama yapmamız gerekiyor. 6 seviye 10, 7 seviye 25, 10 seviye 200 duvar var gibi....', maxAvailable : 250, maxLevel : 10}
})
.value('categories', {
    'other' : {key : 'other', name : 'Ana Binalar', types : ['townHall']},
    'defense' : {key : 'defense', name : 'Savunma', types : ['cannon', 'archerTower', 'mortar']},
    'resource' : {key : 'resource', name : 'Kaynak', types : ['goldMine', 'elixirCollector']},
    'army' : {key : 'army', name : 'Ordu', types : ['barrack']},
    'hero' : {key : 'hero', name : 'Kahramanlar', types : ['archerQueen']}
})
.run(function($route, $http, $templateCache) {
  angular.forEach($route.routes, function(r) {
    if (r.templateUrl) { 
      $http.get(r.templateUrl, {cache: $templateCache});
    }
  });
})
.directive('ngTap', function() {
  var isTouchDevice = !!("ontouchstart" in window);
  return function(scope, elm, attrs) {
    if (isTouchDevice) {
      var tapping = false;
      elm.bind('touchstart', function() { tapping = true; });
      elm.bind('touchmove', function() { tapping = false; });
      elm.bind('touchend', function() { 
        tapping && scope.$apply(attrs.ngTap);
      });
    } else {
      elm.bind('click', function() {
        scope.$apply(attrs.ngTap);
      });
    }
  };
});

function MainCtrl($scope, $navigate, facebookConnect, categories) {
    $scope.$navigate = $navigate;
    $scope.user = {};
    $scope.error = null;
    $scope.categories = categories;

    $scope.registerWithFacebook = function() {
        facebookConnect.askFacebookForAuthentication(
            function(reason) { // fail
                $scope.error = reason;
            }, function(user) { // success
                $scope.user = user;
                $scope.$apply();
            });
    };

    $scope.logout = function() {
        FB.logout(function(response) {
            $scope.user = null;
            $scope.$apply();
        });
    };
}

function CategoryController($scope, $routeParams, categories){
    $scope.category = categories[$routeParams.category];
}

function BuildingController($scope, $routeParams, levels, types){
    $scope.type = types[$routeParams.type];
    $scope.levels = levels[$routeParams.type];

    $scope.updateLevel = function(){
        levels[$routeParams.type] = $scope.levels;
    };
}

function WallController($scope, levels, types, wallCountsPerLevel){
    $scope.type = types['wall'];
    $scope.wallCountsPerLevel = wallCountsPerLevel;
    $scope.error = '';

    $scope.updateLevel = function(index){
        var count = $scope.getWallCount();
        if(count > $scope.type.maxAvailable){
            $scope.wallCountsPerLevel[index+1] = 0;
            $scope.error = 'Toplam duvar sayısı ' + $scope.type.maxAvailable + " değerinden fazla olamaz.";
        }else{
            $scope.error = '';
        }
        levels['wall'] = $scope.wallCountsPerLevel;
        $scope.calculateUnassigned();
    };

    $scope.getWallCount = function(){
        var c = 0;
        for(var index in $scope.wallCountsPerLevel){
            c += $scope.wallCountsPerLevel[index];
        }
        return c;
    };

    $scope.calculateUnassigned = function(){
        $scope.unassigned = $scope.type.maxAvailable - $scope.getWallCount();
    };

    $scope.calculateUnassigned();
}
