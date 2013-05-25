package ob.cochelper;

import java.util.ArrayList;
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

   public List<Level> getRemainingLevels(int untilTownHallLevel){
      List<Level> levels = new ArrayList<Level>();
      for (Level currentLevel : getLevels()) {
         if(level < currentLevel.getIndex() && currentLevel.getTownHallLevelRequired() <= untilTownHallLevel){
            levels.add(currentLevel);
         }
      }
      return levels;
   }

   public Long getRemainingBuildTime(int untilTownHallLevel){
      Long remainingBuildTime = 0L;

      for (Level currentLevel : getRemainingLevels(untilTownHallLevel)) {
         remainingBuildTime += currentLevel.getUpgradeTime();
      }
      return remainingBuildTime;
   }

   public Long getRemainingResource(int untilTownHallLevel){
      Long remainingResource = 0L;
      for (Level currentLevel : getLevels()) {
         if(level < currentLevel.getIndex() && currentLevel.getTownHallLevelRequired() <= untilTownHallLevel){
            remainingResource += currentLevel.getCost();
         }
      }
      return remainingResource;
   }

   public Long getElapsedBuildTime(){
      Long elapsedBuildTime = 0L;
      for (Level currentLevel : getLevels()) {
         if(currentLevel.getIndex() <= level ){
            elapsedBuildTime += currentLevel.getUpgradeTime();
         }
      }
      return elapsedBuildTime;
   }

   public Long getElapsedResource(){
      Long elapsedResource = 0L;
      for (Level currentLevel : getLevels()) {
         if(currentLevel.getIndex() < level ){
            elapsedResource += currentLevel.getCost();
         }
      }
      return elapsedResource;
   }

   public List<? extends Level> getLevels(){
      return LevelHelper.getLevels(type);
   }

   @Override
   public String toString() {
      return type + "(" + level + ")";
   }
}
