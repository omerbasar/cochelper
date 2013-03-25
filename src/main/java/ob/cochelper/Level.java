package ob.cochelper;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:13 PM
 */
public class Level {

   private Integer index;
   private Integer cost;

   /**
    * dakika tipinde
    */
   private Integer buildTime;

   protected Level(Integer index, Integer cost, Integer buildTime) {
      this.index = index;
      this.cost = cost;
      this.buildTime = buildTime;
   }

   public Integer getIndex() {
      return index;
   }

   public Integer getCost() {
      return cost;
   }

   public Integer getBuildTime() {
      return buildTime;
   }
}
