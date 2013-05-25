package ob.cochelper;

/**
 * @author omer
 */
public class SingleStat {
   private Long elapsed = 0L;
   private Long remaining = 0L;

   public SingleStat incrementElapsed(Long increment){
      elapsed += increment;
      return this;
   }

   public void add(SingleStat singleStat){
      elapsed += singleStat.elapsed;
      remaining += singleStat.remaining;
   }

   public SingleStat incrementRemaining(Long increment){
      remaining += increment;
      return this;
   }

   public Long getElapsed() {
      return elapsed;
   }

   public Long getRemaining() {
      return remaining;
   }

   public void setElapsed(Long elapsed) {
      this.elapsed = elapsed;
   }

   public void setRemaining(Long remaining) {
      this.remaining = remaining;
   }

   public Double getElapsedPercentage() {
      return (((100 * elapsed) / (remaining + elapsed)) / 100d) * 100;
   }

   public Double getRemainingPercentage() {
      return 100 - getElapsedPercentage();
   }

   public Long getTotal() {
      return elapsed + remaining;
   }
}