package ob.cochelper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author omer
 */
public class ProductionStat {
   private Map<Resource, SingleStat> resourceSingleStatMap;
   private SingleStat buildTimeStat;

   public ProductionStat() {
      resourceSingleStatMap = new HashMap<Resource, SingleStat>(Resource.values().length);
      for (Resource resource : Resource.values()) {
         resourceSingleStatMap.put(resource, new SingleStat());
      }
      buildTimeStat = new SingleStat();
   }

   public ProductionStat incrementBuildTimeElapsed(Long increment){
      buildTimeStat.incrementElapsed(increment);
      return this;
   }

   public ProductionStat incrementBuildTimeRemaining(Long increment){
      buildTimeStat.incrementRemaining(increment);
      return this;
   }

   public ProductionStat incrementResourceElapsed(Resource resource, Long increment) {
      resourceSingleStatMap.put(resource, resourceSingleStatMap.get(resource).incrementElapsed(increment));
      return this;
   }

   public ProductionStat incrementResourceRemaining(Resource resource, Long increment) {
      resourceSingleStatMap.put(resource, resourceSingleStatMap.get(resource).incrementRemaining(increment));
      return this;
   }

   public SingleStat getResourceSingleStat(Resource resource) {
      return resourceSingleStatMap.get(resource);
   }

   public SingleStat getBuildTimeStat() {
      return buildTimeStat;
   }

   public void setBuildTimeStat(SingleStat buildTimeStat) {
      this.buildTimeStat = buildTimeStat;
   }

   public void print() {
      if(getBuildTimeStat().getRemaining() > 0L){
         System.out.println("Time: {elapsed : " + StringUtil.makeTimeReadable(getBuildTimeStat().getElapsed())
                 + ", remaining: " + StringUtil.makeTimeReadable(getBuildTimeStat().getRemaining())
                 + ", total: " + StringUtil.makeTimeReadable(getBuildTimeStat().getTotal())
                 +"}");
      }

      for (Resource resource : Resource.values()) {
         if(getResourceSingleStat(resource).getRemaining() > 0L){
            System.out.println(resource +": {used: " + StringUtil.makeResourceReadable(getResourceSingleStat(resource).getElapsed())
                    + ", remaining: " + StringUtil.makeResourceReadable(getResourceSingleStat(resource).getRemaining())
                    + ", total: " + StringUtil.makeResourceReadable(getResourceSingleStat(resource).getTotal())
                    +"}");
         }
      }
   }

   public void add(ProductionStat productionStat) {
      getBuildTimeStat().add(productionStat.getBuildTimeStat());
      for (Resource resource : Resource.values()) {
         getResourceSingleStat(resource).add(productionStat.getResourceSingleStat(resource));
      }
   }
}
