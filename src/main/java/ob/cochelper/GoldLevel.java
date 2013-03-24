package ob.cochelper;

/**
 * User: omer
 * Date: 3/24/13
 * Time: 7:15 PM
 */
public class GoldLevel extends Level{

   protected GoldLevel(Integer index, Integer cost, Integer buildTime) {
      super(index, Resource.GOLD, cost, buildTime);
   }
}
