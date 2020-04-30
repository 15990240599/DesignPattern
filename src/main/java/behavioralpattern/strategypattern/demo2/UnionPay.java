package behavioralpattern.strategypattern.demo2;

/**
 * 银联支付
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 200;
    }
}
