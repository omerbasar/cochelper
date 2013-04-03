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
        for (var i=0; i<total; i++)
            input.push(i);
        return input;
    };
})
.config(function($routeProvider) {
  $routeProvider.when("/one", {
    templateUrl: "content/page1.html"
  }).when("/two", {
    templateUrl: "content/page2.html",
    transition: "modal" //this is overwritten by the go() in home.html
  }).when("/building/:category", {
    templateUrl: "content/building.html",
    controller: BuildingController,
    transition: "modal" //this is overwritten by the go() in home.html
  }).when("/type/:type", {
    templateUrl: "content/type.html",
    controller: TypeController,
    transition: "modal" //this is overwritten by the go() in home.html
  }).when("/popup", {
    templateUrl: "content/popup.html",
    transition: "modal"
  }).when("/monkey", {
    templateUrl: "content/monkey.html"
  }).when("/backwards", {
    templateUrl: "content/backwards.html",
    reverse: true
  }).when("/", {
    templateUrl: "content/home.html"
  }).otherwise({
    redirectTo: "/"
  });
})
.value('levels', {
        'cannon' : [1,3,3],
        'archerTower' : [1,2],
        'mortar' : [2,2]
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

function MainCtrl($scope, $navigate, facebookConnect) {
    $scope.$navigate = $navigate;
    $scope.user = {};
    $scope.error = null;

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

MainCtrl.$inject = ['$scope', '$navigate', 'facebookConnect'];

function BuildingController($scope, $routeParams){
    $scope.category = $routeParams.category;

    if($scope.category == 'defensive'){
        $scope.types = ['cannon', 'archerTower', 'mortar'];
    }else if($scope.category == 'resource'){
        $scope.types = ['goldMine', 'elixirCollector'];
    }
}

function TypeController($scope, $routeParams, $rootScope, levels){
    var types = [];
    types['cannon'] = {name : 'Topçu', description : 'Topçu ilk üretilen binadır.', maxAvailable : 5};
    types['archerTower'] = {name : 'Okçu Kulesi', description : 'Uzun menzilli atış yapar.', maxAvailable : 6};
    types['mortar'] = {name : 'Havan', description : '4x4 lük bir alana etki eder.', maxAvailable : 3};

    $rootScope.type = types[$routeParams.type];
    $rootScope.type.levels = levels[$routeParams.type];

    $scope.updateLevel = function(index){
        alert('newValue[' + index + "] = " + $rootScope.type.levels[index]);
        levels[$routeParams.type] = $rootScope.type.levels;
    };
}
