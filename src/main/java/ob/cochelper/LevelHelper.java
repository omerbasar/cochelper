package ob.cochelper;

import java.util.ArrayList;
import java.util.List;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:40 PM
 */
public class LevelHelper {
   
   private static final List<Level> cannonLevels = new ArrayList<Level>(11);
   private static final List<Level> archerTowerLevels = new ArrayList<Level>(11);
   private static final List<Level> mortarLevels = new ArrayList<Level>(7);
   private static final List<Level> wizardTowerLevels = new ArrayList<Level>(7);
   private static final List<Level> airDefenseLevels = new ArrayList<Level>(7);
   private static final List<Level> hiddenTeslaLevels = new ArrayList<Level>(6);
   private static final List<Level> xBowLevels = new ArrayList<Level>(3);

   private static final List<Level> elixirCollectorLevels = new ArrayList<Level>(11);
   private static final List<Level> goldMineLevels = new ArrayList<Level>(11);
   private static final List<Level> darkElixirDrillLevels = new ArrayList<Level>(6);
   private static final List<Level> goldStorageLevels = new ArrayList<Level>(11);
   private static final List<Level> elixirStorageLevels = new ArrayList<Level>(11);
   private static final List<Level> darkElixirStorageLevels = new ArrayList<Level>(6);
   private static final List<Level> buildersHutLevels = new ArrayList<Level>(1);
   private static final List<Level> armyCampLevels = new ArrayList<Level>(7);
   private static final List<Level> barrackLevels = new ArrayList<Level>(10);
   private static final List<Level> darkBarrackLevels = new ArrayList<Level>(3);
   private static final List<Level> laboratoryLevels = new ArrayList<Level>(7);
   private static final List<Level> spellFactoryLevels = new ArrayList<Level>(4);
   private static final List<Level> townHallLevels = new ArrayList<Level>(9);
   private static final List<Level> clanCastleLevels = new ArrayList<Level>(4);
   private static final List<Level> wallLevels = new ArrayList<Level>(10);

   private static final List<Level> barbarKingLevels = new ArrayList<Level>(30);
   private static final List<Level> archerQueenLevels = new ArrayList<Level>(30);

   static{
      cannonLevels.add(new Level(1, 250, 1));
      cannonLevels.add(new Level(2, 1000, 15));
      cannonLevels.add(new Level(3, 4000, 45));
      cannonLevels.add(new Level(4, 16000, 2 * 60));
      cannonLevels.add(new Level(5, 50000, 6 * 60));
      cannonLevels.add(new Level(6, 100000, 12 * 60));
      cannonLevels.add(new Level(7, 200000, 1440));
      cannonLevels.add(new Level(8, 400000, 2 * 1440));
      cannonLevels.add(new Level(9, 800000, 3 * 1440));
      cannonLevels.add(new Level(10, 1600000, 4 * 1440));
      cannonLevels.add(new Level(11, 3200000, 5 * 1440));

      archerTowerLevels.add(new Level(1, 1000, 15));
      archerTowerLevels.add(new Level(2, 2000, 30));
      archerTowerLevels.add(new Level(3, 5000, 45));
      archerTowerLevels.add(new Level(4, 20000, 4 * 60));
      archerTowerLevels.add(new Level(5, 80000, 12 * 60));
      archerTowerLevels.add(new Level(6, 180000, 1440));
      archerTowerLevels.add(new Level(7, 360000, 3 * 1440));
      archerTowerLevels.add(new Level(8, 720000, 4 * 1440));
      archerTowerLevels.add(new Level(9, 1500000, 5 * 1440));
      archerTowerLevels.add(new Level(10, 2500000, 6 * 1440));
      archerTowerLevels.add(new Level(11, 5000000, 7 * 1440));

      mortarLevels.add(new Level(1, 8000, 8 * 60));
      mortarLevels.add(new Level(2, 32000, 12 * 60));
      mortarLevels.add(new Level(3, 120000, 1440));
      mortarLevels.add(new Level(4, 400000, 2 * 1440));
      mortarLevels.add(new Level(5, 800000, 4 * 1440));
      mortarLevels.add(new Level(6, 1600000, 5 * 1440));
      mortarLevels.add(new Level(7, 3200000, 7 * 1440));

      wizardTowerLevels.add(new Level(1, 180000, 12 * 60));
      wizardTowerLevels.add(new Level(2, 360000, 1440));
      wizardTowerLevels.add(new Level(3, 720000, 2 * 1440));
      wizardTowerLevels.add(new Level(4, 1280000, 4 * 1440));
      wizardTowerLevels.add(new Level(5, 1960000, 6 * 1440));
      wizardTowerLevels.add(new Level(6, 2680000, 8 * 1440));
      wizardTowerLevels.add(new Level(7, 5360000, 10 * 1440));

      airDefenseLevels.add(new Level(1, 22500, 5 * 60));
      airDefenseLevels.add(new Level(2, 90000, 1440));
      airDefenseLevels.add(new Level(3, 270000, 3 * 1440));
      airDefenseLevels.add(new Level(4, 540000, 5 * 1440));
      airDefenseLevels.add(new Level(5, 1080000, 6 * 1440));
      airDefenseLevels.add(new Level(6, 2160000, 8 * 1440));
      airDefenseLevels.add(new Level(7, 6480000, 10 * 1440));

      hiddenTeslaLevels.add(new Level(1, 1000000, 2 * 1440));
      hiddenTeslaLevels.add(new Level(2, 1250000, 4 * 1440));
      hiddenTeslaLevels.add(new Level(3, 1500000, 6 * 1440));
      hiddenTeslaLevels.add(new Level(4, 2000000, 8 * 1440));
      hiddenTeslaLevels.add(new Level(5, 2500000, 10 * 1440));
      hiddenTeslaLevels.add(new Level(6, 3000000, 12 * 1440));

      xBowLevels.add(new Level(1, 3000000, 7 * 1440));
      xBowLevels.add(new Level(1, 6000000, 10 * 1440));
      xBowLevels.add(new Level(2, 8000000, 14 * 1440));

      elixirCollectorLevels.add(new Level(1, 150, 1));
      elixirCollectorLevels.add(new Level(2, 300, 5));
      elixirCollectorLevels.add(new Level(3, 700, 15));
      elixirCollectorLevels.add(new Level(4, 1400, 60));
      elixirCollectorLevels.add(new Level(5, 3000, 4 * 60));
      elixirCollectorLevels.add(new Level(6, 7000, 12 * 60));
      elixirCollectorLevels.add(new Level(7, 14000, 1440));
      elixirCollectorLevels.add(new Level(8, 28000, 2 * 1440));
      elixirCollectorLevels.add(new Level(9, 56000, 3 * 1440));
      elixirCollectorLevels.add(new Level(10, 84000, 4 * 1440));
      elixirCollectorLevels.add(new Level(11, 168000, 5 * 1440));
      
      goldMineLevels.add(new Level( 1, 150, 1));
      goldMineLevels.add(new Level( 2, 300, 5));
      goldMineLevels.add(new Level( 3, 700, 15));
      goldMineLevels.add(new Level( 4, 1400, 60));
      goldMineLevels.add(new Level( 5, 3000, 4 * 60));
      goldMineLevels.add(new Level( 6, 7000, 12 * 60));
      goldMineLevels.add(new Level( 7, 14000, 1440));
      goldMineLevels.add(new Level( 8, 28000, 2 * 1440));
      goldMineLevels.add(new Level( 9, 56000, 3 * 1440));
      goldMineLevels.add(new Level( 10, 84000, 4 * 1440));
      goldMineLevels.add(new Level( 11, 168000, 5 * 1440));

      darkElixirDrillLevels.add(new Level( 1, 1000000, 1440));
      darkElixirDrillLevels.add(new Level( 2, 2000000, 2 * 1440));
      darkElixirDrillLevels.add(new Level( 3, 3000000, 3 * 1440));
      darkElixirDrillLevels.add(new Level( 4, 4000000, 4 * 1440));
      darkElixirDrillLevels.add(new Level( 5, 6000000, 6 * 1440));
      darkElixirDrillLevels.add(new Level( 6, 8000000, 8 * 1440));

      goldStorageLevels.add(new Level( 1, 300, 15));
      goldStorageLevels.add(new Level( 2, 750, 30));
      goldStorageLevels.add(new Level( 3, 1500, 60));
      goldStorageLevels.add(new Level( 4, 3000, 2 * 60));
      goldStorageLevels.add(new Level( 5, 6000, 3 * 60));
      goldStorageLevels.add(new Level( 6, 12000, 4 * 60));
      goldStorageLevels.add(new Level( 7, 25000, 6 * 60));
      goldStorageLevels.add(new Level( 8, 50000, 8 * 60));
      goldStorageLevels.add(new Level( 9, 100000, 12 * 60));
      goldStorageLevels.add(new Level( 10, 250000, 1440));
      goldStorageLevels.add(new Level( 11, 500000, 2 * 1440));

      elixirStorageLevels.add(new Level( 1, 300, 15));
      elixirStorageLevels.add(new Level( 2, 750, 30));
      elixirStorageLevels.add(new Level( 3, 1500, 60));
      elixirStorageLevels.add(new Level( 4, 3000, 2 * 60));
      elixirStorageLevels.add(new Level( 5, 6000, 3 * 60));
      elixirStorageLevels.add(new Level( 6, 12000, 4 * 60));
      elixirStorageLevels.add(new Level( 7, 25000, 6 * 60));
      elixirStorageLevels.add(new Level( 8, 50000, 8 * 60));
      elixirStorageLevels.add(new Level( 9, 100000, 12 * 60));
      elixirStorageLevels.add(new Level( 10, 250000, 1440));
      elixirStorageLevels.add(new Level( 11, 500000, 2 * 1440));

      darkElixirStorageLevels.add(new Level( 1, 600000, 1440));
      darkElixirStorageLevels.add(new Level( 2, 1200000, 2 * 1440));
      darkElixirStorageLevels.add(new Level( 3, 1800000, 3 * 1440));
      darkElixirStorageLevels.add(new Level( 4, 2400000, 4 * 1440));
      darkElixirStorageLevels.add(new Level( 5, 3000000, 5 * 1440));
      darkElixirStorageLevels.add(new Level( 6, 3600000, 6 * 1440));

      buildersHutLevels.add(new Level( 1, 0, 0));
      buildersHutLevels.add(new Level( 2, 250, 0));
      buildersHutLevels.add(new Level( 3, 500, 0));
      buildersHutLevels.add(new Level( 4, 1000, 0));
      buildersHutLevels.add(new Level( 5, 2000, 0));

      armyCampLevels.add(new Level( 1, 250, 5));
      armyCampLevels.add(new Level( 2, 2500, 60));
      armyCampLevels.add(new Level( 3, 10000, 3 * 60));
      armyCampLevels.add(new Level( 4, 100000, 8 * 60));
      armyCampLevels.add(new Level( 5, 250000, 1440));
      armyCampLevels.add(new Level( 6, 750000, 3 * 1440));
      armyCampLevels.add(new Level( 7, 2250000, 5 * 1440));

      barrackLevels.add(new Level( 1, 200, 1));
      barrackLevels.add(new Level( 2, 1000, 15));
      barrackLevels.add(new Level( 3, 2500, 2 * 60));
      barrackLevels.add(new Level( 4, 5000, 4 * 60));
      barrackLevels.add(new Level( 5, 10000, 10 * 60));
      barrackLevels.add(new Level( 6, 80000, 16 * 60));
      barrackLevels.add(new Level( 7, 240000, 1440));
      barrackLevels.add(new Level( 8, 700000, 2 * 1440));
      barrackLevels.add(new Level( 9, 1500000, 4 * 1440));
      barrackLevels.add(new Level( 10, 2000000, 6 * 1440));

      darkBarrackLevels.add(new Level( 1, 750000, 3 * 1440));
      darkBarrackLevels.add(new Level( 2, 1500000, 5 * 1440));
      darkBarrackLevels.add(new Level( 2, 3000000, 7 * 1440));

      laboratoryLevels.add(new Level( 1, 25000, 30));
      laboratoryLevels.add(new Level( 2, 50000, 5 * 60));
      laboratoryLevels.add(new Level( 3, 90000, 12 * 60));
      laboratoryLevels.add(new Level( 4, 270000, 1440));
      laboratoryLevels.add(new Level( 5, 540000, 2 * 1440));
      laboratoryLevels.add(new Level( 6, 1080000, 4 * 1440));
      laboratoryLevels.add(new Level( 7, 3000000, 5 * 1440));

      spellFactoryLevels.add(new Level( 1, 200000, 1440));
      spellFactoryLevels.add(new Level( 2, 400000, 2 * 1440));
      spellFactoryLevels.add(new Level( 3, 800000, 4 * 1440));
      spellFactoryLevels.add(new Level( 4, 1600000, 5 * 1440));

      townHallLevels.add(new Level( 1, 0, 0));
      townHallLevels.add(new Level( 2, 1000, 5));
      townHallLevels.add(new Level( 3, 4000, 3 * 60));
      townHallLevels.add(new Level( 4, 25000, 1440));
      townHallLevels.add(new Level( 5, 150000, 2 * 1440));
      townHallLevels.add(new Level( 6, 750000, 4 * 1440));
      townHallLevels.add(new Level( 7, 1200000, 6 * 1440));
      townHallLevels.add(new Level( 8, 2000000, 8 * 1440));
      townHallLevels.add(new Level( 9, 4000000, 10 * 1440));

      clanCastleLevels.add(new Level( 1, 40000, 0));
      clanCastleLevels.add(new Level( 2, 100000, 6 * 60));
      clanCastleLevels.add(new Level( 3, 800000, 1440));
      clanCastleLevels.add(new Level( 4, 1800000, 2 * 1440));

      wallLevels.add(new Level(1, 200, 0));
      wallLevels.add(new Level(2, 1000, 0));
      wallLevels.add(new Level(3, 5000, 0));
      wallLevels.add(new Level(4, 10000, 0));
      wallLevels.add(new Level(5, 30000, 0));
      wallLevels.add(new Level(6, 75000, 0));
      wallLevels.add(new Level(7, 200000, 0));
      wallLevels.add(new Level(8, 500000, 0));
      wallLevels.add(new Level(9, 1000000, 0));
      wallLevels.add(new Level(10, 3000000, 0));

      barbarKingLevels.add(new Level( 1, 10000, 0));
      barbarKingLevels.add(new Level( 2, 12500, 12 * 60));
      barbarKingLevels.add(new Level( 3, 15000, 2 * 12 * 60));
      barbarKingLevels.add(new Level( 4, 17500, 3 * 12 * 60));
      barbarKingLevels.add(new Level( 5, 20000, 4 * 12 * 60));
      barbarKingLevels.add(new Level( 6, 22500, 5 * 12 * 60));
      barbarKingLevels.add(new Level( 7, 25000, 6 * 12 * 60));
      barbarKingLevels.add(new Level( 8, 30000, 7 * 12 * 60));
      barbarKingLevels.add(new Level( 9, 35000, 8 * 12 * 60));
      barbarKingLevels.add(new Level( 10, 40000, 9 * 12 * 60));
      barbarKingLevels.add(new Level( 11, 45000, 10 * 12 * 60));
      barbarKingLevels.add(new Level( 12, 50000, 11 * 12 * 60));
      barbarKingLevels.add(new Level( 13, 55000, 12 * 12 * 60));
      barbarKingLevels.add(new Level( 14, 60000, 13 * 12 * 60));
      barbarKingLevels.add(new Level( 15, 65000, 14 * 12 * 60));
      barbarKingLevels.add(new Level( 16, 70000, 15 * 12 * 60));
      barbarKingLevels.add(new Level( 17, 75000, 16 * 12 * 60));
      barbarKingLevels.add(new Level( 18, 80000, 17 * 12 * 60));
      barbarKingLevels.add(new Level( 19, 85000, 18 * 12 * 60));
      barbarKingLevels.add(new Level( 20, 90000, 19 * 12 * 60));
      barbarKingLevels.add(new Level( 21, 100000, 20 * 12 * 60));
      barbarKingLevels.add(new Level( 22, 110000, 21 * 12 * 60));
      barbarKingLevels.add(new Level( 23, 120000, 22 * 12 * 60));
      barbarKingLevels.add(new Level( 24, 130000, 23 * 12 * 60));
      barbarKingLevels.add(new Level( 25, 140000, 24 * 12 * 60));
      barbarKingLevels.add(new Level( 26, 150000, 25 * 12 * 60));
      barbarKingLevels.add(new Level( 27, 160000, 26 * 12 * 60));
      barbarKingLevels.add(new Level( 28, 170000, 27 * 12 * 60));
      barbarKingLevels.add(new Level( 29, 180000, 28 * 12 * 60));
      barbarKingLevels.add(new Level( 30, 190000, 29 * 12 * 60));
      
      archerQueenLevels.add(new Level( 1, 40000, 0));
      archerQueenLevels.add(new Level( 2, 45000, 12 * 60));
      archerQueenLevels.add(new Level( 3, 50000, 2 * 12 * 60));
      archerQueenLevels.add(new Level( 4, 55000, 3 * 12 * 60));
      archerQueenLevels.add(new Level( 5, 60000, 4 * 12 * 60));
      archerQueenLevels.add(new Level( 6, 65000, 5 * 12 * 60));
      archerQueenLevels.add(new Level( 7, 70000, 6 * 12 * 60));
      archerQueenLevels.add(new Level( 8, 75000, 7 * 12 * 60));
      archerQueenLevels.add(new Level( 9, 80000, 8 * 12 * 60));
      archerQueenLevels.add(new Level( 10, 85000, 9 * 12 * 60));
      archerQueenLevels.add(new Level( 11, 90000, 10 * 12 * 60));
      archerQueenLevels.add(new Level( 12, 95000, 11 * 12 * 60));
      archerQueenLevels.add(new Level( 13, 100000, 12 * 12 * 60));
      archerQueenLevels.add(new Level( 14, 105000, 13 * 12 * 60));
      archerQueenLevels.add(new Level( 15, 110000, 14 * 12 * 60));
      archerQueenLevels.add(new Level( 16, 115000, 15 * 12 * 60));
      archerQueenLevels.add(new Level( 17, 120000, 16 * 12 * 60));
      archerQueenLevels.add(new Level( 18, 125000, 17 * 12 * 60));
      archerQueenLevels.add(new Level( 19, 130000, 18 * 12 * 60));
      archerQueenLevels.add(new Level( 20, 135000, 19 * 12 * 60));
      archerQueenLevels.add(new Level( 21, 140000, 20 * 12 * 60));
      archerQueenLevels.add(new Level( 22, 145000, 21 * 12 * 60));
      archerQueenLevels.add(new Level( 23, 150000, 22 * 12 * 60));
      archerQueenLevels.add(new Level( 24, 155000, 23 * 12 * 60));
      archerQueenLevels.add(new Level( 25, 160000, 24 * 12 * 60));
      archerQueenLevels.add(new Level( 26, 165000, 25 * 12 * 60));
      archerQueenLevels.add(new Level( 27, 170000, 26 * 12 * 60));
      archerQueenLevels.add(new Level( 28, 175000, 27 * 12 * 60));
      archerQueenLevels.add(new Level( 29, 180000, 28 * 12 * 60));
      archerQueenLevels.add(new Level( 30, 190000, 29 * 12 * 60));
   }

   public static Integer getMaxAvailable(BuildingType type, Integer villageLevel){
      switch (villageLevel){
         case 9:
            switch (type){
               case CANNON: return 5;
               case ARCHER_TOWER: return 6;
               case MORTAR: return 3;
               case WIZARD_TOWER: return 3;
               case AIR_DEFENSE: return 3;
               case HIDDEN_TESLA: return 4;
               case XBOW: return 2;
               case ELIXIR_COLLECTOR: return 6;
               case GOLD_MINE: return 6;
               case DARK_ELIXIR_DRILL: return 2;
               case GOLD_STORAGE: return 4;
               case ELIXIR_STORAGE: return 4;
               case DARK_ELIXIR_STORAGE: return 1;
               case BUILDERS_HUT: return 1;
               case ARMY_CAMP: return 4;
               case BARRACK: return 4;
               case DARK_BARRACK: return 2;
               case LABORATORY: return 1;
               case SPELL_FACTORY: return 1;
               case TOWN_HALL: return 1;
               case CLAN_CASTLE: return 1;
               case WALL: return 250;
               case BARBAR_KING: return 1;
               case ARCHER_QUENN: return 1;
               default : throw new IllegalArgumentException(type + " tipinde bozukluk var.");
            }
      }
      return 0;
   }

   public static List<? extends Level> getLevels(BuildingType type) {
      switch (type){
         case CANNON: return cannonLevels;
         case ARCHER_TOWER: return archerTowerLevels;
         case MORTAR: return mortarLevels;
         case WIZARD_TOWER: return wizardTowerLevels;
         case AIR_DEFENSE: return airDefenseLevels;
         case HIDDEN_TESLA: return hiddenTeslaLevels;
         case XBOW: return xBowLevels;
         case GOLD_MINE: return goldMineLevels;
         case ELIXIR_COLLECTOR: return elixirCollectorLevels;
         case DARK_ELIXIR_DRILL: return darkElixirDrillLevels;
         case GOLD_STORAGE: return goldStorageLevels;
         case ELIXIR_STORAGE: return elixirStorageLevels;
         case DARK_ELIXIR_STORAGE: return darkElixirStorageLevels;
         case BUILDERS_HUT: return buildersHutLevels;
         case ARMY_CAMP: return armyCampLevels;
         case BARRACK: return barrackLevels;
         case DARK_BARRACK: return darkBarrackLevels;
         case LABORATORY: return laboratoryLevels;
         case SPELL_FACTORY: return spellFactoryLevels;
         case TOWN_HALL: return townHallLevels;
         case CLAN_CASTLE: return clanCastleLevels;
         case WALL: return wallLevels;
         case BARBAR_KING: return barbarKingLevels;
         case ARCHER_QUENN: return archerQueenLevels;
         default : throw new IllegalArgumentException(type + " tipinde bozukluk var.");
      }
   }
}
