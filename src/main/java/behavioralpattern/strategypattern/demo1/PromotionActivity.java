package behavioralpattern.strategypattern.demo1;

/**
 * 促销活动方案
 */
public class PromotionActivity {
    private IPromotionStrategy iPromotionStrategy;

    public PromotionActivity(IPromotionStrategy iPromotionStrategy) {
        this.iPromotionStrategy = iPromotionStrategy;
    }

    public void execute(){
        iPromotionStrategy.doPromotion();
    }
}
