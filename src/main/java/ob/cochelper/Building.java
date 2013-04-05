package ob.cochelper;

import java.util.List;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:16 PM
 */
public class Building {

   private BuildingType type;
   private BuildingCategory category;
   private Integer level;

   protected Building(BuildingType type, BuildingCategory category, Integer level) {
      this.type = type;
      this.category = category;
      this.level = level;
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

   public Long getRemainingBuildTime(){
      Long remainingBuildTime = 0L;
      for(int i = level ; i < getLevels().size(); i ++){
         remainingBuildTime += getLevels().get(i).getUpgradeTime();
      }
      return remainingBuildTime;
   }

   public Long getRemainingResource(){
      Long remainingResource = 0L;
      for(int i = level ; i < getLevels().size(); i ++){
         remainingResource += getLevels().get(i).getCost();
      }
      return remainingResource;
   }

   public Long getElapsedBuildTime(){
      Long elapsedBuildTime = 0L;
      for(int i = 0 ; i < level; i ++){
         elapsedBuildTime += getLevels().get(i).getUpgradeTime();
      }
      return elapsedBuildTime;
   }

   public Long getElapsedResource(){
      Long elapsedResource = 0L;
      for(int i = 0 ; i < level; i ++){
         elapsedResource += getLevels().get(i).getCost();
      }
      return elapsedResource;
   }

   public List<? extends Level> getLevels(){
      return LevelHelper.getLevels(type);
   }

   public static void main(String[] args) {
      int a = (int) 10L;
      System.out.println("a = " + a);
   }
}
