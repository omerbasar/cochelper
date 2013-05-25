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

   protected Level(Integer index, Integer hitPoint, Integer cost, Integer upgradeTime, Integer townHallLevelRequired) {
      this.index = index;
      this.hitPoint = hitPoint;
      this.cost = cost;
      this.upgradeTime = upgradeTime;
      this.townHallLevelRequired = townHallLevelRequired;
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

   @Override
   public String toString() {
      return "Level{" +
              "index=" + index +
              '}';
   }
}
