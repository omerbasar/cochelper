package ob.cochelper;

import java.util.ArrayList;
import java.util.List;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:16 PM
 */
public class Upgrade {

   private UpgradeType type;
   private UpgradeCategory category;
   private Integer level;

   protected Upgrade(UpgradeType type, UpgradeCategory category, Integer level) {
      this.type = type;
      this.category = category;
      this.level = level;
   }

   public Integer getLevel() {
      return level;
   }

   public UpgradeType getType() {
      return type;
   }

   public UpgradeCategory getCategory() {
      return category;
   }

   public List<Level> getRemainingLevels(int untilLaboratoryLevel){
      List<Level> levels = new ArrayList<Level>();
      for (Level currentLevel : getLevels()) {
         if(level < currentLevel.getIndex() && currentLevel.getLaboratoryLevelRequired() <= untilLaboratoryLevel){
            levels.add(currentLevel);
         }
      }
      return levels;
   }

   public List<Level> getElapsedLevels(){
      List<Level> levels = new ArrayList<Level>();
      for (Level currentLevel : getLevels()) {
         if(currentLevel.getIndex() <= level ){
            levels.add(currentLevel);
         }
      }
      return levels;
   }

   public Long getRemainingBuildTime(int untilLaboratoryLevel){
      Long remainingBuildTime = 0L;
      for (Level currentLevel : getRemainingLevels(untilLaboratoryLevel)) {
         remainingBuildTime += currentLevel.getUpgradeTime();
      }
      return remainingBuildTime;
   }

   public Long getRemainingResource(int untilLaboratoryLevel){
      Long remainingResource = 0L;

      for (Level currentLevel : getRemainingLevels(untilLaboratoryLevel)) {
         remainingResource += currentLevel.getCost();
      }
      return remainingResource;
   }

   public Long getElapsedBuildTime(){
      Long elapsedBuildTime = 0L;
      for (Level currentLevel : getElapsedLevels()) {
         elapsedBuildTime += currentLevel.getUpgradeTime();
      }
      return elapsedBuildTime;
   }

   public Long getElapsedResource(){
      Long elapsedResource = 0L;
      for (Level currentLevel : getElapsedLevels()) {
         elapsedResource += currentLevel.getCost();
      }
      return elapsedResource;
   }

   public List<? extends Level> getLevels(){
      return type.getLevels();
   }

   @Override
   public String toString() {
      return type + "(" + level + ")";
   }
}
