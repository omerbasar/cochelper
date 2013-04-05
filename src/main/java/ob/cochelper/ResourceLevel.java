package ob.cochelper;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:13 PM
 */
public class ResourceLevel extends Level{

   Integer capacity;
   Integer productionPerHour;

   public ResourceLevel(Integer index, Integer hitPoint, Integer cost, Integer upgradeTime, Integer townHallLevelRequired, Integer capacity, Integer productionPerHour) {
      super(index, hitPoint, cost, upgradeTime, townHallLevelRequired);
      this.capacity = capacity;
      this.productionPerHour = productionPerHour;
   }

   public Integer getCapacity() {
      return capacity;
   }

   public Integer getProductionPerHour() {
      return productionPerHour;
   }
}
