package creationalPattern.singletonPattern;

/**
 * 这种形式兼顾饿汉式单例模式的内存浪费问题和synchronize的性能问题
 * 完美的屏蔽了这两个缺点
 */
public class LazyInnerClassSingleton {
    //-----v1-----
//    /*
//     * 使用LazyInnerClassSingleton的时候，默认会先初始化内部类
//     * 如果没使用，则内部类是不加载的
//     */
//
//    private LazyInnerClassSingleton(){}
//
//    public static final LazyInnerClassSingleton getInstance(){
//        //在返回结果以前，一定会先加载内部类
//        return LazyHolder.LAZY;
//    }
//
//    //默认不加载
//    private static class LazyHolder{
//        private static final  LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
//    }
    
    //-----v2-----
    //防止反射破坏单例
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }
    
    private static class LazyHolder{
        private static final  LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
