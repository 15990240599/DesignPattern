package creationalPattern.singletonPattern;

/**
 * 双重检查锁单例;
 * 加volatile防止DCL失效
 */
public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton(){}

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    return new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
