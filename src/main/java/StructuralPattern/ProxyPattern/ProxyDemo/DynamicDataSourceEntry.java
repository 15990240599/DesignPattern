package StructuralPattern.ProxyPattern.ProxyDemo;

/**
 * 静态代理
 * 根据订单创建时间自动按年进行分库。
 * 根据开闭原则，我们修改原来写好的代码逻辑，通过代理对象来完成。
 * 先创建数据源路由对象，使用ThreadLocal的单例实现DynamicDataSourceEntry类
 */
public class DynamicDataSourceEntry {

    //默认数据源
    public final static String DEFAULT_SOURCE = null;

    public final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntry(){}

    //清空数据源
    public static void clear(){
        local.remove();
    }

    //获取当前正在使用的数据源名字
    public static String get(){
        return local.get();
    }

    //还原当前切换的数据源
    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }

    //设置已知名字的数据源
    public static void set(String source){
        local.set(source);
    }

    //根据年份动态设置数据源
    public static void set(int year){
        local.set("DE_" + year);
    }
}
