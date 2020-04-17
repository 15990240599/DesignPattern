package creationalPattern.singletonPattern;

/**
 * 懒汉式：
 * 多线程下会出现线程安全问题
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton(){};

    private static LazySimpleSingleton lazySimpleSingleton = null;

    public static LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null ){
            return new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
