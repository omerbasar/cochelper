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

      String cannonCS = "12,11,11,11,11,11";
      String archersCS = "11,11,10,10,10,10,10";
      String mortars = "8,8,7";
      String wizardTowers = "8,7,7,7";
      String airDefenses = "8,7,7,6";
      String hiddenTeslas = "7,7,7,7";
      String xBows = "4,4,4";
      String infernoTowers = "3,3";

      String bombs = "5,5,5,5,5,5";
      String giantBombs = "4,4,4,3,3";
      String airBombs = "4,4,4,4,3";
      String seekingAirMines = "2,2,2,1,1";

      String goldMines = "11,11,11,11,11,11,11";
      String elixirCollectors = "11,11,11,11,11,11,11";
      String darkElixirDrills = "6,6,6";

      String goldStorages = "11,11,11,11";
      String elixirStorages = "11,11,11,11";
      String darkElixirStorages = "6";
      int builders = 5;
      String armyCamps = "8,8,8,8";
      String barracks = "10,10,10,10";
      String darkBarracks = "5,5";
      int laboratory = 8;
      int spellFactory = 5;
      int clanCastle = 6;
      int barbarKing = 25;
      int archerQuenn = 27;
      int townHall = 10;

      String elixirTroopLevels = "6,6,6,6,6,6,6,4,3,4";
      String spellLevels = "6,6,5,2,5";
      String darkElixirTroopLevels = "5,5,1,5,2";

      wallMap.put(6, 49);
      wallMap.put(7, 158);
      wallMap.put(8, 43);

      return new Village(townHall, cannonCS, archersCS, mortars, wizardTowers, airDefenses, hiddenTeslas, xBows, infernoTowers,
              bombs, giantBombs, airBombs, seekingAirMines,
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

      String bombs = "1,1,1,1,1,1";
      String giantBombs = "1,1,1,1,1";
      String airBombs = "1,1,1,1,1";
      String seekingAirMines = "1,1,1,1,1";

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
              bombs, giantBombs, airBombs, seekingAirMines,
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
