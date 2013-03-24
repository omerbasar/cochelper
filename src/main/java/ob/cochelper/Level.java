package ob.cochelper;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:13 PM
 */
public abstract class Level {

   private Integer index;
   private Resource resource;
   private Integer cost;

   /**
    * dakika tipinde
    */
   private Integer buildTime;

   protected Level(Integer index, Resource resource, Integer cost, Integer buildTime) {
      this.index = index;
      this.resource = resource;
      this.cost = cost;
      this.buildTime = buildTime;
   }

   public Integer getIndex() {
      return index;
   }

   public Resource getResource() {
      return resource;
   }

   public Integer getCost() {
      return cost;
   }

   public Integer getBuildTime() {
      return buildTime;
   }
}
