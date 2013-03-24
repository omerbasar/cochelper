package ob.cochelper;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:25 PM
 */
public final class DefensiveBuilding extends Building{

   public DefensiveBuilding(BuildingType buildingType, Integer level) {
      super(buildingType, Resource.GOLD, BuildingCategory.DEFENSE, level);
   }


}
