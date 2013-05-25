package ob.cochelper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
   private static final List<Level> airDefenseLevels = new ArrayList<Level>(8);
   private static final List<Level> hiddenTeslaLevels = new ArrayList<Level>(7);
   private static final List<Level> xBowLevels = new ArrayList<Level>(4);
   private static final List<Level> infernoTowerLevels = new ArrayList<Level>(2);

   private static final List<ResourceLevel> elixirCollectorLevels = new ArrayList<ResourceLevel>(11);
   private static final List<ResourceLevel> goldMineLevels = new ArrayList<ResourceLevel>(11);
   private static final List<ResourceLevel> darkElixirDrillLevels = new ArrayList<ResourceLevel>(6);
   private static final List<Level> goldStorageLevels = new ArrayList<Level>(11);
   private static final List<Level> elixirStorageLevels = new ArrayList<Level>(11);
   private static final List<Level> darkElixirStorageLevels = new ArrayList<Level>(6);
   private static final List<Level> buildersHutLevels = new ArrayList<Level>(1);
   private static final List<Level> armyCampLevels = new ArrayList<Level>(7);
   private static final List<Level> barrackLevels = new ArrayList<Level>(10);
   private static final List<Level> darkBarrackLevels = new ArrayList<Level>(4);
   private static final List<Level> laboratoryLevels = new ArrayList<Level>(8);
   private static final List<Level> spellFactoryLevels = new ArrayList<Level>(4);
   private static final List<Level> townHallLevels = new ArrayList<Level>(10);
   private static final List<Level> clanCastleLevels = new ArrayList<Level>(5);
   private static final List<Level> wallLevels = new ArrayList<Level>(10);

   private static final List<Level> barbarKingLevels = new ArrayList<Level>(40);
   private static final List<Level> archerQueenLevels = new ArrayList<Level>(40);

   static{
      cannonLevels.add(new Level(1, 400, 250, 1, 1));
      cannonLevels.add(new Level(2, 450, 1000, 15, 1));
      cannonLevels.add(new Level(3, 500, 4000, 45, 2));
      cannonLevels.add(new Level(4, 550, 16000, 2 * 60, 3));
      cannonLevels.add(new Level(5, 590, 50000, 6 * 60, 4));
      cannonLevels.add(new Level(6, 610, 100000, 12 * 60, 5));
      cannonLevels.add(new Level(7, 630, 200000, (int)TimeUnit.DAYS.toMinutes(1), 6));
      cannonLevels.add(new Level(8, 660, 400000, (int)TimeUnit.DAYS.toMinutes(2), 7));
      cannonLevels.add(new Level(9, 690, 800000, (int)TimeUnit.DAYS.toMinutes(3), 8));
      cannonLevels.add(new Level(10, 750, 1600000, (int)TimeUnit.DAYS.toMinutes(4), 8));
      cannonLevels.add(new Level(11, 900, 3200000, (int)TimeUnit.DAYS.toMinutes(5), 9));

      archerTowerLevels.add(new Level(1, 400, 1000, 15, 2));
      archerTowerLevels.add(new Level(2, 450, 2000, 30, 2));
      archerTowerLevels.add(new Level(3, 500, 5000, 45, 3));
      archerTowerLevels.add(new Level(4, 550, 20000, 4 * 60, 4));
      archerTowerLevels.add(new Level(5, 590, 80000, 12 * 60, 5));
      archerTowerLevels.add(new Level(6, 610, 180000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      archerTowerLevels.add(new Level(7, 630, 360000, (int)TimeUnit.DAYS.toMinutes(3), 6));
      archerTowerLevels.add(new Level(8, 660, 720000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      archerTowerLevels.add(new Level(9, 690, 1500000, (int)TimeUnit.DAYS.toMinutes(5), 8));
      archerTowerLevels.add(new Level(10, 720, 2500000, (int)TimeUnit.DAYS.toMinutes(6), 8));
      archerTowerLevels.add(new Level(11, 750, 5000000, (int)TimeUnit.DAYS.toMinutes(7), 9));

      mortarLevels.add(new Level(1, 400, 8000, 8 * 60, 3));
      mortarLevels.add(new Level(2, 450, 32000, 12 * 60, 4));
      mortarLevels.add(new Level(3, 500, 120000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      mortarLevels.add(new Level(4, 550, 400000, (int)TimeUnit.DAYS.toMinutes(2), 6));
      mortarLevels.add(new Level(5, 590, 800000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      mortarLevels.add(new Level(6, 610, 1600000, (int)TimeUnit.DAYS.toMinutes(5), 8));
      mortarLevels.add(new Level(7, 640, 3200000, (int)TimeUnit.DAYS.toMinutes(7), 9));

      wizardTowerLevels.add(new Level(1, 620, 180000, 12 * 60, 5));
      wizardTowerLevels.add(new Level(2, 660, 360000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      wizardTowerLevels.add(new Level(3, 690, 720000, (int)TimeUnit.DAYS.toMinutes(2), 6));
      wizardTowerLevels.add(new Level(4, 720, 1280000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      wizardTowerLevels.add(new Level(5, 760, 1960000, (int)TimeUnit.DAYS.toMinutes(6), 8));
      wizardTowerLevels.add(new Level(6, 800, 2680000, (int)TimeUnit.DAYS.toMinutes(8), 8));
      wizardTowerLevels.add(new Level(7, 840, 5360000, (int)TimeUnit.DAYS.toMinutes(10), 9));

      airDefenseLevels.add(new Level(1, 800, 22500, 5 * 60, 4));
      airDefenseLevels.add(new Level(2, 860, 90000, (int)TimeUnit.DAYS.toMinutes(1), 4));
      airDefenseLevels.add(new Level(3, 900, 270000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      airDefenseLevels.add(new Level(4, 940, 540000, (int)TimeUnit.DAYS.toMinutes(5), 6));
      airDefenseLevels.add(new Level(5, 990, 1080000, (int)TimeUnit.DAYS.toMinutes(6), 7));
      airDefenseLevels.add(new Level(6, 1040, 2160000, (int)TimeUnit.DAYS.toMinutes(8), 8));
      airDefenseLevels.add(new Level(7, 1100, 4320000, (int)TimeUnit.DAYS.toMinutes(10), 9));
      airDefenseLevels.add(new Level(8, 1160, 7560000, (int)TimeUnit.DAYS.toMinutes(12), 10));

      hiddenTeslaLevels.add(new Level(1, 600, 1000000, (int)TimeUnit.DAYS.toMinutes(2), 7));
      hiddenTeslaLevels.add(new Level(2, 630, 1250000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      hiddenTeslaLevels.add(new Level(3, 660, 1500000, (int)TimeUnit.DAYS.toMinutes(6), 7));
      hiddenTeslaLevels.add(new Level(4, 690, 2000000, (int)TimeUnit.DAYS.toMinutes(8), 8));
      hiddenTeslaLevels.add(new Level(5, 730, 2500000, (int)TimeUnit.DAYS.toMinutes(10), 8));
      hiddenTeslaLevels.add(new Level(6, 770, 3000000, (int)TimeUnit.DAYS.toMinutes(12), 8));
      hiddenTeslaLevels.add(new Level(7, 810, 3500000, (int)TimeUnit.DAYS.toMinutes(14), 9));

      xBowLevels.add(new Level(1, 1500, 3000000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      xBowLevels.add(new Level(1, 1900, 6000000, (int)TimeUnit.DAYS.toMinutes(10), 9));
      xBowLevels.add(new Level(2, 2400, 8000000, (int)TimeUnit.DAYS.toMinutes(14), 9));

      infernoTowerLevels.add(new Level(1, 1500, 5000000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      infernoTowerLevels.add(new Level(1, 1900, 8000000, (int)TimeUnit.DAYS.toMinutes(10), 10));

      elixirCollectorLevels.add(new ResourceLevel(1, 400, 150, 1, 1, 500, 200));
      elixirCollectorLevels.add(new ResourceLevel(2, 450, 300, 5, 1, 1000, 400));
      elixirCollectorLevels.add(new ResourceLevel(3, 500, 700, 15, 2, 1500, 600));
      elixirCollectorLevels.add(new ResourceLevel(4, 550, 1400, 60, 2, 2500, 800));
      elixirCollectorLevels.add(new ResourceLevel(5, 590, 3000, 4 * 60, 3, 10000, 1000));
      elixirCollectorLevels.add(new ResourceLevel(6, 610, 7000, 12 * 60, 3, 20000, 1300));
      elixirCollectorLevels.add(new ResourceLevel(7, 630, 14000, (int)TimeUnit.DAYS.toMinutes(1), 4, 30000, 1600));
      elixirCollectorLevels.add(new ResourceLevel(8, 660, 28000, (int)TimeUnit.DAYS.toMinutes(2), 4, 50000, 1900));
      elixirCollectorLevels.add(new ResourceLevel(9, 680, 56000, (int)TimeUnit.DAYS.toMinutes(3), 5, 75000, 2200));
      elixirCollectorLevels.add(new ResourceLevel(10, 710, 84000, (int)TimeUnit.DAYS.toMinutes(4), 5, 100000, 2500));
      elixirCollectorLevels.add(new ResourceLevel(11, 750, 168000, (int)TimeUnit.DAYS.toMinutes(5), 7, 150000, 3000));
      
      goldMineLevels.add(new ResourceLevel(1, 400, 150, 1, 1, 500, 200));
      goldMineLevels.add(new ResourceLevel(2, 450, 300, 5, 1, 1000, 400));
      goldMineLevels.add(new ResourceLevel(3, 500, 700, 15, 2, 1500, 600));
      goldMineLevels.add(new ResourceLevel(4, 550, 1400, 60, 2, 2500, 800));
      goldMineLevels.add(new ResourceLevel(5, 590, 3000, 4 * 60, 3, 10000, 1000));
      goldMineLevels.add(new ResourceLevel(6, 610, 7000, 12 * 60, 3, 20000, 1300));
      goldMineLevels.add(new ResourceLevel(7, 630, 14000, (int)TimeUnit.DAYS.toMinutes(1), 4, 30000, 1600));
      goldMineLevels.add(new ResourceLevel(8, 660, 28000, (int)TimeUnit.DAYS.toMinutes(2), 4, 50000, 1900));
      goldMineLevels.add(new ResourceLevel(9, 680, 56000, (int)TimeUnit.DAYS.toMinutes(3), 5, 75000, 2200));
      goldMineLevels.add(new ResourceLevel(10, 710, 84000, (int)TimeUnit.DAYS.toMinutes(4), 5, 100000, 2500));
      goldMineLevels.add(new ResourceLevel(11, 750, 168000, (int)TimeUnit.DAYS.toMinutes(5), 7, 150000, 3000));

      darkElixirDrillLevels.add(new ResourceLevel(1, 400, 1000000, (int)TimeUnit.DAYS.toMinutes(1), 8, 120, 20));
      darkElixirDrillLevels.add(new ResourceLevel(2, 480, 1500000, (int)TimeUnit.DAYS.toMinutes(2), 8, 240, 30));
      darkElixirDrillLevels.add(new ResourceLevel(3, 580, 2000000, (int)TimeUnit.DAYS.toMinutes(3), 8, 450, 45));
      darkElixirDrillLevels.add(new ResourceLevel(4, 690, 3000000, (int)TimeUnit.DAYS.toMinutes(4), 9, 720, 60));
      darkElixirDrillLevels.add(new ResourceLevel(5, 830, 4000000, (int)TimeUnit.DAYS.toMinutes(6), 9, 1120, 80));
      darkElixirDrillLevels.add(new ResourceLevel(6, 1000, 5000000, (int)TimeUnit.DAYS.toMinutes(8), 9, 1600, 100));

      goldStorageLevels.add(new ResourceLevel(1, 400, 300, 151, 1, 1500, 0));
      goldStorageLevels.add(new ResourceLevel(2, 600, 750, 30, 2, 3000, 0));
      goldStorageLevels.add(new ResourceLevel(3, 800, 1500, 60, 2, 6000, 0));
      goldStorageLevels.add(new ResourceLevel(4, 1000, 3000, 2 * 60, 3, 12000, 0));
      goldStorageLevels.add(new ResourceLevel(5, 1200, 6000, 3 * 60, 3, 25000, 0));
      goldStorageLevels.add(new ResourceLevel(6, 1500, 12000, 4 * 60, 3, 50000, 0));
      goldStorageLevels.add(new ResourceLevel(7, 1650, 25000, 6 * 60, 4, 100000, 0));
      goldStorageLevels.add(new ResourceLevel(8, 1740, 50000, 8 * 60, 4, 250000, 0));
      goldStorageLevels.add(new ResourceLevel(9, 1820, 100000, 12 * 60, 5, 500000, 0));
      goldStorageLevels.add(new ResourceLevel(10, 1920, 250000, (int)TimeUnit.DAYS.toMinutes(1), 6, 1000000, 0));
      goldStorageLevels.add(new ResourceLevel(11, 2016, 500000, (int)TimeUnit.DAYS.toMinutes(2), 7, 2000000, 0));

      elixirStorageLevels.add(new ResourceLevel(1, 400, 300, 15, 1, 1500, 0));
      elixirStorageLevels.add(new ResourceLevel(2, 600, 750, 30, 2, 3000, 0));
      elixirStorageLevels.add(new ResourceLevel(3, 800, 1500, 60, 2, 6000, 0));
      elixirStorageLevels.add(new ResourceLevel(4, 1000, 3000, 2 * 60, 3, 12000, 0));
      elixirStorageLevels.add(new ResourceLevel(5, 1200, 6000, 3 * 60, 3, 25000, 0));
      elixirStorageLevels.add(new ResourceLevel(6, 1500, 12000, 4 * 60, 3, 50000, 0));
      elixirStorageLevels.add(new ResourceLevel(7, 1650, 25000, 6 * 60, 4, 100000, 0));
      elixirStorageLevels.add(new ResourceLevel(8, 1740, 50000, 8 * 60, 4, 250000, 0));
      elixirStorageLevels.add(new ResourceLevel(9, 1820, 100000, 12 * 60, 5, 500000, 0));
      elixirStorageLevels.add(new ResourceLevel(10, 1920, 250000, (int)TimeUnit.DAYS.toMinutes(1), 6, 1000000, 0));
      elixirStorageLevels.add(new ResourceLevel(11, 2016, 500000, (int)TimeUnit.DAYS.toMinutes(2), 7, 2000000, 0));

      darkElixirStorageLevels.add(new ResourceLevel(1, 1500, 600000, 1440, 7, 10000, 0));
      darkElixirStorageLevels.add(new ResourceLevel(2, 1650, 1200000, (int)TimeUnit.DAYS.toMinutes(1), 7, 20000, 0));
      darkElixirStorageLevels.add(new ResourceLevel(3, 2000, 1800000, (int)TimeUnit.DAYS.toMinutes(3), 8, 40000, 0));
      darkElixirStorageLevels.add(new ResourceLevel(4, 2200, 2400000, (int)TimeUnit.DAYS.toMinutes(4), 8, 80000, 0));
      darkElixirStorageLevels.add(new ResourceLevel(5, 2400, 3000000, (int)TimeUnit.DAYS.toMinutes(5), 9, 150000, 0));
      darkElixirStorageLevels.add(new ResourceLevel(6, 2650, 3600000, (int)TimeUnit.DAYS.toMinutes(6), 9, 200000, 0));

      buildersHutLevels.add(new Level(1, 250, 0, 0, 1));
      buildersHutLevels.add(new Level(2, 250, 250, 0, 1));
      buildersHutLevels.add(new Level(3, 250, 500, 0, 1));
      buildersHutLevels.add(new Level(4, 250, 1000, 0, 1));
      buildersHutLevels.add(new Level(5, 250, 2000, 0, 1));

      armyCampLevels.add(new Level(1, 400, 250, 5, 1));
      armyCampLevels.add(new Level(2, 500, 2500, 60, 2));
      armyCampLevels.add(new Level(3, 600, 10000, 3 * 60, 3));
      armyCampLevels.add(new Level(4, 700, 100000, 8 * 60, 4));
      armyCampLevels.add(new Level(5, 800, 250000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      armyCampLevels.add(new Level(6, 1000, 750000, (int)TimeUnit.DAYS.toMinutes(3), 6));
      armyCampLevels.add(new Level(7, 1200, 2250000, (int)TimeUnit.DAYS.toMinutes(5), 9));

      barrackLevels.add(new Level(1, 250, 200, 1, 1));
      barrackLevels.add(new Level(2, 270, 1000, 15, 1));
      barrackLevels.add(new Level(3, 280, 2500, 2 * 60, 1));
      barrackLevels.add(new Level(4, 290, 5000, 4 * 60, 2));
      barrackLevels.add(new Level(5, 310, 10000, 10 * 60, 3));
      barrackLevels.add(new Level(6, 320, 80000, 16 * 60, 4));
      barrackLevels.add(new Level(7, 340, 240000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      barrackLevels.add(new Level(8, 350, 700000, (int)TimeUnit.DAYS.toMinutes(2), 6));
      barrackLevels.add(new Level(9, 390, 1500000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      barrackLevels.add(new Level(10, 420, 2000000, (int)TimeUnit.DAYS.toMinutes(6), 8));

      darkBarrackLevels.add(new Level(1, 250, 750000, (int)TimeUnit.DAYS.toMinutes(3), 7));
      darkBarrackLevels.add(new Level(2, 300, 1500000, (int)TimeUnit.DAYS.toMinutes(5), 7));
      darkBarrackLevels.add(new Level(3, 350, 3000000, (int)TimeUnit.DAYS.toMinutes(6), 8));
      darkBarrackLevels.add(new Level(4, 400, 4000000, (int)TimeUnit.DAYS.toMinutes(7), 8));

      laboratoryLevels.add(new Level(1, 250, 25000, 30, 3));
      laboratoryLevels.add(new Level(2, 271, 50000, 5 * 60, 4));
      laboratoryLevels.add(new Level(3, 280, 90000, 12 * 60, 5));
      laboratoryLevels.add(new Level(4, 290, 270000, (int)TimeUnit.DAYS.toMinutes(1), 6));
      laboratoryLevels.add(new Level(5, 310, 500000, (int)TimeUnit.DAYS.toMinutes(2), 7));
      laboratoryLevels.add(new Level(6, 330, 1000000, (int)TimeUnit.DAYS.toMinutes(4), 8));
      laboratoryLevels.add(new Level(7, 350, 2500000, (int)TimeUnit.DAYS.toMinutes(5), 9));
      laboratoryLevels.add(new Level(8, 370, 4000000, (int)TimeUnit.DAYS.toMinutes(6), 9));

      spellFactoryLevels.add(new Level(1, 200, 200000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      spellFactoryLevels.add(new Level(2, 300, 400000, (int)TimeUnit.DAYS.toMinutes(2), 6));
      spellFactoryLevels.add(new Level(3, 400, 800000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      spellFactoryLevels.add(new Level(4, 500, 1600000, (int)TimeUnit.DAYS.toMinutes(5), 9));

      townHallLevels.add(new Level(1, 1500, 0, 0, 0));
      townHallLevels.add(new Level(2, 1600, 1000, 5, 1));
      townHallLevels.add(new Level(3, 1850, 4000, 3 * 60, 2));
      townHallLevels.add(new Level(4, 2100, 25000, (int)TimeUnit.DAYS.toMinutes(1), 3));
      townHallLevels.add(new Level(5, 2400, 150000, (int)TimeUnit.DAYS.toMinutes(2), 4));
      townHallLevels.add(new Level(6, 2800, 750000, (int)TimeUnit.DAYS.toMinutes(4), 5));
      townHallLevels.add(new Level(7, 3200, 1200000, (int)TimeUnit.DAYS.toMinutes(6), 6));
      townHallLevels.add(new Level(8, 3700, 2000000, (int)TimeUnit.DAYS.toMinutes(8), 7));
      townHallLevels.add(new Level(9, 4200, 3000000, (int)TimeUnit.DAYS.toMinutes(10), 8));
      townHallLevels.add(new Level(10, 5000, 4000000, (int)TimeUnit.DAYS.toMinutes(14), 9));

      clanCastleLevels.add(new Level(1, 1000, 40000, 0, 3));
      clanCastleLevels.add(new Level(2, 1400, 100000, 6 * 60, 4));
      clanCastleLevels.add(new Level(3, 2000, 800000, (int)TimeUnit.DAYS.toMinutes(1), 6));
      clanCastleLevels.add(new Level(4, 2600, 1800000, (int)TimeUnit.DAYS.toMinutes(2), 8));
      clanCastleLevels.add(new Level(5, 3000, 7000000, (int)TimeUnit.DAYS.toMinutes(7), 9));

      wallLevels.add(new Level(1, 300, 200, 0, 2));
      wallLevels.add(new Level(2, 500, 1000, 0, 2));
      wallLevels.add(new Level(3, 700, 5000, 0, 3));
      wallLevels.add(new Level(4, 900, 10000, 0, 4));
      wallLevels.add(new Level(5, 1400, 30000, 0, 5));
      wallLevels.add(new Level(6, 2000, 75000, 0, 6));
      wallLevels.add(new Level(7, 2500, 200000, 0, 7));
      wallLevels.add(new Level(8, 3000, 500000, 0, 8));
      wallLevels.add(new Level(9, 4000, 1000000, 0, 9));
      wallLevels.add(new Level(10, 5500, 3000000, 0, 9));

      barbarKingLevels.add(new Level(1, 1500, 10000, 0, 7));
      barbarKingLevels.add(new Level(2, 1560, 12500, 12 * 60, 7));
      barbarKingLevels.add(new Level(3, 1622, 15000, 2 * 12 * 60, 7));
      barbarKingLevels.add(new Level(4, 1687, 17500, 3 * 12 * 60, 7));
      barbarKingLevels.add(new Level(5, 1755, 20000, 4 * 12 * 60, 7));
      barbarKingLevels.add(new Level(6, 1825, 22500, 5 * 12 * 60, 8));
      barbarKingLevels.add(new Level(7, 1898, 25000, 6 * 12 * 60, 8));
      barbarKingLevels.add(new Level(8, 1974, 30000, 7 * 12 * 60, 8));
      barbarKingLevels.add(new Level(9, 2053, 35000, 8 * 12 * 60, 8));
      barbarKingLevels.add(new Level(10, 2135, 40000, 9 * 12 * 60, 8));
      barbarKingLevels.add(new Level(11, 2200, 45000, 10 * 12 * 60, 9));
      barbarKingLevels.add(new Level(12, 2309, 50000, 11 * 12 * 60, 9));
      barbarKingLevels.add(new Level(13, 2402, 55000, 12 * 12 * 60, 9));
      barbarKingLevels.add(new Level(14, 2498, 60000, 13 * 12 * 60, 9));
      barbarKingLevels.add(new Level(15, 2598, 65000, 14 * 12 * 60, 9));
      barbarKingLevels.add(new Level(16, 2701, 70000, 15 * 12 * 60, 9));
      barbarKingLevels.add(new Level(17, 2809, 75000, 16 * 12 * 60, 9));
      barbarKingLevels.add(new Level(18, 2922, 80000, 17 * 12 * 60, 9));
      barbarKingLevels.add(new Level(19, 3039, 85000, 18 * 12 * 60, 9));
      barbarKingLevels.add(new Level(20, 3160, 90000, 19 * 12 * 60, 9));
      barbarKingLevels.add(new Level(21, 3287, 100000, 20 * 12 * 60, 9));
      barbarKingLevels.add(new Level(22, 3418, 110000, 21 * 12 * 60, 9));
      barbarKingLevels.add(new Level(23, 3555, 115000, 22 * 12 * 60, 9));
      barbarKingLevels.add(new Level(24, 3697, 120000, 23 * 12 * 60, 9));
      barbarKingLevels.add(new Level(25, 3845, 125000, 24 * 12 * 60, 9));
      barbarKingLevels.add(new Level(26, 3999, 130000, 25 * 12 * 60, 9));
      barbarKingLevels.add(new Level(27, 4159, 135000, 26 * 12 * 60, 9));
      barbarKingLevels.add(new Level(28, 4325, 140000, 27 * 12 * 60, 9));
      barbarKingLevels.add(new Level(29, 4498, 145000, 28 * 12 * 60, 9));
      barbarKingLevels.add(new Level(30, 4000, 150000, 29 * 12 * 60, 10));
      barbarKingLevels.add(new Level(31, 4000, 155000, 30 * 12 * 60, 10));
      barbarKingLevels.add(new Level(32, 4000, 160000, 31 * 12 * 60, 10));
      barbarKingLevels.add(new Level(33, 4000, 165000, 32 * 12 * 60, 10));
      barbarKingLevels.add(new Level(34, 4000, 170000, 33 * 12 * 60, 10));
      barbarKingLevels.add(new Level(35, 4000, 175000, 34 * 12 * 60, 10));
      barbarKingLevels.add(new Level(36, 4000, 180000, 35 * 12 * 60, 10));
      barbarKingLevels.add(new Level(37, 4000, 185000, 36 * 12 * 60, 10));
      barbarKingLevels.add(new Level(38, 4000, 190000, 37 * 12 * 60, 10));
      barbarKingLevels.add(new Level(39, 4000, 195000, 38 * 12 * 60, 10));
      barbarKingLevels.add(new Level(40, 4000, 200000, 39 * 12 * 60, 10));

      archerQueenLevels.add(new Level(1, 675, 40000, 0, 9));
      archerQueenLevels.add(new Level(2, 702, 22500, 12 * 60, 9));
      archerQueenLevels.add(new Level(3, 730, 25000, 2 * 12 * 60, 9));
      archerQueenLevels.add(new Level(4, 759, 27500, 3 * 12 * 60, 9));
      archerQueenLevels.add(new Level(5, 790, 30000, 4 * 12 * 60, 9));
      archerQueenLevels.add(new Level(6, 821, 32500, 5 * 12 * 60, 9));
      archerQueenLevels.add(new Level(7, 854, 35000, 6 * 12 * 60, 9));
      archerQueenLevels.add(new Level(8, 888, 37500, 7 * 12 * 60, 9));
      archerQueenLevels.add(new Level(9, 924, 40000, 8 * 12 * 60, 9));
      archerQueenLevels.add(new Level(10, 961, 42500, 9 * 12 * 60, 9));
      archerQueenLevels.add(new Level(11, 999, 45000, 10 * 12 * 60, 9));
      archerQueenLevels.add(new Level(12, 1039, 47500, 11 * 12 * 60, 9));
      archerQueenLevels.add(new Level(13, 1081, 50000, 12 * 12 * 60, 9));
      archerQueenLevels.add(new Level(14, 1124, 52500, 13 * 12 * 60, 9));
      archerQueenLevels.add(new Level(15, 1169, 55000, 14 * 12 * 60, 9));
      archerQueenLevels.add(new Level(16, 1215, 57500, 15 * 12 * 60, 9));
      archerQueenLevels.add(new Level(17, 1264, 60000, 16 * 12 * 60, 9));
      archerQueenLevels.add(new Level(18, 1315, 62500, 17 * 12 * 60, 9));
      archerQueenLevels.add(new Level(19, 1368, 65000, 18 * 12 * 60, 9));
      archerQueenLevels.add(new Level(20, 1422, 67500, 19 * 12 * 60, 9));
      archerQueenLevels.add(new Level(21, 1479, 70000, 20 * 12 * 60, 9));
      archerQueenLevels.add(new Level(22, 1538, 72500, 21 * 12 * 60, 9));
      archerQueenLevels.add(new Level(23, 1600, 75000, 22 * 12 * 60, 9));
      archerQueenLevels.add(new Level(24, 1664, 77500, 23 * 12 * 60, 9));
      archerQueenLevels.add(new Level(25, 1730, 80000, 24 * 12 * 60, 9));
      archerQueenLevels.add(new Level(26, 1800, 82500, 25 * 12 * 60, 9));
      archerQueenLevels.add(new Level(27, 1872, 85000, 26 * 12 * 60, 9));
      archerQueenLevels.add(new Level(28, 1946, 87500, 27 * 12 * 60, 9));
      archerQueenLevels.add(new Level(29, 2024, 90000, 28 * 12 * 60, 9));
      archerQueenLevels.add(new Level(30, 2105, 95000, 29 * 12 * 60, 9));
      archerQueenLevels.add(new Level(31, 2000, 100000, 30 * 12 * 60, 10));
      archerQueenLevels.add(new Level(32, 2000, 110000, 31 * 12 * 60, 10));
      archerQueenLevels.add(new Level(33, 2000, 120000, 32 * 12 * 60, 10));
      archerQueenLevels.add(new Level(34, 2000, 130000, 33 * 12 * 60, 10));
      archerQueenLevels.add(new Level(35, 2000, 140000, 34 * 12 * 60, 10));
      archerQueenLevels.add(new Level(36, 2000, 150000, 35 * 12 * 60, 10));
      archerQueenLevels.add(new Level(37, 2000, 160000, 36 * 12 * 60, 10));
      archerQueenLevels.add(new Level(38, 2000, 170000, 37 * 12 * 60, 10));
      archerQueenLevels.add(new Level(39, 2000, 180000, 38 * 12 * 60, 10));
      archerQueenLevels.add(new Level(40, 2000, 190000, 39 * 12 * 60, 10));
   }

   public static Integer getMaxAvailable(BuildingType type, Integer villageLevel){
      switch (villageLevel){
         case 9:
            switch (type){
               case CANNON: return 5;
               case ARCHER_TOWER: return 6;
               case MORTAR: return 3;
               case WIZARD_TOWER: return 4;
               case AIR_DEFENSE: return 4;
               case HIDDEN_TESLA: return 4;
               case XBOW: return 2;
               case INFERNO_TOWER: return 0;
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
         case 10:
            switch (type){
               case CANNON: return 6;
               case ARCHER_TOWER: return 7;
               case MORTAR: return 3;
               case WIZARD_TOWER: return 4;
               case AIR_DEFENSE: return 4;
               case HIDDEN_TESLA: return 4;
               case XBOW: return 2;
               case INFERNO_TOWER: return 1;
               case ELIXIR_COLLECTOR: return 6;
               case GOLD_MINE: return 6;
               case DARK_ELIXIR_DRILL: return 3;
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
         case INFERNO_TOWER: return infernoTowerLevels;
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
