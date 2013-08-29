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
   
   private static final List<Level> cannonLevels = new ArrayList<Level>(12);
   private static final List<Level> archerTowerLevels = new ArrayList<Level>(11);
   private static final List<Level> mortarLevels = new ArrayList<Level>(7);
   private static final List<Level> wizardTowerLevels = new ArrayList<Level>(8);
   private static final List<Level> airDefenseLevels = new ArrayList<Level>(8);
   private static final List<Level> hiddenTeslaLevels = new ArrayList<Level>(7);
   private static final List<Level> xBowLevels = new ArrayList<Level>(4);
   private static final List<Level> infernoTowerLevels = new ArrayList<Level>(2);

   private static final List<Level> elixirCollectorLevels = new ArrayList<Level>(11);
   private static final List<Level> goldMineLevels = new ArrayList<Level>(11);
   private static final List<Level> darkElixirDrillLevels = new ArrayList<Level>(6);
   private static final List<Level> goldStorageLevels = new ArrayList<Level>(11);
   private static final List<Level> elixirStorageLevels = new ArrayList<Level>(11);
   private static final List<Level> darkElixirStorageLevels = new ArrayList<Level>(6);
   private static final List<Level> buildersHutLevels = new ArrayList<Level>(1);
   private static final List<Level> armyCampLevels = new ArrayList<Level>(8);
   private static final List<Level> barrackLevels = new ArrayList<Level>(10);
   private static final List<Level> darkBarrackLevels = new ArrayList<Level>(4);
   private static final List<Level> laboratoryLevels = new ArrayList<Level>(8);
   private static final List<Level> spellFactoryLevels = new ArrayList<Level>(5);
   private static final List<Level> townHallLevels = new ArrayList<Level>(10);
   private static final List<Level> clanCastleLevels = new ArrayList<Level>(5);
   private static final List<Level> wallLevels = new ArrayList<Level>(11);

   private static final List<Level> barbarKingLevels = new ArrayList<Level>(40);
   private static final List<Level> archerQueenLevels = new ArrayList<Level>(40);

   private static final List<Level> barbarianLevels = new ArrayList<Level>(6);
   private static final List<Level> archerLevels = new ArrayList<Level>(6);
   private static final List<Level> goblinLevels = new ArrayList<Level>(5);
   private static final List<Level> giantLevels = new ArrayList<Level>(6);
   private static final List<Level> wallBreakerLevels = new ArrayList<Level>(5);
   private static final List<Level> balloonLevels = new ArrayList<Level>(6);
   private static final List<Level> wizardLevels = new ArrayList<Level>(6);
   private static final List<Level> healerLevels = new ArrayList<Level>(4);
   private static final List<Level> dragonLevels = new ArrayList<Level>(4);
   private static final List<Level> pekkaLevels = new ArrayList<Level>(3);

   private static final List<Level> lighteningSpellLevels = new ArrayList<Level>(5);
   private static final List<Level> healingSpellLevels = new ArrayList<Level>(5);
   private static final List<Level> rageSpellLevels = new ArrayList<Level>(5);
   private static final List<Level> jumpSpellLevels = new ArrayList<Level>(2);
   private static final List<Level> santasSupriseSpellLevels = new ArrayList<Level>(1);
   private static final List<Level> freezeSpellLevels = new ArrayList<Level>(4);

   private static final List<Level> minionLevels = new ArrayList<Level>(5);
   private static final List<Level> hogRiderLevels = new ArrayList<Level>(5);
   private static final List<Level> valkyrieLevels = new ArrayList<Level>(4);
   private static final List<Level> golemLevels = new ArrayList<Level>(5);
   private static final List<Level> witchLevels = new ArrayList<Level>(2);

   static{
      cannonLevels.add(Level.createNewBuildingLevel(1, 400, 250, 1, 1));
      cannonLevels.add(Level.createNewBuildingLevel(2, 450, 1000, 15, 1));
      cannonLevels.add(Level.createNewBuildingLevel(3, 500, 4000, 45, 2));
      cannonLevels.add(Level.createNewBuildingLevel(4, 550, 16000, 2 * 60, 3));
      cannonLevels.add(Level.createNewBuildingLevel(5, 590, 50000, 6 * 60, 4));
      cannonLevels.add(Level.createNewBuildingLevel(6, 610, 100000, 12 * 60, 5));
      cannonLevels.add(Level.createNewBuildingLevel(7, 630, 200000, (int)TimeUnit.DAYS.toMinutes(1), 6));
      cannonLevels.add(Level.createNewBuildingLevel(8, 660, 400000, (int)TimeUnit.DAYS.toMinutes(2), 7));
      cannonLevels.add(Level.createNewBuildingLevel(9, 690, 800000, (int)TimeUnit.DAYS.toMinutes(3), 8));
      cannonLevels.add(Level.createNewBuildingLevel(10, 750, 1600000, (int)TimeUnit.DAYS.toMinutes(4), 8));
      cannonLevels.add(Level.createNewBuildingLevel(11, 900, 3200000, (int)TimeUnit.DAYS.toMinutes(5), 9));
      cannonLevels.add(Level.createNewBuildingLevel(12, 1080, 6400000, (int)TimeUnit.DAYS.toMinutes(6), 10));

      archerTowerLevels.add(Level.createNewBuildingLevel(1, 400, 1000, 15, 2));
      archerTowerLevels.add(Level.createNewBuildingLevel(2, 450, 2000, 30, 2));
      archerTowerLevels.add(Level.createNewBuildingLevel(3, 500, 5000, 45, 3));
      archerTowerLevels.add(Level.createNewBuildingLevel(4, 550, 20000, 4 * 60, 4));
      archerTowerLevels.add(Level.createNewBuildingLevel(5, 590, 80000, 12 * 60, 5));
      archerTowerLevels.add(Level.createNewBuildingLevel(6, 610, 180000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      archerTowerLevels.add(Level.createNewBuildingLevel(7, 630, 360000, (int)TimeUnit.DAYS.toMinutes(3), 6));
      archerTowerLevels.add(Level.createNewBuildingLevel(8, 660, 720000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      archerTowerLevels.add(Level.createNewBuildingLevel(9, 690, 1500000, (int)TimeUnit.DAYS.toMinutes(5), 8));
      archerTowerLevels.add(Level.createNewBuildingLevel(10, 720, 2500000, (int)TimeUnit.DAYS.toMinutes(6), 8));
      archerTowerLevels.add(Level.createNewBuildingLevel(11, 750, 5000000, (int)TimeUnit.DAYS.toMinutes(7), 9));

      mortarLevels.add(Level.createNewBuildingLevel(1, 400, 8000, 8 * 60, 3));
      mortarLevels.add(Level.createNewBuildingLevel(2, 450, 32000, 12 * 60, 4));
      mortarLevels.add(Level.createNewBuildingLevel(3, 500, 120000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      mortarLevels.add(Level.createNewBuildingLevel(4, 550, 400000, (int)TimeUnit.DAYS.toMinutes(2), 6));
      mortarLevels.add(Level.createNewBuildingLevel(5, 590, 800000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      mortarLevels.add(Level.createNewBuildingLevel(6, 610, 1600000, (int)TimeUnit.DAYS.toMinutes(5), 8));
      mortarLevels.add(Level.createNewBuildingLevel(7, 640, 3200000, (int)TimeUnit.DAYS.toMinutes(7), 9));

      wizardTowerLevels.add(Level.createNewBuildingLevel(1, 620, 180000, 12 * 60, 5));
      wizardTowerLevels.add(Level.createNewBuildingLevel(2, 660, 360000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      wizardTowerLevels.add(Level.createNewBuildingLevel(3, 690, 720000, (int)TimeUnit.DAYS.toMinutes(2), 6));
      wizardTowerLevels.add(Level.createNewBuildingLevel(4, 720, 1280000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      wizardTowerLevels.add(Level.createNewBuildingLevel(5, 760, 1960000, (int)TimeUnit.DAYS.toMinutes(6), 8));
      wizardTowerLevels.add(Level.createNewBuildingLevel(6, 800, 2680000, (int)TimeUnit.DAYS.toMinutes(8), 8));
      wizardTowerLevels.add(Level.createNewBuildingLevel(7, 840, 5360000, (int)TimeUnit.DAYS.toMinutes(10), 9));
      wizardTowerLevels.add(Level.createNewBuildingLevel(8, 880, 6400000, (int)TimeUnit.DAYS.toMinutes(14), 10));

      airDefenseLevels.add(Level.createNewBuildingLevel(1, 800, 22500, 5 * 60, 4));
      airDefenseLevels.add(Level.createNewBuildingLevel(2, 860, 90000, (int)TimeUnit.DAYS.toMinutes(1), 4));
      airDefenseLevels.add(Level.createNewBuildingLevel(3, 900, 270000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      airDefenseLevels.add(Level.createNewBuildingLevel(4, 940, 540000, (int)TimeUnit.DAYS.toMinutes(5), 6));
      airDefenseLevels.add(Level.createNewBuildingLevel(5, 990, 1080000, (int)TimeUnit.DAYS.toMinutes(6), 7));
      airDefenseLevels.add(Level.createNewBuildingLevel(6, 1040, 2160000, (int)TimeUnit.DAYS.toMinutes(8), 8));
      airDefenseLevels.add(Level.createNewBuildingLevel(7, 1100, 4320000, (int)TimeUnit.DAYS.toMinutes(10), 9));
      airDefenseLevels.add(Level.createNewBuildingLevel(8, 1160, 7560000, (int)TimeUnit.DAYS.toMinutes(12), 10));

      hiddenTeslaLevels.add(Level.createNewBuildingLevel(1, 600, 1000000, (int)TimeUnit.DAYS.toMinutes(2), 7));
      hiddenTeslaLevels.add(Level.createNewBuildingLevel(2, 630, 1250000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      hiddenTeslaLevels.add(Level.createNewBuildingLevel(3, 660, 1500000, (int)TimeUnit.DAYS.toMinutes(6), 7));
      hiddenTeslaLevels.add(Level.createNewBuildingLevel(4, 690, 2000000, (int)TimeUnit.DAYS.toMinutes(8), 8));
      hiddenTeslaLevels.add(Level.createNewBuildingLevel(5, 730, 2500000, (int)TimeUnit.DAYS.toMinutes(10), 8));
      hiddenTeslaLevels.add(Level.createNewBuildingLevel(6, 770, 3000000, (int)TimeUnit.DAYS.toMinutes(12), 8));
      hiddenTeslaLevels.add(Level.createNewBuildingLevel(7, 810, 3500000, (int)TimeUnit.DAYS.toMinutes(14), 9));

      xBowLevels.add(Level.createNewBuildingLevel(1, 1500, 3000000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      xBowLevels.add(Level.createNewBuildingLevel(2, 1900, 5000000, (int)TimeUnit.DAYS.toMinutes(10), 9));
      xBowLevels.add(Level.createNewBuildingLevel(3, 2400, 7000000, (int)TimeUnit.DAYS.toMinutes(14), 9));
      xBowLevels.add(Level.createNewBuildingLevel(4, 2800, 8000000, (int)TimeUnit.DAYS.toMinutes(14), 10));

      infernoTowerLevels.add(Level.createNewBuildingLevel(1, 1500, 5000000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      infernoTowerLevels.add(Level.createNewBuildingLevel(2, 1900, 8000000, (int)TimeUnit.DAYS.toMinutes(10), 10));

      elixirCollectorLevels.add(Level.createNewResourceLevel(1, 400, 150, 1, 1, 500, 200));
      elixirCollectorLevels.add(Level.createNewResourceLevel(2, 450, 300, 5, 1, 1000, 400));
      elixirCollectorLevels.add(Level.createNewResourceLevel(3, 500, 700, 15, 2, 1500, 600));
      elixirCollectorLevels.add(Level.createNewResourceLevel(4, 550, 1400, 60, 2, 2500, 800));
      elixirCollectorLevels.add(Level.createNewResourceLevel(5, 590, 3000, 4 * 60, 3, 10000, 1000));
      elixirCollectorLevels.add(Level.createNewResourceLevel(6, 610, 7000, 12 * 60, 3, 20000, 1300));
      elixirCollectorLevels.add(Level.createNewResourceLevel(7, 630, 14000, (int)TimeUnit.DAYS.toMinutes(1), 4, 30000, 1600));
      elixirCollectorLevels.add(Level.createNewResourceLevel(8, 660, 28000, (int)TimeUnit.DAYS.toMinutes(2), 4, 50000, 1900));
      elixirCollectorLevels.add(Level.createNewResourceLevel(9, 680, 56000, (int)TimeUnit.DAYS.toMinutes(3), 5, 75000, 2200));
      elixirCollectorLevels.add(Level.createNewResourceLevel(10, 710, 84000, (int)TimeUnit.DAYS.toMinutes(4), 5, 100000, 2500));
      elixirCollectorLevels.add(Level.createNewResourceLevel(11, 750, 168000, (int)TimeUnit.DAYS.toMinutes(5), 7, 150000, 3000));
      
      goldMineLevels.add(Level.createNewResourceLevel(1, 400, 150, 1, 1, 500, 200));
      goldMineLevels.add(Level.createNewResourceLevel(2, 450, 300, 5, 1, 1000, 400));
      goldMineLevels.add(Level.createNewResourceLevel(3, 500, 700, 15, 2, 1500, 600));
      goldMineLevels.add(Level.createNewResourceLevel(4, 550, 1400, 60, 2, 2500, 800));
      goldMineLevels.add(Level.createNewResourceLevel(5, 590, 3000, 4 * 60, 3, 10000, 1000));
      goldMineLevels.add(Level.createNewResourceLevel(6, 610, 7000, 12 * 60, 3, 20000, 1300));
      goldMineLevels.add(Level.createNewResourceLevel(7, 630, 14000, (int)TimeUnit.DAYS.toMinutes(1), 4, 30000, 1600));
      goldMineLevels.add(Level.createNewResourceLevel(8, 660, 28000, (int)TimeUnit.DAYS.toMinutes(2), 4, 50000, 1900));
      goldMineLevels.add(Level.createNewResourceLevel(9, 680, 56000, (int)TimeUnit.DAYS.toMinutes(3), 5, 75000, 2200));
      goldMineLevels.add(Level.createNewResourceLevel(10, 710, 84000, (int)TimeUnit.DAYS.toMinutes(4), 5, 100000, 2500));
      goldMineLevels.add(Level.createNewResourceLevel(11, 750, 168000, (int)TimeUnit.DAYS.toMinutes(5), 7, 150000, 3000));

      darkElixirDrillLevels.add(Level.createNewResourceLevel(1, 400, 1000000, (int)TimeUnit.DAYS.toMinutes(1), 8, 120, 20));
      darkElixirDrillLevels.add(Level.createNewResourceLevel(2, 480, 1500000, (int)TimeUnit.DAYS.toMinutes(2), 8, 240, 30));
      darkElixirDrillLevels.add(Level.createNewResourceLevel(3, 580, 2000000, (int)TimeUnit.DAYS.toMinutes(3), 8, 450, 45));
      darkElixirDrillLevels.add(Level.createNewResourceLevel(4, 690, 3000000, (int)TimeUnit.DAYS.toMinutes(4), 9, 720, 60));
      darkElixirDrillLevels.add(Level.createNewResourceLevel(5, 830, 4000000, (int)TimeUnit.DAYS.toMinutes(6), 9, 1120, 80));
      darkElixirDrillLevels.add(Level.createNewResourceLevel(6, 1000, 5000000, (int)TimeUnit.DAYS.toMinutes(8), 9, 1600, 100));

      goldStorageLevels.add(Level.createNewResourceLevel(1, 400, 300, 151, 1, 1500, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(2, 600, 750, 30, 2, 3000, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(3, 800, 1500, 60, 2, 6000, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(4, 1000, 3000, 2 * 60, 3, 12000, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(5, 1200, 6000, 3 * 60, 3, 25000, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(6, 1500, 12000, 4 * 60, 3, 50000, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(7, 1650, 25000, 6 * 60, 4, 100000, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(8, 1740, 50000, 8 * 60, 4, 250000, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(9, 1820, 100000, 12 * 60, 5, 500000, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(10, 1920, 250000, (int)TimeUnit.DAYS.toMinutes(1), 6, 1000000, 0));
      goldStorageLevels.add(Level.createNewResourceLevel(11, 2016, 500000, (int)TimeUnit.DAYS.toMinutes(2), 7, 2000000, 0));

      elixirStorageLevels.add(Level.createNewResourceLevel(1, 400, 300, 15, 1, 1500, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(2, 600, 750, 30, 2, 3000, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(3, 800, 1500, 60, 2, 6000, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(4, 1000, 3000, 2 * 60, 3, 12000, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(5, 1200, 6000, 3 * 60, 3, 25000, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(6, 1500, 12000, 4 * 60, 3, 50000, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(7, 1650, 25000, 6 * 60, 4, 100000, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(8, 1740, 50000, 8 * 60, 4, 250000, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(9, 1820, 100000, 12 * 60, 5, 500000, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(10, 1920, 250000, (int)TimeUnit.DAYS.toMinutes(1), 6, 1000000, 0));
      elixirStorageLevels.add(Level.createNewResourceLevel(11, 2016, 500000, (int)TimeUnit.DAYS.toMinutes(2), 7, 2000000, 0));

      darkElixirStorageLevels.add(Level.createNewResourceLevel(1, 1500, 600000, 1440, 7, 10000, 0));
      darkElixirStorageLevels.add(Level.createNewResourceLevel(2, 1650, 1200000, (int)TimeUnit.DAYS.toMinutes(1), 7, 20000, 0));
      darkElixirStorageLevels.add(Level.createNewResourceLevel(3, 2000, 1800000, (int)TimeUnit.DAYS.toMinutes(3), 8, 40000, 0));
      darkElixirStorageLevels.add(Level.createNewResourceLevel(4, 2200, 2400000, (int)TimeUnit.DAYS.toMinutes(4), 8, 80000, 0));
      darkElixirStorageLevels.add(Level.createNewResourceLevel(5, 2400, 3000000, (int)TimeUnit.DAYS.toMinutes(5), 9, 150000, 0));
      darkElixirStorageLevels.add(Level.createNewResourceLevel(6, 2650, 3600000, (int)TimeUnit.DAYS.toMinutes(6), 9, 200000, 0));

      buildersHutLevels.add(Level.createNewBuildingLevel(1, 250, 0, 0, 1));
      buildersHutLevels.add(Level.createNewBuildingLevel(2, 250, 250, 0, 1));
      buildersHutLevels.add(Level.createNewBuildingLevel(3, 250, 500, 0, 1));
      buildersHutLevels.add(Level.createNewBuildingLevel(4, 250, 1000, 0, 1));
      buildersHutLevels.add(Level.createNewBuildingLevel(5, 250, 2000, 0, 1));

      armyCampLevels.add(Level.createNewBuildingLevel(1, 400, 250, 5, 1));
      armyCampLevels.add(Level.createNewBuildingLevel(2, 500, 2500, 60, 2));
      armyCampLevels.add(Level.createNewBuildingLevel(3, 600, 10000, 3 * 60, 3));
      armyCampLevels.add(Level.createNewBuildingLevel(4, 700, 100000, 8 * 60, 4));
      armyCampLevels.add(Level.createNewBuildingLevel(5, 800, 250000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      armyCampLevels.add(Level.createNewBuildingLevel(6, 1000, 750000, (int)TimeUnit.DAYS.toMinutes(3), 6));
      armyCampLevels.add(Level.createNewBuildingLevel(7, 1200, 2250000, (int)TimeUnit.DAYS.toMinutes(5), 9));
      armyCampLevels.add(Level.createNewBuildingLevel(8, 1400, 6750000, (int)TimeUnit.DAYS.toMinutes(10), 10));

      barrackLevels.add(Level.createNewBuildingLevel(1, 250, 200, 1, 1));
      barrackLevels.add(Level.createNewBuildingLevel(2, 270, 1000, 15, 1));
      barrackLevels.add(Level.createNewBuildingLevel(3, 280, 2500, 2 * 60, 1));
      barrackLevels.add(Level.createNewBuildingLevel(4, 290, 5000, 4 * 60, 2));
      barrackLevels.add(Level.createNewBuildingLevel(5, 310, 10000, 10 * 60, 3));
      barrackLevels.add(Level.createNewBuildingLevel(6, 320, 80000, 16 * 60, 4));
      barrackLevels.add(Level.createNewBuildingLevel(7, 340, 240000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      barrackLevels.add(Level.createNewBuildingLevel(8, 350, 700000, (int)TimeUnit.DAYS.toMinutes(2), 6));
      barrackLevels.add(Level.createNewBuildingLevel(9, 390, 1500000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      barrackLevels.add(Level.createNewBuildingLevel(10, 420, 2000000, (int)TimeUnit.DAYS.toMinutes(6), 8));

      darkBarrackLevels.add(Level.createNewBuildingLevel(1, 250, 750000, (int)TimeUnit.DAYS.toMinutes(3), 7));
      darkBarrackLevels.add(Level.createNewBuildingLevel(2, 300, 1250000, (int)TimeUnit.DAYS.toMinutes(5), 7));
      darkBarrackLevels.add(Level.createNewBuildingLevel(3, 350, 1750000, (int)TimeUnit.DAYS.toMinutes(6), 8));
      darkBarrackLevels.add(Level.createNewBuildingLevel(4, 400, 2250000, (int)TimeUnit.DAYS.toMinutes(7), 8));
      darkBarrackLevels.add(Level.createNewBuildingLevel(5, 400, 2750000, (int)TimeUnit.DAYS.toMinutes(8), 9));

      laboratoryLevels.add(Level.createNewBuildingLevel(1, 250, 25000, 30, 3));
      laboratoryLevels.add(Level.createNewBuildingLevel(2, 271, 50000, 5 * 60, 4));
      laboratoryLevels.add(Level.createNewBuildingLevel(3, 280, 90000, 12 * 60, 5));
      laboratoryLevels.add(Level.createNewBuildingLevel(4, 290, 270000, (int)TimeUnit.DAYS.toMinutes(1), 6));
      laboratoryLevels.add(Level.createNewBuildingLevel(5, 310, 500000, (int)TimeUnit.DAYS.toMinutes(2), 7));
      laboratoryLevels.add(Level.createNewBuildingLevel(6, 330, 1000000, (int)TimeUnit.DAYS.toMinutes(4), 8));
      laboratoryLevels.add(Level.createNewBuildingLevel(7, 350, 2500000, (int)TimeUnit.DAYS.toMinutes(5), 9));
      laboratoryLevels.add(Level.createNewBuildingLevel(8, 370, 4000000, (int)TimeUnit.DAYS.toMinutes(6), 10));

      spellFactoryLevels.add(Level.createNewBuildingLevel(1, 200, 200000, (int)TimeUnit.DAYS.toMinutes(1), 5));
      spellFactoryLevels.add(Level.createNewBuildingLevel(2, 300, 400000, (int)TimeUnit.DAYS.toMinutes(2), 6));
      spellFactoryLevels.add(Level.createNewBuildingLevel(3, 400, 800000, (int)TimeUnit.DAYS.toMinutes(4), 7));
      spellFactoryLevels.add(Level.createNewBuildingLevel(4, 500, 1600000, (int)TimeUnit.DAYS.toMinutes(5), 9));
      spellFactoryLevels.add(Level.createNewBuildingLevel(5, 600, 3200000, (int)TimeUnit.DAYS.toMinutes(6), 10));

      townHallLevels.add(Level.createNewBuildingLevel(1, 1500, 0, 0, 0));
      townHallLevels.add(Level.createNewBuildingLevel(2, 1600, 1000, 5, 1));
      townHallLevels.add(Level.createNewBuildingLevel(3, 1850, 4000, 3 * 60, 2));
      townHallLevels.add(Level.createNewBuildingLevel(4, 2100, 25000, (int)TimeUnit.DAYS.toMinutes(1), 3));
      townHallLevels.add(Level.createNewBuildingLevel(5, 2400, 150000, (int)TimeUnit.DAYS.toMinutes(2), 4));
      townHallLevels.add(Level.createNewBuildingLevel(6, 2800, 750000, (int)TimeUnit.DAYS.toMinutes(4), 5));
      townHallLevels.add(Level.createNewBuildingLevel(7, 3200, 1200000, (int)TimeUnit.DAYS.toMinutes(6), 6));
      townHallLevels.add(Level.createNewBuildingLevel(8, 3700, 2000000, (int)TimeUnit.DAYS.toMinutes(8), 7));
      townHallLevels.add(Level.createNewBuildingLevel(9, 4200, 3000000, (int)TimeUnit.DAYS.toMinutes(10), 8));
      townHallLevels.add(Level.createNewBuildingLevel(10, 5000, 4000000, (int)TimeUnit.DAYS.toMinutes(14), 9));

      clanCastleLevels.add(Level.createNewBuildingLevel(1, 1000, 40000, 0, 3));
      clanCastleLevels.add(Level.createNewBuildingLevel(2, 1400, 100000, 6 * 60, 4));
      clanCastleLevels.add(Level.createNewBuildingLevel(3, 2000, 800000, (int)TimeUnit.DAYS.toMinutes(1), 6));
      clanCastleLevels.add(Level.createNewBuildingLevel(4, 2600, 1800000, (int)TimeUnit.DAYS.toMinutes(2), 8));
      clanCastleLevels.add(Level.createNewBuildingLevel(5, 3000, 7000000, (int)TimeUnit.DAYS.toMinutes(7), 9));

      wallLevels.add(Level.createNewBuildingLevel(1, 300, 200, 0, 2));
      wallLevels.add(Level.createNewBuildingLevel(2, 500, 1000, 0, 2));
      wallLevels.add(Level.createNewBuildingLevel(3, 700, 5000, 0, 3));
      wallLevels.add(Level.createNewBuildingLevel(4, 900, 10000, 0, 4));
      wallLevels.add(Level.createNewBuildingLevel(5, 1400, 30000, 0, 5));
      wallLevels.add(Level.createNewBuildingLevel(6, 2000, 75000, 0, 6));
      wallLevels.add(Level.createNewBuildingLevel(7, 2500, 200000, 0, 7));
      wallLevels.add(Level.createNewBuildingLevel(8, 3000, 500000, 0, 8));
      wallLevels.add(Level.createNewBuildingLevel(9, 4000, 1000000, 0, 9));
      wallLevels.add(Level.createNewBuildingLevel(10, 5500, 3000000, 0, 9));
      wallLevels.add(Level.createNewBuildingLevel(11, 7000, 4000000, 0, 10));

      barbarKingLevels.add(Level.createNewBuildingLevel(1, 1500, 10000, 0, 7));
      barbarKingLevels.add(Level.createNewBuildingLevel(2, 1560, 12500, 12 * 60, 7));
      barbarKingLevels.add(Level.createNewBuildingLevel(3, 1622, 15000, 2 * 12 * 60, 7));
      barbarKingLevels.add(Level.createNewBuildingLevel(4, 1687, 17500, 3 * 12 * 60, 7));
      barbarKingLevels.add(Level.createNewBuildingLevel(5, 1755, 20000, 4 * 12 * 60, 7));
      barbarKingLevels.add(Level.createNewBuildingLevel(6, 1825, 22500, 5 * 12 * 60, 8));
      barbarKingLevels.add(Level.createNewBuildingLevel(7, 1898, 25000, 6 * 12 * 60, 8));
      barbarKingLevels.add(Level.createNewBuildingLevel(8, 1974, 30000, 7 * 12 * 60, 8));
      barbarKingLevels.add(Level.createNewBuildingLevel(9, 2053, 35000, 8 * 12 * 60, 8));
      barbarKingLevels.add(Level.createNewBuildingLevel(10, 2135, 40000, 9 * 12 * 60, 8));
      barbarKingLevels.add(Level.createNewBuildingLevel(11, 2200, 45000, 10 * 12 * 60, 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(12, 2309, 50000, 11 * 12 * 60, 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(13, 2402, 55000, 12 * 12 * 60, 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(14, 2498, 60000, 13 * 12 * 60, 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(15, 2598, 65000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(16, 2701, 70000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(17, 2809, 75000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(18, 2922, 80000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(19, 3039, 85000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(20, 3160, 90000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(21, 3287, 95000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(22, 3418, 100000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(23, 3555, 105000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(24, 3697, 110000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(25, 3845, 115000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(26, 3999, 120000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(27, 4159, 125000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(28, 4325, 130000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(29, 4498, 135000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      barbarKingLevels.add(Level.createNewBuildingLevel(30, 4000, 140000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(31, 4000, 145000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(32, 4000, 150000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(33, 4000, 155000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(34, 4000, 160000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(35, 4000, 165000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(36, 4000, 170000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(37, 4000, 175000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(38, 4000, 180000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(39, 4000, 185000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      barbarKingLevels.add(Level.createNewBuildingLevel(40, 4000, 190000, (int)TimeUnit.DAYS.toMinutes(7), 10));

      archerQueenLevels.add(Level.createNewBuildingLevel(1, 675, 40000, 0, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(2, 702, 22500, 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(3, 730, 25000, 2 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(4, 759, 27500, 3 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(5, 790, 30000, 4 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(6, 821, 32500, 5 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(7, 854, 35000, 6 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(8, 888, 40000, 7 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(9, 924, 45000, 8 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(10, 961, 50000, 9 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(11, 999, 55000, 10 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(12, 1039, 60000, 11 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(13, 1081, 65000, 12 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(14, 1124, 70000, 13 * 12 * 60, 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(15, 1169, 75000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(16, 1215, 80000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(17, 1264, 85000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(18, 1315, 90000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(19, 1368, 95000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(20, 1422, 100000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(21, 1479, 105000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(22, 1538, 110000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(23, 1600, 115000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(24, 1664, 120000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(25, 1730, 125000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(26, 1800, 130000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(27, 1872, 135000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(28, 1946, 140000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(29, 2024, 145000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(30, 2105, 150000, (int)TimeUnit.DAYS.toMinutes(7), 9));
      archerQueenLevels.add(Level.createNewBuildingLevel(31, 2000, 155000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      archerQueenLevels.add(Level.createNewBuildingLevel(32, 2000, 160000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      archerQueenLevels.add(Level.createNewBuildingLevel(33, 2000, 165000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      archerQueenLevels.add(Level.createNewBuildingLevel(34, 2000, 170000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      archerQueenLevels.add(Level.createNewBuildingLevel(35, 2000, 175000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      archerQueenLevels.add(Level.createNewBuildingLevel(36, 2000, 180000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      archerQueenLevels.add(Level.createNewBuildingLevel(37, 2000, 185000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      archerQueenLevels.add(Level.createNewBuildingLevel(38, 2000, 190000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      archerQueenLevels.add(Level.createNewBuildingLevel(39, 2000, 195000, (int)TimeUnit.DAYS.toMinutes(7), 10));
      archerQueenLevels.add(Level.createNewBuildingLevel(40, 2000, 200000, (int)TimeUnit.DAYS.toMinutes(7), 10));
   }

   static{
      barbarianLevels.add(Level.createNewTroopLevel(1, 45, 0, 0, 0));
      barbarianLevels.add(Level.createNewTroopLevel(2, 54, 50000, (int)TimeUnit.HOURS.toMinutes(6), 1));
      barbarianLevels.add(Level.createNewTroopLevel(3, 65, 150000, (int)TimeUnit.DAYS.toMinutes(1), 3));
      barbarianLevels.add(Level.createNewTroopLevel(4, 78, 500000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      barbarianLevels.add(Level.createNewTroopLevel(5, 95, 1500000, (int)TimeUnit.DAYS.toMinutes(5), 6));
      barbarianLevels.add(Level.createNewTroopLevel(6, 110, 4500000, (int)TimeUnit.DAYS.toMinutes(10), 7));
      
      archerLevels.add(Level.createNewTroopLevel(1, 20, 0, 0, 0));
      archerLevels.add(Level.createNewTroopLevel(2, 23, 50000, (int)TimeUnit.HOURS.toMinutes(12), 1));
      archerLevels.add(Level.createNewTroopLevel(3, 28, 250000, (int)TimeUnit.DAYS.toMinutes(2), 3));
      archerLevels.add(Level.createNewTroopLevel(4, 33, 750000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      archerLevels.add(Level.createNewTroopLevel(5, 40, 2250000, (int)TimeUnit.DAYS.toMinutes(5), 6));
      archerLevels.add(Level.createNewTroopLevel(6, 44, 7500000, (int)TimeUnit.DAYS.toMinutes(14), 7));
      
      goblinLevels.add(Level.createNewTroopLevel(1, 25, 0, 0, 0));
      goblinLevels.add(Level.createNewTroopLevel(2, 30, 50000, (int)TimeUnit.HOURS.toMinutes(12), 1));
      goblinLevels.add(Level.createNewTroopLevel(3, 36, 250000, (int)TimeUnit.DAYS.toMinutes(2), 3));
      goblinLevels.add(Level.createNewTroopLevel(4, 43, 750000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      goblinLevels.add(Level.createNewTroopLevel(5, 52, 2250000, (int)TimeUnit.DAYS.toMinutes(5), 6));

      giantLevels.add(Level.createNewTroopLevel(1, 300, 0, 0, 0));
      giantLevels.add(Level.createNewTroopLevel(2, 360, 100000, (int)TimeUnit.DAYS.toMinutes(1), 2));
      giantLevels.add(Level.createNewTroopLevel(3, 430, 250000, (int)TimeUnit.DAYS.toMinutes(2), 4));
      giantLevels.add(Level.createNewTroopLevel(4, 520, 750000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      giantLevels.add(Level.createNewTroopLevel(5, 670, 2250000, (int)TimeUnit.DAYS.toMinutes(5), 6));
      giantLevels.add(Level.createNewTroopLevel(6, 800, 6000000, (int)TimeUnit.DAYS.toMinutes(10), 7));

      wallBreakerLevels.add(Level.createNewTroopLevel(1, 20, 0, 0, 0));
      wallBreakerLevels.add(Level.createNewTroopLevel(2, 24, 100000, (int)TimeUnit.DAYS.toMinutes(1), 2));
      wallBreakerLevels.add(Level.createNewTroopLevel(3, 29, 250000, (int)TimeUnit.DAYS.toMinutes(2), 4));
      wallBreakerLevels.add(Level.createNewTroopLevel(4, 35, 750000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      wallBreakerLevels.add(Level.createNewTroopLevel(5, 42, 2250000, (int)TimeUnit.DAYS.toMinutes(5), 6));
      wallBreakerLevels.add(Level.createNewTroopLevel(6, 54, 6750000, (int)TimeUnit.DAYS.toMinutes(10), 8));

      balloonLevels.add(Level.createNewTroopLevel(1, 150, 0, 0, 0));
      balloonLevels.add(Level.createNewTroopLevel(2, 180, 150000, (int)TimeUnit.DAYS.toMinutes(1), 2));
      balloonLevels.add(Level.createNewTroopLevel(3, 216, 450000, (int)TimeUnit.DAYS.toMinutes(2), 4));
      balloonLevels.add(Level.createNewTroopLevel(4, 280, 1350000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      balloonLevels.add(Level.createNewTroopLevel(5, 390, 2500000, (int)TimeUnit.DAYS.toMinutes(5), 6));
      balloonLevels.add(Level.createNewTroopLevel(6, 545, 6000000, (int)TimeUnit.DAYS.toMinutes(10), 7));

      wizardLevels.add(Level.createNewTroopLevel(1, 75, 0, 0, 0));
      wizardLevels.add(Level.createNewTroopLevel(2, 90, 150000, (int)TimeUnit.DAYS.toMinutes(1), 3));
      wizardLevels.add(Level.createNewTroopLevel(3, 108, 450000, (int)TimeUnit.DAYS.toMinutes(2), 4));
      wizardLevels.add(Level.createNewTroopLevel(4, 130, 1350000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      wizardLevels.add(Level.createNewTroopLevel(5, 156, 2500000, (int)TimeUnit.DAYS.toMinutes(5), 6));
      wizardLevels.add(Level.createNewTroopLevel(6, 180, 7500000, (int)TimeUnit.DAYS.toMinutes(8), 8));

      healerLevels.add(Level.createNewTroopLevel(1, 500, 0, 0, 0));
      healerLevels.add(Level.createNewTroopLevel(2, 600, 750000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      healerLevels.add(Level.createNewTroopLevel(3, 720, 1500000, (int)TimeUnit.DAYS.toMinutes(5), 6));
      healerLevels.add(Level.createNewTroopLevel(4, 850, 3000000, (int)TimeUnit.DAYS.toMinutes(7), 7));

      dragonLevels.add(Level.createNewTroopLevel(1, 1900, 0, 0, 0));
      dragonLevels.add(Level.createNewTroopLevel(2, 2100, 2000000, (int)TimeUnit.DAYS.toMinutes(7), 5));
      dragonLevels.add(Level.createNewTroopLevel(3, 2300, 3000000, (int)TimeUnit.DAYS.toMinutes(10), 6));
      dragonLevels.add(Level.createNewTroopLevel(4, 2400, 4000000, (int)TimeUnit.DAYS.toMinutes(12), 8));

      pekkaLevels.add(Level.createNewTroopLevel(1, 2800, 0, 0, 0));
      pekkaLevels.add(Level.createNewTroopLevel(2, 3100, 3000000, (int)TimeUnit.DAYS.toMinutes(10), 6));
      pekkaLevels.add(Level.createNewTroopLevel(3, 3400, 6000000, (int)TimeUnit.DAYS.toMinutes(12), 6));
   }

   static{
      lighteningSpellLevels.add(Level.createNewSpellLevel(1, 0, 0, 0));
      lighteningSpellLevels.add(Level.createNewSpellLevel(2, 200000, (int)TimeUnit.DAYS.toMinutes(1), 1));
      lighteningSpellLevels.add(Level.createNewSpellLevel(3, 500000, (int)TimeUnit.DAYS.toMinutes(2), 2));
      lighteningSpellLevels.add(Level.createNewSpellLevel(4, 1000000, (int)TimeUnit.DAYS.toMinutes(3), 3));
      lighteningSpellLevels.add(Level.createNewSpellLevel(5, 2000000, (int)TimeUnit.DAYS.toMinutes(4), 6));

      healingSpellLevels.add(Level.createNewSpellLevel(1, 0, 0, 0));
      healingSpellLevels.add(Level.createNewSpellLevel(2, 300000, (int)TimeUnit.DAYS.toMinutes(1), 2));
      healingSpellLevels.add(Level.createNewSpellLevel(3, 600000, (int)TimeUnit.DAYS.toMinutes(2), 4));
      healingSpellLevels.add(Level.createNewSpellLevel(4, 1200000, (int)TimeUnit.DAYS.toMinutes(3), 5));
      healingSpellLevels.add(Level.createNewSpellLevel(5, 2400000, (int) TimeUnit.DAYS.toMinutes(5), 6));

      rageSpellLevels.add(Level.createNewSpellLevel(1, 0, 0, 0));
      rageSpellLevels.add(Level.createNewSpellLevel(2, 450000, (int) TimeUnit.DAYS.toMinutes(2), 5));
      rageSpellLevels.add(Level.createNewSpellLevel(3, 900000, (int) TimeUnit.DAYS.toMinutes(3), 5));
      rageSpellLevels.add(Level.createNewSpellLevel(4, 1800000, (int) TimeUnit.DAYS.toMinutes(5), 5));
      rageSpellLevels.add(Level.createNewSpellLevel(5, 3000000, (int) TimeUnit.DAYS.toMinutes(7), 6));

      jumpSpellLevels.add(Level.createNewSpellLevel(1, 0, 0, 0));
      jumpSpellLevels.add(Level.createNewSpellLevel(2, 4000000, (int)TimeUnit.DAYS.toMinutes(5), 6));

      santasSupriseSpellLevels.add(Level.createNewSpellLevel(1, 0, 0, 0));

      freezeSpellLevels.add(Level.createNewSpellLevel(1, 0, 0, 0));
      freezeSpellLevels.add(Level.createNewSpellLevel(2, 4000000, (int)TimeUnit.DAYS.toMinutes(5), 8));
      freezeSpellLevels.add(Level.createNewSpellLevel(3, 6000000, (int)TimeUnit.DAYS.toMinutes(10), 8));
      freezeSpellLevels.add(Level.createNewSpellLevel(4, 8000000, (int)TimeUnit.DAYS.toMinutes(14), 8));
   }

   static{
      minionLevels.add(Level.createNewTroopLevel(1, 55, 0, 0, 0));
      minionLevels.add(Level.createNewTroopLevel(2, 60, 10000, (int)TimeUnit.DAYS.toMinutes(5), 5));
      minionLevels.add(Level.createNewTroopLevel(3, 66, 20000, (int)TimeUnit.DAYS.toMinutes(6), 6));
      minionLevels.add(Level.createNewTroopLevel(4, 72, 30000, (int)TimeUnit.DAYS.toMinutes(7), 6));
      minionLevels.add(Level.createNewTroopLevel(5, 78, 40000, (int)TimeUnit.DAYS.toMinutes(10), 7));

      hogRiderLevels.add(Level.createNewTroopLevel(1, 300, 0, 0, 0));
      hogRiderLevels.add(Level.createNewTroopLevel(2, 345, 20000, (int)TimeUnit.DAYS.toMinutes(8), 5));
      hogRiderLevels.add(Level.createNewTroopLevel(3, 400, 30000, (int)TimeUnit.DAYS.toMinutes(10), 6));
      hogRiderLevels.add(Level.createNewTroopLevel(4, 460, 40000, (int)TimeUnit.DAYS.toMinutes(12), 6));
      hogRiderLevels.add(Level.createNewTroopLevel(5, 525, 50000, (int)TimeUnit.DAYS.toMinutes(14), 7));

      valkyrieLevels.add(Level.createNewTroopLevel(1, 750, 0, 0, 0));
      valkyrieLevels.add(Level.createNewTroopLevel(2, 825, 50000, (int)TimeUnit.DAYS.toMinutes(10), 6));
      valkyrieLevels.add(Level.createNewTroopLevel(3, 910, 60000, (int)TimeUnit.DAYS.toMinutes(12), 7));
      valkyrieLevels.add(Level.createNewTroopLevel(4, 1000, 70000, (int)TimeUnit.DAYS.toMinutes(14), 7));

      golemLevels.add(Level.createNewTroopLevel(1, 4500, 0, 0, 0));
      golemLevels.add(Level.createNewTroopLevel(2, 5000, 60000, (int)TimeUnit.DAYS.toMinutes(10), 6));
      golemLevels.add(Level.createNewTroopLevel(3, 5500, 70000, (int)TimeUnit.DAYS.toMinutes(12), 7));
      golemLevels.add(Level.createNewTroopLevel(4, 6000, 80000, (int)TimeUnit.DAYS.toMinutes(14), 7));
      golemLevels.add(Level.createNewTroopLevel(5, 6300, 90000, (int)TimeUnit.DAYS.toMinutes(14), 8));

      witchLevels.add(Level.createNewTroopLevel(1, 75, 0, 0, 0));
      witchLevels.add(Level.createNewTroopLevel(2, 100, 75000, (int)TimeUnit.DAYS.toMinutes(10), 7));
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
               case BUILDERS_HUT: return 5;
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
               case XBOW: return 3;
               case INFERNO_TOWER: return 2;
               case ELIXIR_COLLECTOR: return 7;
               case GOLD_MINE: return 7;
               case DARK_ELIXIR_DRILL: return 3;
               case GOLD_STORAGE: return 4;
               case ELIXIR_STORAGE: return 4;
               case DARK_ELIXIR_STORAGE: return 1;
               case BUILDERS_HUT: return 5;
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

   public static List<? extends Level> getLevels(UpgradeType type) {
      switch (type){
         case BARBARIAN: return barbarianLevels;
         case ARCHER: return archerLevels;
         case GOBLIN: return goblinLevels;
         case GIANT: return giantLevels;
         case WALL_BREAKER: return wallBreakerLevels;
         case BALLOON: return balloonLevels;
         case WIZARD: return wizardLevels;
         case HEALER: return healerLevels;
         case DRAGON: return dragonLevels;
         case PEKKA: return pekkaLevels;
         case LIGHTENING_SPELL: return lighteningSpellLevels;
         case HEALING_SPELL: return healingSpellLevels;
         case RAGE_SPELL: return rageSpellLevels;
         case JUMP_SPELL: return jumpSpellLevels;
         case SANTAS_SURPRISE_SPELL: return santasSupriseSpellLevels;
         case FREEZE_SPELL: return freezeSpellLevels;
         case MINION: return minionLevels;
         case HOG_RIDER: return hogRiderLevels;
         case VALKYRIE: return valkyrieLevels;
         case GOLEM: return golemLevels;
         case WITCH: return witchLevels;
         default : throw new IllegalArgumentException(type + " tipinde bozukluk var.");
      }
   }

}
