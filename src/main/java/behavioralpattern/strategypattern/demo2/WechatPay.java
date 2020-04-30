package behavioralpattern.strategypattern.demo2;

/**
 * 微信支付
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
