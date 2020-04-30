package behavioralpattern.strategypattern.demo1;

/**
 *  但是此案例并不实用，因为我们做活动时候往往是要根据不同的需求对促销策略进行
 *  动态选择，并不会一次性执行多种优惠。所以我们的代码通常会这样写
 *          PromotionActivity pa = null;
 *         String promotionKey = "COUPON";
 *         if (StringUtils.pathEquals(promotionKey,"COUPON")){
 *             pa =  new PromotionActivity(new CouponStrategy());
 *         }else if (StringUtils.pathEquals(promotionKey,"CASHBACK"){
 *             pa = new PromotionActivity(new CashbackStrategy());
 *         }
 *         pa.execute();
 *
 *
 */

public class Test {
    public static void main(String[] args) {

        //------------v1-----------
        PromotionActivity pa1 = new PromotionActivity(new CouponStrategy());
        PromotionActivity pa2 = new PromotionActivity(new CashbackStrategy());

        pa1.execute();
        pa2.execute();

        //-----------v2------------

        PromotionStrateguFactory.getPromotionKeys();
        String promotionkey = "COUPON";

        IPromotionStrategy promotionStrategy = PromotionStrateguFactory.getPromotionStrategy(promotionkey);
        promotionStrategy.doPromotion();
    }
}
