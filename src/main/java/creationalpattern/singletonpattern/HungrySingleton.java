package creationalpattern.singletonpattern;

/**
 * 饿汉式
 * 适用于单例对象较少的情况。
 * 这样写可以保证绝对线程安全，执行效率比较高。
 * 缺点：
 * 所有对象类加载的时候就实例化，如果系统中有大批量的单例对象存在，那系统
 * 初始化时就会导致大量的内存浪费。也就是说，不管对象用与不用都占着空间，
 * 浪费了内存
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    private static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
