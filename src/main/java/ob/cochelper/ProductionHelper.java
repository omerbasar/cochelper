package ob.cochelper;

import java.util.AbstractMap;
import java.util.Map;

/**
 * Uretimlerin seviye basina ne kadar oldugunu hesaplar
 *
 * @author omer
 */
public class ProductionHelper {
   public static Map.Entry<Resource, Integer> getProductionPerDay(BuildingType type, Integer level){
      // uretim binasi degilse direk 0 don
      if(!type.isProductionBuilding()){
         return new AbstractMap.SimpleEntry<Resource, Integer>(type.getResourceProduced(), 0);
      }

      return new AbstractMap.SimpleEntry<Resource, Integer>(type.getResourceProduced(), getProduction(type, level));
   }

   private static Integer getProduction(BuildingType type, Integer level) {
      switch (type){
         case GOLD_MINE:
            switch (level){
               case 1: return 200 * 24;
               case 2: return 400 * 24;
               case 3: return 600 * 24;
               case 4: return 800 * 24;
               case 5: return 1000 * 24;
               case 6: return 1300 * 24;
               case 7: return 1600 * 24;
               case 8: return 1900 * 24;
               case 9: return 2200 * 24;
               case 10: return 2500 * 24;
               case 11: return 3000 * 24;
               case 12: return 3500 * 24;
               default: throw new IllegalArgumentException(" hatali bilgi : " + type + ", level : " + level);
            }
         case ELIXIR_COLLECTOR:
            switch (level){
               case 1: return 200 * 24;
               case 2: return 400 * 24;
               case 3: return 600 * 24;
               case 4: return 800 * 24;
               case 5: return 1000 * 24;
               case 6: return 1300 * 24;
               case 7: return 1600 * 24;
               case 8: return 1900 * 24;
               case 9: return 2200 * 24;
               case 10: return 2500 * 24;
               case 11: return 3000 * 24;
               case 12: return 3500 * 24;
               default: throw new IllegalArgumentException(" hatali bilgi : " + type + ", level : " + level);
            }
         case DARK_ELIXIR_DRILL:
            switch (level){
               case 1: return 20 * 24;
               case 2: return 30 * 24;
               case 3: return 45 * 24;
               case 4: return 60 * 24;
               case 5: return 80 * 24;
               case 6: return 100 * 24;
               default: throw new IllegalArgumentException(" hatali bilgi : " + type + ", level : " + level);
            }
         default:
            return 0;
      }
   }
}
