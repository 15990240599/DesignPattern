package behavioralpattern.strategypattern.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PromotionStrateguFactory {

    private static Map<String, IPromotionStrategy> PROMOTIONS = new HashMap<String, IPromotionStrategy>();

    static {
        PROMOTIONS.put(PromotinoKey.COUPON, new CouponStrategy());
        PROMOTIONS.put(PromotinoKey.CASHBACK, new CashbackStrategy());
        PROMOTIONS.put(PromotinoKey.GROUPBUY, new GroupbuyStrategy());
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    private PromotionStrateguFactory(){}

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    private interface PromotinoKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static Set<String> getPromotionKeys(){
        return PROMOTIONS.keySet();
    }
}
