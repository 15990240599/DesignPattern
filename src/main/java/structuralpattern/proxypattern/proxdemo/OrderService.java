package structuralpattern.proxypattern.proxdemo;

public class OrderService implements IOrderService{

    private OrderDao orderDao;

    public OrderService(){
        //如果使用Spring应该是自动注入的
        //为了使用方便，我们在构建方法中将OrderDao直接初始化
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService使用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
