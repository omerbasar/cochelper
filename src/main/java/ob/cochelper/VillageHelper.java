package ob.cochelper;

import java.util.*;

/**
 * @author omer
 */
public class VillageHelper {
   public static Village getVillageOfOmer() {

      int untilTownHallLevel = 10;
      int untilLaboratoryLevel = 8;

      Set<BuildingCategory> categories = new HashSet<BuildingCategory>();
      //categories.add(BuildingCategory.DEFENSE);

      for (BuildingCategory buildingCategory : BuildingCategory.values()) {
         if(buildingCategory.equals(BuildingCategory.WALL)){
            continue;
         }
         categories.add(buildingCategory);
      }

      Set<UpgradeCategory> upgradeCategories = new HashSet<UpgradeCategory>();
      Collections.addAll(upgradeCategories, UpgradeCategory.values());

      Map<Integer, Integer> wallMap = new TreeMap<Integer, Integer>();

      String cannonCS = "11,11,11,11,11,4";
      String archersCS = "10,10,10,10,10,10,5";
      String mortars = "7,7,7";
      String wizardTowers = "6,6,6,6";
      String airDefenses = "7,7,6,6";
      String hiddenTeslas = "7,7,7,7";
      String xBows = "3,2,0";
      String infernoTowers = "0,0";

      String goldMines = "11,11,11,11,11,11,6";
      String elixirCollectors = "11,11,11,11,11,11,6";
      String darkElixirDrills = "6,6,2";

      String goldStorages = "11,11,11,11";
      String elixirStorages = "11,11,11,11";
      String darkElixirStorages = "6";
      int builders = 5;
      String armyCamps = "7,7,7,7";
      String barracks = "10,10,10,10";
      String darkBarracks = "5,5";
      int laboratory = 7;
      int spellFactory = 4;
      int clanCastle = 4;
      int barbarKing = 13;
      int archerQuenn = 9;
      int townHall = 10;

      String spellLevels = "5,4,4,2,1";
      String elixirTroopLevels = "6,6,5,6,5,5,5,3,3,3";
      String darkElixirTroopLevels = "1,1,1,1,1";

      wallMap.put(5, 12);
      wallMap.put(6, 168);
      wallMap.put(7, 68);
      wallMap.put(8, 2);

      return new Village(townHall, cannonCS, archersCS, mortars, wizardTowers, airDefenses, hiddenTeslas, xBows, infernoTowers,
              goldMines, elixirCollectors, darkElixirDrills,
              goldStorages, elixirStorages, darkElixirStorages, builders, armyCamps, barracks, darkBarracks, laboratory, spellFactory,
              clanCastle, barbarKing, archerQuenn, categories, upgradeCategories, wallMap, spellLevels, elixirTroopLevels, darkElixirTroopLevels,
              untilTownHallLevel, untilLaboratoryLevel
              );
   }

   public static Village getVillageOfYagmur() {

      int untilTownHallLevel = 9;
      int untilLaboratoryLevel = 7;

      Set<BuildingCategory> categories = new HashSet<BuildingCategory>();

      for (BuildingCategory buildingCategory : BuildingCategory.values()) {
         if(buildingCategory.equals(BuildingCategory.WALL)){
            continue;
         }
         categories.add(buildingCategory);
      }

      Set<UpgradeCategory> upgradeCategories = new HashSet<UpgradeCategory>();
      Collections.addAll(upgradeCategories, UpgradeCategory.values());

      Map<Integer, Integer> wallMap = new TreeMap<Integer, Integer>();

      String cannonCS = "10,10,10,10,10";
      String archersCS = "10,10,10,9,9,9";
      String mortars = "6,6,6";
      String wizardTowers = "6,6,5,5";
      String airDefenses = "6,6,5,5";
      String hiddenTeslas = "5,5,5,5";
      String xBows = "1,1";
      String infernoTowers = "0";

      String goldMines = "11,11,11,11,11,11";
      String elixirCollectors = "11,11,11,11,11,11";
      String darkElixirDrills = "3,3";

      String goldStorages = "11,11,11,11";
      String elixirStorages = "11,11,11,11";
      String darkElixirStorages = "4";
      int builders = 5;
      String armyCamps = "7,7,7,7";
      String barracks = "10,8,8,8";
      String darkBarracks = "2,2";
      int laboratory = 7;
      int spellFactory = 4;
      int clanCastle = 4;
      int barbarKing = 6;
      int archerQuenn = 1;
      int townHall = 9;

      String spellLevels = "5,4,4,2,1,1";
      String elixirTroopLevels = "6,6,5,6,5,5,5,3,3,3";
      String darkElixirTroopLevels = "1,1,1,1,1";

      wallMap.put(5, 12);
      wallMap.put(6, 168);
      wallMap.put(7, 67);
      wallMap.put(8, 3);

      return new Village(townHall, cannonCS, archersCS, mortars, wizardTowers, airDefenses, hiddenTeslas, xBows, infernoTowers,
              goldMines, elixirCollectors, darkElixirDrills,
              goldStorages, elixirStorages, darkElixirStorages, builders, armyCamps, barracks, darkBarracks, laboratory, spellFactory,
              clanCastle, barbarKing, archerQuenn, categories, upgradeCategories, wallMap, spellLevels, elixirTroopLevels, darkElixirTroopLevels,
              untilTownHallLevel, untilLaboratoryLevel
              );
   }

   public static void main(String[] args) {

      Village village = VillageHelper.getVillageOfOmer();
      village.calculate();
      village.calculateUpgrade();

      System.out.println("\n---- daily production ------\n");
      Map<Resource, Long> prod = village.getDailyProduction();
      for (Resource resource : prod.keySet()) {
         System.out.println(resource + " production per day = " + StringUtil.makeResourceReadable(prod.get(resource)));
      }

      System.out.println("\n-----  buildings -------\n");
      village.getProductionStat().print();

      System.out.println("\n-----  upgrades -------\n");
      village.getUpgradeStat().print();

      System.out.println("\n-----  total -------\n");
      village.getTotalStat().print();

      System.out.println("\n--- remaining levels -----");
      village.printRemainingLevels();

      System.out.println("\n--- remaining upgrades -----");
      village.printRemainingUpgradeLevels();

   }
}
