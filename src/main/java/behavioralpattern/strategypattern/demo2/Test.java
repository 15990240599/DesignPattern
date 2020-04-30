package behavioralpattern.strategypattern.demo2;

public class Test {
    public static void main(String[] args) {
        Order order = new Order("1", "2202200220220", 324.5);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
