package ob.cochelper;

import java.util.List;

import static ob.cochelper.LevelHelper.*;
/**
 * User: omer
 * Date: 3/24/13
 * Time: 10:58 PM
 */
public enum BuildingType {

   CANNON(Resource.GOLD, cannonLevels, 6),
   ARCHER_TOWER(Resource.GOLD, archerTowerLevels, 7),
   MORTAR(Resource.GOLD, mortarLevels, 4),
   WIZARD_TOWER(Resource.GOLD, wizardTowerLevels, 4),
   AIR_DEFENSE(Resource.GOLD, airDefenseLevels, 4),
   HIDDEN_TESLA(Resource.GOLD, hiddenTeslaLevels, 4),
   XBOW(Resource.GOLD, xBowLevels, 3),
   INFERNO_TOWER(Resource.GOLD, infernoTowerLevels, 2),
   BOMB(Resource.GOLD, bombLevels, 6),
   GIANT_BOMB(Resource.GOLD, giantBombLevels, 5),
   AIR_BOMB(Resource.GOLD, airBombLevels, 5),
   SEEKING_AIR_MINE(Resource.GOLD, seekingAirMineLevels, 5),
   SKELETON_TRAP(Resource.GOLD, skeletonTrapLevels, 3),
   ELIXIR_COLLECTOR(Resource.GOLD, Resource.ELIXIR, elixirCollectorLevels, 7),
   GOLD_MINE(Resource.ELIXIR, Resource.GOLD, goldMineLevels, 7),
   DARK_ELIXIR_DRILL(Resource.ELIXIR, Resource.DARK_ELIXIR, darkElixirDrillLevels, 3),
   GOLD_STORAGE(Resource.ELIXIR, goldStorageLevels, 4),
   ELIXIR_STORAGE(Resource.GOLD, elixirStorageLevels, 4),
   DARK_ELIXIR_STORAGE(Resource.ELIXIR, darkElixirStorageLevels, 1),
   BUILDERS_HUT(Resource.GEM, buildersHutLevels, 5),
   ARMY_CAMP(Resource.ELIXIR, armyCampLevels, 4),
   BARRACK(Resource.ELIXIR, barrackLevels, 4),
   DARK_BARRACK(Resource.ELIXIR, darkBarrackLevels, 2),
   LABORATORY(Resource.ELIXIR, laboratoryLevels, 1),
   SPELL_FACTORY(Resource.ELIXIR, spellFactoryLevels, 1),
   TOWN_HALL(Resource.GOLD, townHallLevels, 1),
   CLAN_CASTLE(Resource.GOLD, clanCastleLevels, 1),
   WALL(Resource.GOLD, wallLevels, 250),
   BARBAR_KING(Resource.DARK_ELIXIR, barbarKingLevels, 1),
   ARCHER_QUENN(Resource.DARK_ELIXIR, archerQueenLevels, 1);

   private Resource resource;
   private Resource resourceProduced = null;
   private List<Level> levels;
   private int maxAvailable;

   private BuildingType(Resource resource, List<Level> levels, int maxAvailable) {
      this.resource = resource;
      this.levels = levels;
      this.maxAvailable = maxAvailable;
   }

   private BuildingType(Resource resource, Resource resourceProduced, List<Level> levels, int maxAvailable) {
      this.resource = resource;
      this.resourceProduced = resourceProduced;
      this.levels = levels;
      this.maxAvailable = maxAvailable;
   }

   public Resource getResource() {
      return resource;
   }

   public Resource getResourceProduced() {
      return resourceProduced;
   }

   public Boolean isProductionBuilding(){
      return resourceProduced != null;
   }

   public List<Level> getLevels() {
      return levels;
   }

   public int getMaxAvailable() {
      return maxAvailable;
   }
}
