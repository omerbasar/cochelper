package ob.cochelper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:29 PM
 */
public class Village {

   private Integer level;
   private List<Building> buildings = new ArrayList<Building>();
   private Integer remainingBuildTime = 0;
   private Map<Resource, Integer> remainingResourceMap;

   public Village(Integer level, String cannonCS, String archersCS, String mortars, String wizardTowers, String airDefenses, String hiddenTeslas, String xBows) {
      this.level = level;
      initializeResourceMap();
      create(BuildingType.CANNON, cannonCS);
      create(BuildingType.ARCHER_TOWER, archersCS);
      create(BuildingType.MORTAR, mortars);
      create(BuildingType.WIZARD_TOWER, wizardTowers);
      create(BuildingType.AIR_DEFENSE, airDefenses);
      create(BuildingType.HIDDEN_TESLA, hiddenTeslas);
      create(BuildingType.XBOW, xBows);
   }

   private void create(BuildingType type, String commaSeparated) {
      ArrayList<String> parts = new ArrayList<String>();
      Collections.addAll(parts, commaSeparated.split(","));

      for(int i = parts.size() ; i < LevelHelper.getMaxAvailable(type, level); i ++){
         parts.add("0");
      }
      for (String level : parts) {
         buildings.add(new DefensiveBuilding(type, Integer.parseInt(level)));
      }
   }

   private void initializeResourceMap() {
      remainingResourceMap = new HashMap<Resource, Integer>(Resource.values().length);
      for (Resource resource : Resource.values()) {
         remainingResourceMap.put(resource, 0);
      }
   }

   public Integer calculateRemainings(){
      for (Building building : buildings) {
         remainingBuildTime += building.getRemainingBuildTime();
         Resource resource = building.getResource();
         Integer remainingResource = remainingResourceMap.get(resource);
         remainingResource += building.getRemainingResource();
         remainingResourceMap.put(resource, remainingResource);
      }
      return remainingBuildTime;
   }

   public Integer getRemainingBuildTime() {
      return remainingBuildTime;
   }

   public Integer getRemainingResource(Resource resource) {
      return remainingResourceMap.get(resource);
   }

   public String getRemainingBuildTimeAsReadable(){
      Integer value = remainingBuildTime;
      Integer day = 0;
      Integer hour = 0;

      if(value >= 1440){
         day = value / 1440;
         value = value - 1440 * day;
      }
      if(value >= 60){
         hour = value / 60;
         value = value - 60 * hour;
      }

      int minute = value;

      return (day > 0 ? day + " gün " : "") + (hour > 0 ? hour + " saat " : "") + (minute > 0 ? minute + " dakika " : "");
   }

   public static void main(String[] args) {
      Village village = new Village(9, "9", "4", "0", "0", "0" ,"0", "0");
      village.calculateRemainings();
      System.out.println("village.getRemainingBuildTime() = " + village.getRemainingBuildTimeAsReadable());
      for (Resource resource : Resource.values()) {
         System.out.println("village.getRemainingResource("+ resource +") = " + village.getRemainingResource(resource));
      }
   }

   private static DecimalFormat format=(DecimalFormat)DecimalFormat.getInstance();
   private static DecimalFormatSymbols symbols=format.getDecimalFormatSymbols();
   static{
      symbols.setDecimalSeparator(' ');
   }

   public String getRemainingResourceAsReadable(Resource resource) {
      return format.format(getRemainingResource(resource));
   }

}
