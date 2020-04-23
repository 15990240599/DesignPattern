package creationalpattern.singletonpattern;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            //通过反射回去私有化的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问
            c.setAccessible(true);

            //暴力初始化
            Object o1 = c.newInstance();

            //调用两次构造方法，相当于"new" 了两次，犯了原则性错误
            Object o2 = c.newInstance();

            System.out.println(o1 == o2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
