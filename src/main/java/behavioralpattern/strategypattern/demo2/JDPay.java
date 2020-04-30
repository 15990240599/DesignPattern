package behavioralpattern.strategypattern.demo2;

/**
 * 京东白条支付
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
