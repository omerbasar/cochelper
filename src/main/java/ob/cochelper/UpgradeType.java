package ob.cochelper;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 10:58 PM
 */
public enum UpgradeType {

   BARBARIAN(Resource.ELIXIR),
   ARCHER(Resource.ELIXIR),
   GOBLIN(Resource.ELIXIR),
   GIANT(Resource.ELIXIR),
   WALL_BREAKER(Resource.ELIXIR),
   BALLOON(Resource.ELIXIR),
   WIZARD(Resource.ELIXIR),
   HEALER(Resource.ELIXIR),
   DRAGON(Resource.ELIXIR),
   PEKKA(Resource.ELIXIR),
   LIGHTENING_SPELL(Resource.GOLD),
   HEALING_SPELL(Resource.GOLD),
   RAGE_SPELL(Resource.GOLD),
   JUMP_SPELL(Resource.GOLD),
   SANTAS_SURPRISE_SPELL(Resource.GOLD),
   MINION(Resource.DARK_ELIXIR),
   HOG_RIDER(Resource.DARK_ELIXIR),
   VALKYRIE(Resource.DARK_ELIXIR),
   GOLEM(Resource.DARK_ELIXIR)
   ;

   private Resource resource;

   private UpgradeType(Resource resource) {
      this.resource = resource;
   }

   public Resource getResource() {
      return resource;
   }
}
