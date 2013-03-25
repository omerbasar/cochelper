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

   public Village(Integer townHall, String cannonCS, String archersCS, String mortars, String wizardTowers, String airDefenses, String hiddenTeslas, String xBows,
                  String goldMines, String elixirCollectors, String darkElixirDrills,
                  String goldStorages, String elixirStorages, String darkElixirStorages,
                  Integer builderCount, String armyCamps, String barracks, String darkBarracks,
                  Integer laboratory, Integer spellFactory, Integer clanCastle,
                  Integer barbarKing, Integer archerQuenn) {

      this.level = townHall;
      this.builderCount = builderCount;
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
      create(BuildingType.TOWN_HALL, BuildingCategory.OTHER, townHall);
      create(BuildingType.CLAN_CASTLE, BuildingCategory.OTHER, clanCastle);
      create(BuildingType.BARBAR_KING, BuildingCategory.HERO, barbarKing);
      create(BuildingType.ARCHER_QUENN, BuildingCategory.HERO, archerQuenn);
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
         productionStat.incrementBuildTimeElapsed(building.getElapsedBuildTime());
         productionStat.incrementBuildTimeRemaining(building.getRemainingBuildTime());

         Resource resource = building.getType().getResource();

         productionStat.incrementResourceElapsed(resource, building.getElapsedResource());
         productionStat.incrementResourceRemaining(resource, building.getRemainingResource());
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

   public static void main(String[] args) {
      Village village = new Village(9, "9", "4", "0", "0", "0" ,"0", "0", "11", "10", "3", "2,3", "3,4","4,5",5, "5,5", "8,7", "1,2", 4, 4, 3, 5, 0);
      village.calculate();
      ProductionStat productionStat = village.getProductionStat();
      System.out.println("village.getElapsedBuildTime() = " + StringUtil.makeTimeReadable(productionStat.getBuildTimeStat().getElapsed()));
      System.out.println("village.getRemainingBuildTime() = " + StringUtil.makeTimeReadable(productionStat.getBuildTimeStat().getRemaining()));
      System.out.println("village.getTotalBuildTime() = " + StringUtil.makeTimeReadable(productionStat.getBuildTimeStat().getTotal()));
      for (Resource resource : Resource.values()) {
         System.out.println("village.getElapsedResource("+ resource +") = " + StringUtil.makeResourceReadable(productionStat.getResourceSingleStat(resource).getElapsed()));
         System.out.println("village.getRemainingResource("+ resource +") = " + StringUtil.makeResourceReadable(productionStat.getResourceSingleStat(resource).getRemaining()));
         System.out.println("village.getTotalResource("+ resource +") = " + StringUtil.makeResourceReadable(productionStat.getResourceSingleStat(resource).getTotal()));
      }
   }
}
