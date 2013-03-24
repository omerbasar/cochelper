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

   private Integer elapsedBuildTime = 0;
   private Map<Resource, Integer> elapsedResourceMap;

   private Double remainingBuildTimePercentage = 0d;
   private Double elapsedBuildTimePercentage = 0d;

   public Village(Integer level, String cannonCS, String archersCS, String mortars, String wizardTowers, String airDefenses, String hiddenTeslas, String xBows) {
      this.level = level;
      initializeResourceMaps();
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

   private void initializeResourceMaps() {
      remainingResourceMap = new HashMap<Resource, Integer>(Resource.values().length);
      elapsedResourceMap = new HashMap<Resource, Integer>(Resource.values().length);
      for (Resource resource : Resource.values()) {
         remainingResourceMap.put(resource, 0);
         elapsedResourceMap.put(resource, 0);
      }
   }

   public void calculate(){
      for (Building building : buildings) {
         remainingBuildTime += building.getRemainingBuildTime();
         elapsedBuildTime += building.getElapsedBuildTime();

         Resource resource = building.getResource();
         remainingResourceMap.put(resource, remainingResourceMap.get(resource) + building.getRemainingResource());
         elapsedResourceMap.put(resource, elapsedResourceMap.get(resource) + building.getElapsedResource());
      }

      remainingBuildTimePercentage = (((100 * remainingBuildTime) / (remainingBuildTime + elapsedBuildTime)) / 100d) * 100;
      elapsedBuildTimePercentage = 100d - remainingBuildTimePercentage;
   }

   public Integer getRemainingBuildTime() {
      return remainingBuildTime;
   }

   public Integer getElapsedBuildTime() {
      return elapsedBuildTime;
   }

   public Integer getRemainingResource(Resource resource) {
      return remainingResourceMap.get(resource);
   }

   public Integer getElapsedResource(Resource resource) {
      return elapsedResourceMap.get(resource);
   }

   public String makeTimeReadable(Integer timeInMinutes){
      Integer value = timeInMinutes;
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

   public Double getRemainingBuildTimePercentage() {
      return remainingBuildTimePercentage;
   }

   public Double getElapsedBuildTimePercentage() {
      return elapsedBuildTimePercentage;
   }

   public static void main(String[] args) {
      Village village = new Village(9, "9", "4", "0", "0", "0" ,"0", "0");
      village.calculate();
      System.out.println("village.getElapsedBuildTime() = " + village.makeTimeReadable(village.getElapsedBuildTime()));
      System.out.println("village.getRemainingBuildTime() = " + village.makeTimeReadable(village.getRemainingBuildTime()));
      for (Resource resource : Resource.values()) {
         System.out.println("village.getRemainingResource("+ resource +") = " + village.getRemainingResource(resource));
         System.out.println("village.getElapsedResource("+ resource +") = " + village.getElapsedResource(resource));
      }
   }

   private static DecimalFormat format=(DecimalFormat)DecimalFormat.getInstance();
   private static DecimalFormatSymbols symbols=format.getDecimalFormatSymbols();
   static{
      symbols.setDecimalSeparator(' ');
   }

   public String makeResourceReadable(Integer value) {
      return format.format(value);
   }

}
