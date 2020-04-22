package StructuralPattern.ProxyPattern.ProxyDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 静态代理--》动态切换数据源
 */
public class StaticProxyDemo {
    public static void main(String[] args) {
        try{

            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
