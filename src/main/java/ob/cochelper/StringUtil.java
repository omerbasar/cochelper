package ob.cochelper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author omer
 */
public class StringUtil {

   private static DecimalFormat format=(DecimalFormat)DecimalFormat.getInstance();
   private static DecimalFormatSymbols symbols=format.getDecimalFormatSymbols();
   static{
      symbols.setDecimalSeparator(',');
   }

   public static String makeResourceReadable(Long value) {
      return format.format(value);
   }

   public static String makeTimeReadable(Long timeInMinutes){
      Long value = timeInMinutes;
      Long day = 0L;
      Long hour = 0L;

      if(value >= 1440){
         day = value / 1440;
         value = value - 1440 * day;
      }

      if(value >= 60){
         hour = value / 60;
         value = value - 60 * hour;
      }

      Long minute = value;

      return (day > 0 ? day + " gün " : "") + (hour > 0 ? hour + " saat " : "") + (minute > 0 ? minute + " dakika" : "");
   }

}
