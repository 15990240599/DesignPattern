package structuralpattern.proxypattern.proxdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService{

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService = orderService;
    }
    @Override
    public int createOrder(Order order) {
        brfore();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println(String.format("静态代理类自动分配到【DB_%s】数据源处理器",dbRouter));
        DynamicDataSourceEntry.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 0;
    }

    private void after() {
        System.out.println("Proxy after method");
    }

    private void brfore() {
        System.out.println("Proxy before method");
    }
}
