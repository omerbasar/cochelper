package ob.cochelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:40 PM
 */
public class LevelHelper {
   
   private static final List<GoldLevel> cannonLevels = new ArrayList<GoldLevel>(11);
   private static final List<GoldLevel> archerTowerLevels = new ArrayList<GoldLevel>(11);
   private static final List<GoldLevel> mortarLevels = new ArrayList<GoldLevel>(7);
   private static final List<GoldLevel> wizardTowerLevels = new ArrayList<GoldLevel>(7);
   private static final List<GoldLevel> airDefenseLevels = new ArrayList<GoldLevel>(7);
   private static final List<GoldLevel> hiddenTeslaLevels = new ArrayList<GoldLevel>(6);
   private static final List<GoldLevel> xBowLevels = new ArrayList<GoldLevel>(3);

   static{
      cannonLevels.add(new GoldLevel(1, 250, 1));
      cannonLevels.add(new GoldLevel(2, 1000, 15));
      cannonLevels.add(new GoldLevel(3, 4000, 45));
      cannonLevels.add(new GoldLevel(4, 16000, 2 * 60));
      cannonLevels.add(new GoldLevel(5, 50000, 6 * 60));
      cannonLevels.add(new GoldLevel(6, 100000, 12 * 60));
      cannonLevels.add(new GoldLevel(7, 200000, 1440));
      cannonLevels.add(new GoldLevel(8, 400000, 2 * 1440));
      cannonLevels.add(new GoldLevel(9, 800000, 3 * 1440));
      cannonLevels.add(new GoldLevel(10, 1600000, 4 * 1440));
      cannonLevels.add(new GoldLevel(11, 3200000, 5 * 1440));

      archerTowerLevels.add(new GoldLevel(1, 1000, 15));
      archerTowerLevels.add(new GoldLevel(2, 2000, 30));
      archerTowerLevels.add(new GoldLevel(3, 5000, 45));
      archerTowerLevels.add(new GoldLevel(4, 20000, 4 * 60));
      archerTowerLevels.add(new GoldLevel(5, 80000, 12 * 60));
      archerTowerLevels.add(new GoldLevel(6, 180000, 1440));
      archerTowerLevels.add(new GoldLevel(7, 360000, 3 * 1440));
      archerTowerLevels.add(new GoldLevel(8, 720000, 4 * 1440));
      archerTowerLevels.add(new GoldLevel(9, 1500000, 5 * 1440));
      archerTowerLevels.add(new GoldLevel(10, 2500000, 6 * 1440));
      archerTowerLevels.add(new GoldLevel(11, 5000000, 7 * 1440));

      mortarLevels.add(new GoldLevel(1, 8000, 8 * 60));
      mortarLevels.add(new GoldLevel(2, 32000, 12 * 60));
      mortarLevels.add(new GoldLevel(3, 120000, 1440));
      mortarLevels.add(new GoldLevel(4, 400000, 2 * 1440));
      mortarLevels.add(new GoldLevel(5, 800000, 4 * 1440));
      mortarLevels.add(new GoldLevel(6, 1600000, 5 * 1440));
      mortarLevels.add(new GoldLevel(7, 3200000, 7 * 1440));

      wizardTowerLevels.add(new GoldLevel(1, 180000, 12 * 60));
      wizardTowerLevels.add(new GoldLevel(2, 360000, 1440));
      wizardTowerLevels.add(new GoldLevel(3, 720000, 2 * 1440));
      wizardTowerLevels.add(new GoldLevel(4, 1280000, 4 * 1440));
      wizardTowerLevels.add(new GoldLevel(5, 1960000, 6 * 1440));
      wizardTowerLevels.add(new GoldLevel(6, 2680000, 8 * 1440));
      wizardTowerLevels.add(new GoldLevel(7, 5360000, 10 * 1440));

      airDefenseLevels.add(new GoldLevel(1, 22500, 5 * 60));
      airDefenseLevels.add(new GoldLevel(2, 90000, 1440));
      airDefenseLevels.add(new GoldLevel(3, 270000, 3 * 1440));
      airDefenseLevels.add(new GoldLevel(4, 540000, 5 * 1440));
      airDefenseLevels.add(new GoldLevel(5, 1080000, 6 * 1440));
      airDefenseLevels.add(new GoldLevel(6, 2160000, 8 * 1440));
      airDefenseLevels.add(new GoldLevel(7, 6480000, 10 * 1440));

      hiddenTeslaLevels.add(new GoldLevel(1, 1000000, 2 * 1440));
      hiddenTeslaLevels.add(new GoldLevel(2, 1250000, 4 * 1440));
      hiddenTeslaLevels.add(new GoldLevel(3, 1500000, 6 * 1440));
      hiddenTeslaLevels.add(new GoldLevel(4, 2000000, 8 * 1440));
      hiddenTeslaLevels.add(new GoldLevel(5, 2500000, 10 * 1440));
      hiddenTeslaLevels.add(new GoldLevel(6, 3000000, 12 * 1440));

      xBowLevels.add(new GoldLevel(1, 3000000, 7 * 1440));
      xBowLevels.add(new GoldLevel(1, 6000000, 10 * 1440));
      xBowLevels.add(new GoldLevel(2, 8000000, 14 * 1440));
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
               default : return 0;
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
         default : return Collections.EMPTY_LIST;
      }
   }
}
