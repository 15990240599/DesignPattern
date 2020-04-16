package creationalPattern.singletonPattern;

/**
 * 懒汉式：
 * 双重检验，防止DCL失效，具有线程安全性
 */
public class LazyLoading {
    private  LazyLoading(){};

    private volatile static LazyLoading lazyLoading;

    private static LazyLoading getInstance(){
        if (lazyLoading != null){
            synchronized(LazyLoading.class){
                if (lazyLoading != null){
                    lazyLoading = new LazyLoading();
                }
            }
        }

        return lazyLoading;
    }
}
