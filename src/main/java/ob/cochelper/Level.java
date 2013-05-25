package ob.cochelper;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:13 PM
 */
public class Level {

   private Integer index;
   private Integer hitPoint;
   private Integer cost;
   /**
    * dakika tipinde
    */
   private Integer upgradeTime;

   private Integer townHallLevelRequired;
   private Integer laboratoryLevelRequired;

   private Integer capacity;
   private Integer productionPerHour;

   public static Level createNewResourceLevel(Integer index, Integer hitPoint, Integer cost, Integer upgradeTime, Integer townHallLevelRequired, Integer capacity, Integer productionPerHour){
      Level level = new Level();

      level.index = index;
      level.hitPoint = hitPoint;
      level.cost = cost;
      level.upgradeTime = upgradeTime;
      level.townHallLevelRequired = townHallLevelRequired;
      level.capacity = capacity;
      level.productionPerHour = productionPerHour;

      return level;

   }

   public static Level createNewTroopLevel(Integer index, Integer hitPoint, Integer cost, Integer upgradeTime, Integer laboratoryLevelRequired){
      Level level = new Level();

      level.index = index;
      level.hitPoint = hitPoint;
      level.cost = cost;
      level.upgradeTime = upgradeTime;
      level.laboratoryLevelRequired = laboratoryLevelRequired;

      return level;
   }

   public static Level createNewSpellLevel(Integer index, Integer cost, Integer upgradeTime, Integer laboratoryLevelRequired){
      Level level = new Level();

      level.index = index;
      level.hitPoint = 0;
      level.cost = cost;
      level.upgradeTime = upgradeTime;
      level.laboratoryLevelRequired = laboratoryLevelRequired;

      return level;
   }

   public static Level createNewBuildingLevel(Integer index, Integer hitPoint, Integer cost, Integer upgradeTime, Integer townHallLevelRequired) {
      Level level = new Level();

      level.index = index;
      level.hitPoint = hitPoint;
      level.cost = cost;
      level.upgradeTime = upgradeTime;
      level.townHallLevelRequired = townHallLevelRequired;

      return level;
   }

   public Integer getIndex() {
      return index;
   }

   public Integer getHitPoint() {
      return hitPoint;
   }

   public Integer getCost() {
      return cost;
   }

   public Integer getUpgradeTime() {
      return upgradeTime;
   }

   public Integer getTownHallLevelRequired() {
      return townHallLevelRequired;
   }

   public Integer getLaboratoryLevelRequired() {
      return laboratoryLevelRequired;
   }

   public Integer getCapacity() {
      return capacity;
   }

   public Integer getProductionPerHour() {
      return productionPerHour;
   }

   @Override
   public String toString() {
      return "Level{" +
              "index=" + index + ",cost=" + (cost >= 1000000  ? cost / 1000000d + "M" : cost / 1000 + "K") +
              '}';
   }
}
