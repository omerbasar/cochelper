package ob.cochelper;

import java.util.*;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:29 PM
 */
public class Village {

   private Integer builderCount;
   private List<Building> buildings = new ArrayList<Building>();
   private List<Upgrade> upgrades = new ArrayList<Upgrade>();
   private ProductionStat productionStat = new ProductionStat();
   private ProductionStat upgradeStat = new ProductionStat();
   private Set<BuildingCategory> categories;
   private Set<UpgradeCategory> upgradeCategories;

   private int untilTownHallLevel;
   private int untilLaboratoryLevel;

   /**
    * Her bir kaynak icin gunluk uretim rakamlari
    */
   private Map<Resource, Long> dailyProduction = new HashMap<Resource, Long>();

   public Village(Integer townHall, String cannonCS, String archersCS, String mortars, String wizardTowers, String airDefenses, String airSweepers, String hiddenTeslas, String xBows, String infernoTowers,
                  String bombs, String giantBombs, String airBombs, String seekingAirMines, String skeletonTraps,
                  String goldMines, String elixirCollectors, String darkElixirDrills,
                  String goldStorages, String elixirStorages, String darkElixirStorages,
                  Integer builderCount, String armyCamps, String barracks, String darkBarracks,
                  Integer laboratory, Integer spellFactory, Integer darkSpellFactory, Integer clanCastle,
                  Integer barbarKing, Integer archerQuenn, Set<BuildingCategory> categories, Set<UpgradeCategory> upgradeCategories, Map<Integer, Integer> wallMap,
                  String spellLevels, String elixirTroopLevels, String darkElixirTroopLevels,
                  int untilTownHallLevel, int untilLaboratoryLevel
                  ) {

      this.builderCount = builderCount;
      this.categories = categories;
      this.upgradeCategories = upgradeCategories;
      this.untilTownHallLevel = untilTownHallLevel;
      this.untilLaboratoryLevel = untilLaboratoryLevel;

      create(BuildingType.TOWN_HALL, BuildingCategory.OTHER, townHall);
      create(BuildingType.CLAN_CASTLE, BuildingCategory.OTHER, clanCastle);

      create(BuildingType.CANNON, BuildingCategory.DEFENSE, cannonCS);
      create(BuildingType.ARCHER_TOWER, BuildingCategory.DEFENSE, archersCS);
      create(BuildingType.MORTAR, BuildingCategory.DEFENSE, mortars);
      create(BuildingType.WIZARD_TOWER, BuildingCategory.DEFENSE, wizardTowers);
      create(BuildingType.AIR_DEFENSE, BuildingCategory.DEFENSE, airDefenses);
      create(BuildingType.AIR_SWEEPER, BuildingCategory.DEFENSE, airSweepers);
      create(BuildingType.HIDDEN_TESLA, BuildingCategory.DEFENSE, hiddenTeslas);
      create(BuildingType.XBOW, BuildingCategory.DEFENSE, xBows);
      create(BuildingType.INFERNO_TOWER, BuildingCategory.DEFENSE, infernoTowers);

      create(BuildingType.BOMB, BuildingCategory.DEFENSE, bombs);
      create(BuildingType.GIANT_BOMB, BuildingCategory.DEFENSE, giantBombs);
      create(BuildingType.AIR_BOMB, BuildingCategory.DEFENSE, airBombs);
      create(BuildingType.SEEKING_AIR_MINE, BuildingCategory.DEFENSE, seekingAirMines);
      create(BuildingType.SKELETON_TRAP, BuildingCategory.DEFENSE, skeletonTraps);

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
      create(BuildingType.DARK_SPELL_FACTORY, BuildingCategory.ARMY, darkSpellFactory);

      create(BuildingType.BARBAR_KING, BuildingCategory.HERO, barbarKing);
      create(BuildingType.ARCHER_QUENN, BuildingCategory.HERO, archerQuenn);

      create(BuildingType.WALL, BuildingCategory.WALL, wallMapToCommaSeparated(wallMap));

      String[] elixirTroopLevelArray = elixirTroopLevels.split(",");

      create(UpgradeType.BARBARIAN, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[0]));
      create(UpgradeType.ARCHER, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[1]));
      create(UpgradeType.GIANT, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[2]));
      create(UpgradeType.GOBLIN, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[3]));
      create(UpgradeType.WALL_BREAKER, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[4]));
      create(UpgradeType.BALLOON, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[5]));
      create(UpgradeType.WIZARD, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[6]));
      create(UpgradeType.HEALER, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[7]));
      create(UpgradeType.DRAGON, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[8]));
      create(UpgradeType.PEKKA, UpgradeCategory.ELIXIR_TROOP, Integer.parseInt(elixirTroopLevelArray[9]));

      String[] darkElixirTroopLevelArray = darkElixirTroopLevels.split(",");

      create(UpgradeType.MINION, UpgradeCategory.DARK_ELIXIR_TROOP, Integer.parseInt(darkElixirTroopLevelArray[0]));
      create(UpgradeType.HOG_RIDER, UpgradeCategory.DARK_ELIXIR_TROOP, Integer.parseInt(darkElixirTroopLevelArray[1]));
      create(UpgradeType.VALKYRIE, UpgradeCategory.DARK_ELIXIR_TROOP, Integer.parseInt(darkElixirTroopLevelArray[2]));
      create(UpgradeType.GOLEM, UpgradeCategory.DARK_ELIXIR_TROOP, Integer.parseInt(darkElixirTroopLevelArray[3]));
      create(UpgradeType.WITCH, UpgradeCategory.DARK_ELIXIR_TROOP, Integer.parseInt(darkElixirTroopLevelArray[4]));
      create(UpgradeType.LAVA_HOUND, UpgradeCategory.DARK_ELIXIR_TROOP, Integer.parseInt(darkElixirTroopLevelArray[5]));

      String[] spellLevelArray = spellLevels.split(",");

      create(UpgradeType.LIGHTENING_SPELL, UpgradeCategory.SPELL, Integer.parseInt(spellLevelArray[0]));
      create(UpgradeType.HEALING_SPELL, UpgradeCategory.SPELL, Integer.parseInt(spellLevelArray[1]));
      create(UpgradeType.RAGE_SPELL, UpgradeCategory.SPELL, Integer.parseInt(spellLevelArray[2]));
      create(UpgradeType.JUMP_SPELL, UpgradeCategory.SPELL, Integer.parseInt(spellLevelArray[3]));
      create(UpgradeType.SANTAS_SURPRISE_SPELL, UpgradeCategory.SPELL, Integer.parseInt(spellLevelArray[4]));

      // uretimleri hesapla
      for (Resource resource : Resource.values()) {
         dailyProduction.put(resource, 0L);
      }

      for (Building building : buildings) {
         if(building.getType().isProductionBuilding() && building.getLevel() > 0){
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

      for(int i = totalWallCount ; i < BuildingType.WALL.getMaxAvailable() ; i ++){
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

      for(int i = parts.size() ; i < type.getMaxAvailable(); i ++){
         parts.add("0");
      }
      for (String level : parts) {
         buildings.add(new Building(type, category, Integer.parseInt(level)));
      }
   }

   private void create(UpgradeType type, UpgradeCategory category, Integer level) {
      upgrades.add(new Upgrade(type, category, level));
   }

   public void calculate(){
      for (Building building : buildings) {
         if(categories.contains(building.getCategory())){

            productionStat.incrementBuildTimeElapsed(building.getElapsedBuildTime());
            productionStat.incrementBuildTimeRemaining(building.getRemainingBuildTime(untilTownHallLevel));

            Resource resource = building.getType().getResource();

            productionStat.incrementResourceElapsed(resource, building.getElapsedResource());
            productionStat.incrementResourceRemaining(resource, building.getRemainingResource(untilTownHallLevel));
         }
      }

      // Zamani toplam isci sayisina bolelim
      SingleStat buildTimeStat = productionStat.getBuildTimeStat();
      buildTimeStat.setElapsed(buildTimeStat.getElapsed() / builderCount);
      buildTimeStat.setRemaining(buildTimeStat.getRemaining() / builderCount);
      productionStat.setBuildTimeStat(buildTimeStat);
   }

   // todo: aslinda untilLaboratoryLevel townHallLevel'den hesaplana bilir. Bu constructor'a alindiginda calculate'de parametresiz hale getirilecek
   public void calculateUpgrade(){
      for (Upgrade upgrade: upgrades) {
         if(upgradeCategories.contains(upgrade.getCategory())){

            upgradeStat.incrementBuildTimeElapsed(upgrade.getElapsedBuildTime());
            upgradeStat.incrementBuildTimeRemaining(upgrade.getRemainingBuildTime(untilLaboratoryLevel));

            Resource resource = upgrade.getType().getResource();

            upgradeStat.incrementResourceElapsed(resource, upgrade.getElapsedResource());
            upgradeStat.incrementResourceRemaining(resource, upgrade.getRemainingResource(untilLaboratoryLevel));
         }
      }

      SingleStat buildTimeStat = upgradeStat.getBuildTimeStat();
      buildTimeStat.setElapsed(buildTimeStat.getElapsed());
      buildTimeStat.setRemaining(buildTimeStat.getRemaining());
      upgradeStat.setBuildTimeStat(buildTimeStat);
   }

   public ProductionStat getProductionStat() {
      return productionStat;
   }

   public ProductionStat getUpgradeStat() {
      return upgradeStat;
   }

   public Map<Resource, Long> getDailyProduction() {
      return dailyProduction;
   }

   public ProductionStat getTotalStat(){
      ProductionStat stat = new ProductionStat();
      stat.add(productionStat);
      stat.add(upgradeStat);

      return stat;
   }

   public void printRemainingLevels() {
      for (Building building : buildings) {
         if(categories.contains(building.getCategory())){
            List<Level> remainingLevels = building.getRemainingLevels(untilTownHallLevel);
            if(!remainingLevels.isEmpty()){
               for (Level remainingLevel : remainingLevels) {
                  System.out.println("remainingLevel for building "+ building + " : " + remainingLevel);
               }
            }
         }
      }
   }

   public void printRemainingUpgradeLevels() {
      for (Upgrade upgrade : upgrades) {
         if(upgradeCategories.contains(upgrade.getCategory())){
            List<Level> remainingLevels = upgrade.getRemainingLevels(untilLaboratoryLevel);
            if(!remainingLevels.isEmpty()){
               for (Level remainingLevel : remainingLevels) {
                  System.out.println("remainingLevel for upgrade "+ upgrade + " : " + remainingLevel);
               }
            }
         }
      }
   }
}
