package structuralpattern.proxypattern;

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
