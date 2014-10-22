package ob.cochelper;

import java.util.List;

import static ob.cochelper.LevelHelper.*;
/**
 * User: omer
 * Date: 3/24/13
 * Time: 10:58 PM
 */
public enum UpgradeType {

   BARBARIAN(Resource.ELIXIR, barbarianLevels),
   ARCHER(Resource.ELIXIR, archerLevels),
   GOBLIN(Resource.ELIXIR, goblinLevels),
   GIANT(Resource.ELIXIR, giantLevels),
   WALL_BREAKER(Resource.ELIXIR, wallBreakerLevels),
   BALLOON(Resource.ELIXIR, balloonLevels),
   WIZARD(Resource.ELIXIR, wizardLevels),
   HEALER(Resource.ELIXIR, healerLevels),
   DRAGON(Resource.ELIXIR, dragonLevels),
   PEKKA(Resource.ELIXIR, pekkaLevels),
   LIGHTENING_SPELL(Resource.ELIXIR, lighteningSpellLevels),
   HEALING_SPELL(Resource.ELIXIR, healingSpellLevels),
   RAGE_SPELL(Resource.ELIXIR, rageSpellLevels),
   JUMP_SPELL(Resource.ELIXIR, jumpSpellLevels),
   SANTAS_SURPRISE_SPELL(Resource.ELIXIR, santasSupriseSpellLevels),
   FREEZE_SPELL(Resource.ELIXIR, freezeSpellLevels),
   MINION(Resource.DARK_ELIXIR, minionLevels),
   HOG_RIDER(Resource.DARK_ELIXIR, hogRiderLevels),
   VALKYRIE(Resource.DARK_ELIXIR, valkyrieLevels),
   GOLEM(Resource.DARK_ELIXIR, golemLevels),
   WITCH(Resource.DARK_ELIXIR, witchLevels),
   LAVA_HOUND(Resource.DARK_ELIXIR, lavaHoundLevels)
   ;

   private Resource resource;

   private List<Level> levels;

   private UpgradeType(Resource resource, List<Level> levels) {
      this.resource = resource;
      this.levels = levels;
   }

   public Resource getResource() {
      return resource;
   }

   public List<Level> getLevels() {
      return levels;
   }

   public long getLevels(final int townHallLevel){
      return levels.stream().filter(level -> level.getTownHallLevelRequired() <= townHallLevel).count();
   }
}
