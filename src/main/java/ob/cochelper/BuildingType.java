package ob.cochelper;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 10:58 PM
 */
public enum BuildingType {

   CANNON(Resource.GOLD),
   ARCHER_TOWER(Resource.GOLD),
   MORTAR(Resource.GOLD),
   WIZARD_TOWER(Resource.GOLD),
   AIR_DEFENSE(Resource.GOLD),
   HIDDEN_TESLA(Resource.GOLD),
   XBOW(Resource.GOLD),
   INFERNO_TOWER(Resource.GOLD),
   ELIXIR_COLLECTOR(Resource.GOLD, Resource.ELIXIR),
   GOLD_MINE(Resource.ELIXIR, Resource.GOLD),
   DARK_ELIXIR_DRILL(Resource.ELIXIR, Resource.DARK_ELIXIR),
   GOLD_STORAGE(Resource.ELIXIR),
   ELIXIR_STORAGE(Resource.GOLD),
   DARK_ELIXIR_STORAGE(Resource.ELIXIR),
   BUILDERS_HUT(Resource.GEM),
   ARMY_CAMP(Resource.ELIXIR),
   BARRACK(Resource.ELIXIR),
   DARK_BARRACK(Resource.ELIXIR),
   LABORATORY(Resource.ELIXIR),
   SPELL_FACTORY(Resource.ELIXIR),
   TOWN_HALL(Resource.GOLD),
   CLAN_CASTLE(Resource.GOLD),
   WALL(Resource.GOLD),
   BARBAR_KING(Resource.DARK_ELIXIR),
   ARCHER_QUENN(Resource.DARK_ELIXIR);

   private Resource resource;
   private Resource resourceProduced = null;

   private BuildingType(Resource resource) {
      this.resource = resource;
   }

   private BuildingType(Resource resource, Resource resourceProduced) {
      this.resource = resource;
      this.resourceProduced = resourceProduced;
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
}
