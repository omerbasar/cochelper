package ob.cochelper;

import java.util.*;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:29 PM
 */
public class Village {

   private Integer level;
   private Integer builderCount;
   private List<Building> buildings = new ArrayList<Building>();
   private ProductionStat productionStat = new ProductionStat();
   private Set<BuildingCategory> categories;

   /**
    * Her bir kaynak icin gunluk uretim rakamlari
    */
   private Map<Resource, Long> dailyProduction = new HashMap<Resource, Long>();

   public Village(Integer townHall, String cannonCS, String archersCS, String mortars, String wizardTowers, String airDefenses, String hiddenTeslas, String xBows,
                  String goldMines, String elixirCollectors, String darkElixirDrills,
                  String goldStorages, String elixirStorages, String darkElixirStorages,
                  Integer builderCount, String armyCamps, String barracks, String darkBarracks,
                  Integer laboratory, Integer spellFactory, Integer clanCastle,
                  Integer barbarKing, Integer archerQuenn, Set<BuildingCategory> categories, Map<Integer, Integer> wallMap) {

      this.level = townHall;
      this.builderCount = builderCount;
      this.categories = categories;

      create(BuildingType.TOWN_HALL, BuildingCategory.OTHER, townHall);
      create(BuildingType.CLAN_CASTLE, BuildingCategory.OTHER, clanCastle);

      create(BuildingType.CANNON, BuildingCategory.DEFENSE, cannonCS);
      create(BuildingType.ARCHER_TOWER, BuildingCategory.DEFENSE, archersCS);
      create(BuildingType.MORTAR, BuildingCategory.DEFENSE, mortars);
      create(BuildingType.WIZARD_TOWER, BuildingCategory.DEFENSE, wizardTowers);
      create(BuildingType.AIR_DEFENSE, BuildingCategory.DEFENSE, airDefenses);
      create(BuildingType.HIDDEN_TESLA, BuildingCategory.DEFENSE, hiddenTeslas);
      create(BuildingType.XBOW, BuildingCategory.DEFENSE, xBows);

      create(BuildingType.GOLD_MINE, BuildingCategory.RESOURCE, goldMines);
      create(BuildingType.ELIXIR_COLLECTOR, BuildingCategory.RESOURCE, elixirCollectors);
      create(BuildingType.DARK_ELIXIR_DRILL, BuildingCategory.RESOURCE, darkElixirDrills);
      create(BuildingType.GOLD_STORAGE, BuildingCategory.RESOURCE, goldStorages);
      create(BuildingType.ELIXIR_STORAGE, BuildingCategory.RESOURCE, elixirStorages);
      create(BuildingType.DARK_ELIXIR_STORAGE, BuildingCategory.RESOURCE, darkElixirStorages);
      create(BuildingType.BUILDERS_HUT, BuildingCategory.RESOURCE, builderCount);

      create(BuildingType.ARMY_CAMP, BuildingCategory.ARMY, armyCamps);
      create(BuildingType.BARRACK, BuildingCategory.ARMY, barracks);
      create(BuildingType.DARK_BARRACK, BuildingCategory.ARMY, darkBarracks);
      create(BuildingType.LABORATORY, BuildingCategory.ARMY, laboratory);
      create(BuildingType.SPELL_FACTORY, BuildingCategory.ARMY, spellFactory);

      create(BuildingType.BARBAR_KING, BuildingCategory.HERO, barbarKing);
      create(BuildingType.ARCHER_QUENN, BuildingCategory.HERO, archerQuenn);

      create(BuildingType.WALL, BuildingCategory.WALL, wallMapToCommaSeparated(wallMap));

      // uretimleri hesapla
      for (Resource resource : Resource.values()) {
         dailyProduction.put(resource, 0L);
      }

      for (Building building : buildings) {
         if(building.getType().isProductionBuilding()){
            Map.Entry<Resource, Integer> entry = ProductionHelper.getProductionPerDay(building.getType(), building.getLevel());
            if(entry.getKey() != null){
               dailyProduction.put(entry.getKey(), dailyProduction.get(entry.getKey()) + entry.getValue());
            }
         }
      }
   }

   private String wallMapToCommaSeparated(Map<Integer, Integer> wallMap) {
      StringBuilder builder = new StringBuilder();
      int totalWallCount = 0;
      for (Integer wallLevel : wallMap.keySet()) {
         Integer count = wallMap.get(wallLevel);
         totalWallCount += count;
         for(int i = 0 ; i < count ; i ++){
            builder.append(wallLevel).append(",");
         }
      }

      for(int i = totalWallCount ; i < LevelHelper.getMaxAvailable(BuildingType.WALL, level) ; i ++){
         builder.append(0).append(",");
      }

      builder.deleteCharAt(builder.length() - 1);
      return builder.toString();
   }

   private void create(BuildingType type, BuildingCategory category, Integer level) {
      buildings.add(new Building(type, category, level));
   }

   private void create(BuildingType type, BuildingCategory category, String commaSeparated) {
      ArrayList<String> parts = new ArrayList<String>();
      Collections.addAll(parts, commaSeparated.split(","));

      for(int i = parts.size() ; i < LevelHelper.getMaxAvailable(type, level); i ++){
         parts.add("0");
      }
      for (String level : parts) {
         buildings.add(new Building(type, category, Integer.parseInt(level)));
      }
   }

   public void calculate(){
      for (Building building : buildings) {
         if(categories.contains(building.getCategory())){
            productionStat.incrementBuildTimeElapsed(building.getElapsedBuildTime());
            productionStat.incrementBuildTimeRemaining(building.getRemainingBuildTime());

            Resource resource = building.getType().getResource();

            productionStat.incrementResourceElapsed(resource, building.getElapsedResource());
            productionStat.incrementResourceRemaining(resource, building.getRemainingResource());
         }
      }

      // Zamani toplam isci sayisina bolelim
      SingleStat buildTimeStat = productionStat.getBuildTimeStat();
      buildTimeStat.setElapsed(buildTimeStat.getElapsed() / builderCount);
      buildTimeStat.setRemaining(buildTimeStat.getRemaining() / builderCount);
      productionStat.setBuildTimeStat(buildTimeStat);
   }

   public ProductionStat getProductionStat() {
      return productionStat;
   }

   public Map<Resource, Long> getDailyProduction() {
      return dailyProduction;
   }

   public static void main(String[] args) {

      Set<BuildingCategory> categories = new HashSet<BuildingCategory>();
      //categories.add(BuildingCategory.DEFENSE);

      for (BuildingCategory buildingCategory : BuildingCategory.values()) {
         if(buildingCategory.equals(BuildingCategory.WALL)){
            continue;
         }else if(buildingCategory.equals(BuildingCategory.HERO)){
            continue;
         }
         categories.add(buildingCategory);
      }

      Map<Integer, Integer> wallMap = new TreeMap<Integer, Integer>();

      String cannonCS = "11,11,10,10,9";
      String archersCS = "10,10,9,9,9,9";
      String mortars = "7,7,7";
      String wizardTowers = "6,6,6,2";
      String airDefenses = "6,6,5,2";
      String hiddenTeslas = "6,6,5,3";
      String xBows = "2,1";
      String goldMines = "11,11,11,11,11,11";
      String elixirCollectors = "11,11,11,11,11,11";
      String darkElixirDrills = "5,4";
      String goldStorages = "11,11,11,11";
      String elixirStorages = "11,11,11,11";
      String darkElixirStorages = "6";
      int builders = 5;
      String armyCamps = "7,7,7,7";
      String barracks = "10,8,8,8";
      String darkBarracks = "2,2";
      int laboratory = 7;
      int spellFactory = 4;
      int clanCastle = 4;
      int barbarKing = 8;
      int archerQuenn = 1;

      wallMap.put(1, 1);
      wallMap.put(5, 18);
      wallMap.put(6, 161);
      wallMap.put(7, 68);
      wallMap.put(8, 2);

      Village village = new Village(9, cannonCS,
              archersCS, mortars, wizardTowers, airDefenses, hiddenTeslas, xBows, goldMines, elixirCollectors, darkElixirDrills,
              goldStorages, elixirStorages, darkElixirStorages, builders, armyCamps, barracks, darkBarracks, laboratory, spellFactory,
              clanCastle, barbarKing, archerQuenn, categories, wallMap);

      village.calculate();

      ProductionStat productionStat = village.getProductionStat();
      System.out.println("Build time = " + StringUtil.makeTimeReadable(productionStat.getBuildTimeStat().getElapsed()));
      System.out.println("Remaining build time = " + StringUtil.makeTimeReadable(productionStat.getBuildTimeStat().getRemaining()));
      System.out.println("Total build time = " + StringUtil.makeTimeReadable(productionStat.getBuildTimeStat().getTotal()));
      for (Resource resource : Resource.values()) {
         System.out.println(resource +" used = " + StringUtil.makeResourceReadable(productionStat.getResourceSingleStat(resource).getElapsed()));
         System.out.println(resource +" should be collected =  " + StringUtil.makeResourceReadable(productionStat.getResourceSingleStat(resource).getRemaining()));
         System.out.println(resource +" total = " + StringUtil.makeResourceReadable(productionStat.getResourceSingleStat(resource).getTotal()));
      }

      System.out.println("-----------------------------------");
      Map<Resource, Long> prod = village.getDailyProduction();
      for (Resource resource : prod.keySet()) {
         System.out.println(resource+" production per day = " + StringUtil.makeResourceReadable(prod.get(resource)));
      }
   }
}
