package structuralpattern.proxypattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeipo implements InvocationHandler {

    private Object target;

    public IPerson getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();

        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    /**
     *
     * @param proxy 代理的对象
     * @param method 代理对象调用的方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       before();
       Object result = method.invoke(this.target,args);
       after();
       return null;
    }

    private void after() {
        System.out.println("双方同意");
    }

    private void before() {
        System.out.println("开始物色");
    }
}
