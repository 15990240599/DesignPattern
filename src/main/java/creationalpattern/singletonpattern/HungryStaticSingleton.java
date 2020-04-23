package creationalpattern.singletonpattern;

/**
 * 饿汉式静态代码块单例模式
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){};

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
