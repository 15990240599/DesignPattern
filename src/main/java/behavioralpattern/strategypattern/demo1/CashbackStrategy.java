package behavioralpattern.strategypattern.demo1;

/**
 * 返现促销策略类
 */
public class CashbackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用返现促销抵扣");
    }
}
