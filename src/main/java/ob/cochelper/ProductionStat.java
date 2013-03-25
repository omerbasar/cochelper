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
}
