package ob.cochelper;

import java.util.*;

/**
 * @author omer
 */
public class VillageHelper {
   public static Village getVillageOfOmer() {
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

      String cannonCS = "11,11,10,10,10";
      String archersCS = "10,10,9,9,9,9";
      String mortars = "7,7,7";
      String wizardTowers = "6,6,6,6";
      String airDefenses = "6,6,6,6";
      String hiddenTeslas = "7,7,7,5";
      String xBows = "2,1";
      String infernoTowers = "0";

      String goldMines = "11,11,11,11,11,11";
      String elixirCollectors = "11,11,11,11,11,11";
      String darkElixirDrills = "6,5";

      String goldStorages = "11,11,11,11";
      String elixirStorages = "11,11,11,11";
      String darkElixirStorages = "6";
      int builders = 5;
      String armyCamps = "7,7,7,7";
      String barracks = "10,10,9,8";
      String darkBarracks = "3,2";
      int laboratory = 7;
      int spellFactory = 4;
      int clanCastle = 4;
      int barbarKing = 11;
      int archerQuenn = 3;

      wallMap.put(5, 13);
      wallMap.put(6, 167);
      wallMap.put(7, 68);
      wallMap.put(8, 2);

      return new Village(9, cannonCS, archersCS, mortars, wizardTowers, airDefenses, hiddenTeslas, xBows, infernoTowers,
              goldMines, elixirCollectors, darkElixirDrills,
              goldStorages, elixirStorages, darkElixirStorages, builders, armyCamps, barracks, darkBarracks, laboratory, spellFactory,
              clanCastle, barbarKing, archerQuenn, categories, wallMap);
   }

   public static void main(String[] args) {

      int untilTownHallLevel = 9;

      Village village = VillageHelper.getVillageOfOmer();
      village.calculate(untilTownHallLevel);

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

      System.out.println("--------------------------");
      System.out.println("--- remaining levels -----");
      System.out.println("--------------------------");

      village.printRemainingLevels(untilTownHallLevel);
   }
}
