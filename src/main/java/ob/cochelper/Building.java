package ob.cochelper;

import java.util.List;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:16 PM
 */
public abstract class Building {

   private BuildingType type;
   private BuildingCategory category;
   private Integer level;
   private Resource resource;

   protected Building(BuildingType type, Resource resource, BuildingCategory category, Integer level) {
      this.type = type;
      this.resource = resource;
      this.category = category;
      this.level = level;
   }

   public Resource getResource() {
      return resource;
   }

   public Integer getLevel() {
      return level;
   }

   public BuildingCategory getCategory() {
      return category;
   }

   public BuildingType getType() {
      return type;
   }

   public Integer getRemainingBuildTime(){
      Integer remainingBuildTime = 0;
      for(int i = level ; i < getLevels().size(); i ++){
         remainingBuildTime += getLevels().get(i).getBuildTime();
      }
      return remainingBuildTime;
   }

   public Integer getRemainingResource(){
      Integer remainingResource = 0;
      for(int i = level ; i < getLevels().size(); i ++){
         remainingResource += getLevels().get(i).getCost();
      }
      return remainingResource;
   }

   public List<? extends Level> getLevels(){
      return LevelHelper.getLevels(type);
   }
}
