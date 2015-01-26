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
      String mortars = "8,8,8,8";
      String wizardTowers = "8,8,8,8";
      String airDefenses = "8,8,8,8";
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

      int laboratory = 8;
      int spellFactory = 5;
      int clanCastle = 6;
      int townHall = 10;

      String bombs = "6,6,6,6,6,6";
      String giantBombs = "4,4,4,4,4";
      String airBombs = "4,4,4,4,4";
      String skeletonTraps = "3,3,3";

      String elixirTroopLevels = "7,7,7,6,6,6,6,4,4,5";
      String spellLevels = "6,6,5,3,5";

      // remaining

      String cannonCS = "12,12,11,11,11,11";
      String archersCS = "13,13,13,13,12,11,11";

      String seekingAirMines = "3,2,2,2,2";

      int barbarKing = 30;
      int archerQuenn = 36;

      String darkElixirTroopLevels = "5,5,1,5,2,2";

      wallMap.put(6, 38);
      wallMap.put(7, 149);
      wallMap.put(8, 49);
      wallMap.put(9, 14);

      return new Village(townHall, cannonCS, archersCS, mortars, wizardTowers, airDefenses, hiddenTeslas, xBows, infernoTowers,
              bombs, giantBombs, airBombs, seekingAirMines, skeletonTraps,
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
