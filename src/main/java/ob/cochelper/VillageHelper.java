package ob.cochelper;

import java.util.*;

/**
 * @author omer
 */
public class VillageHelper {

   public static Village getVillageOfOmer() {

      int untilTownHallLevel = 10;
      int untilLaboratoryLevel = 8;

      Set<BuildingCategory> categories = new HashSet<>();
      //categories.add(BuildingCategory.DEFENSE);

      for (BuildingCategory buildingCategory : BuildingCategory.values()) {
         if(buildingCategory.equals(BuildingCategory.WALL)){
            continue;
         }
         categories.add(buildingCategory);
      }

      Set<UpgradeCategory> upgradeCategories = new HashSet<>();
      Collections.addAll(upgradeCategories, UpgradeCategory.values());

      Map<Integer, Integer> wallMap = new TreeMap<>();

      // finished
      String cannonCS = "13,13,13,13,13,13";
      String airDefenses = "8,8,8,8";
      String mortars = "8,8,8,8";
      String wizardTowers = "8,8,8,8";
      String hiddenTeslas = "8,8,8,8";
      String xBows = "4,4,4";
      String infernoTowers = "3,3";

      String goldMines = "12,12,12,12,12,12,12";
      String elixirCollectors = "12,12,12,12,12,12,12";
      String darkElixirDrills = "6,6,6";

      String goldStorages = "11,11,11,11";
      String elixirStorages = "11,11,11,11";
      String darkElixirStorages = "6";
      int builders = 5;
      String armyCamps = "8,8,8,8";
      String barracks = "10,10,10,10";
      String darkBarracks = "6,6";
      String archersCS = "13,13,13,13,13,13,13";
      String airSweepers = "6,6";

      int laboratory = 8;
      int spellFactory = 5;
      int darkSpellFactory = 3;
      int clanCastle = 6;
      int townHall = 10;
      int barbarKing = 40;
      int archerQuenn = 40;

      String bombs = "6,6,6,6,6,6";
      String giantBombs = "4,4,4,4,4";
      String airBombs = "4,4,4,4,4";
      String skeletonTraps = "3,3,3";
      String seekingAirMines = "3,3,3,3,3";

      String spellLevels = "6,6,5,3,1,5";
      String elixirTroopLevels = "7,7,7,6,6,6,6,4,5,5";

      // remaining

      String darkElixirTroopLevels = "6,5,1,5,2,3";
      String darkSpellLevels = "3,2,1";

      wallMap.put(7, 3);
      wallMap.put(8, 2);
      wallMap.put(9, 240);
      wallMap.put(10, 2);
      wallMap.put(11, 3);

      return new Village(townHall, cannonCS, archersCS, mortars, wizardTowers, airDefenses, airSweepers, hiddenTeslas, xBows, infernoTowers,
              bombs, giantBombs, airBombs, seekingAirMines, skeletonTraps,
              goldMines, elixirCollectors, darkElixirDrills,
              goldStorages, elixirStorages, darkElixirStorages, builders, armyCamps, barracks, darkBarracks, laboratory, spellFactory, darkSpellFactory,
              clanCastle, barbarKing, archerQuenn, categories, upgradeCategories, wallMap, spellLevels, darkSpellLevels, elixirTroopLevels, darkElixirTroopLevels,
              untilTownHallLevel, untilLaboratoryLevel
              );
   }

   public static void main(String[] args) {

      Village village = VillageHelper.getVillageOfOmer();
      village.calculate();
      village.calculateUpgrade();

      /*
      System.out.println("\n---- daily production ------\n");
      Map<Resource, Long> prod = village.getDailyProduction();
      for (Resource resource : prod.keySet()) {
         System.out.println(resource + " production per day = " + StringUtil.makeResourceReadable(prod.get(resource)));
      }
      */

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
