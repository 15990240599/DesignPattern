package behavioralpattern.delegatepattern;

/**
 * 委派模式（DelegatePattern）又叫委托模式，是一种面向对象的设计模式，允许对象组合
 * 实现与继承相同的代码重用。他的基本作用就是负责任务的调用和分配任务，是一种特殊的静
 * 态代理，可以理解为全权代理，但是代理模式注重过程，而委派模式注重结果。委派模式属
 * 于行为型模式，不属于23中设计模式中
 *
 * 应用场景：
 * 委派模式在Spring中应用非常多，常用的DispatcherServlet其实就是用到了委派模式。
 *
 * 委派模式有单个角色：
 * 抽象任务角色（Task）：定义一个抽象接口，他有若干实现类。
 * 委派者角色（Delegate）：负责在各个具体角色实例之间做出决策，判断并调用具体实现的方法
 * 具体任务角色（Concrete）：真正额执行角色
 *
 * 在源码中的应用：
 * JDK中有一个电信委派，众所周知JVM在加载类用的是双擎委派模型；一个类加载器在加载类是，
 * 先把这个请求委派给自己的父类加载器去执行，如果父类加载器还存在父类父类加载器，就继
 * 续向上委派，知道顶层的启动类加载器。如果父类加载器能够完成类加载，就成功返回，如果
 * 父类加载器无法完成加载，那么子加载器才会尝试自己去加载。从定义中可以看到双亲加载
 * 模型一个类加载器加载类是，首先不是自己加载，而是委派给父加载器。
 *
 * 委派模式优缺点
 * 优点：
 * 通过任务委派能够将一个大型的任务细化，然后通过统一管理这些子任务的完成情况的跟进,
 * 能够加快任务执行的效率
 * 缺点：
 * 任务委派方式需要根据任务的复杂程度进行不同的改变，在任务比较复杂的情况下坑你需要进行
 * 多重委派，容易造成紊乱
 */
public class DelegatePatternDemo {
    public static void main(String[] args) {
        new Boss().command("海报图", new Leader());
        new Boss().command("爬虫", new Leader());
        new Boss().command("修手机", new Leader());
    }
}
