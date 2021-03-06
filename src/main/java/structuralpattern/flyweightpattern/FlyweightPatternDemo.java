package structuralpattern.flyweightpattern;

/**
 * 享元模式
 * 有称为轻量级模式，是对象池的一种实现。类似于线程池，线程池可以避免不停的创建和销毁多个对象。
 * 提供了减少对象数量从而改善应用所需的对象结构的方式。其宗旨是共享细粒度对象，将多个对同一对象
 * 的访问集中起来，不必为每个访问者创建一个单独的对象，以此来降低内存的消耗，属于结构型模式
 *
 * 享元模式把一个对象的状态分成内部状态和外部状态，内部状态即是不变的，外部状态是变化的；
 * 然后通过共享不变的部分，达到减少对象数量并节约内存的目的
 *
 * 享元模式的本质是缓存共享对象，降低内存消耗
 *
 * 享元模式有三个角色：
 * 抽象享元角色（Flyweight）：享元对象抽象类或者接口，同时定义出对象的外部状态和内部状态的
 * 接口或实现；
 * 具体享元角色（ConcreteFlyweight）：实现抽象角色定义的业务。该角色的内部状态处理应该与
 * 环境无关，不能出现会有一个操作改变内部状态，同时修改了外部状态
 * 享元工厂（FlyweightFactory）：负责管理享元对象池和创建享元对象
 *
 * 应用场景：
 * 当系统中多处需要同一组信息时，可以吧这些信息封装到一个对象中，然后对该对象进行缓存，这样一个
 * 对象就可以提供多处需要使用的地方，避免大量同一对象的多次创建，消耗大量内存空间。
 * 享元模式其实就是工厂模式的一个改进机制，享元模式同样要求创建一个或一组对象，并且就是通过工厂
 * 方法生成对象的，只不过享元模式中为工厂方法增加了缓存这一功能。主要总结为以下应用场景：
 * 1、常常应用与系统底层的开发，以便解决系统的性能问题
 * 2、系统有大量相似对象、需要缓冲池的场景
 *
 * 享元模式侧重点不是创建对象，而是共享
 *
 * 享元模式的内部状态和外部状态
 * 享元模式的定义为我们提出了两个要求：细粒度和共享对象。因为要求细粒度对象，所以不可避免的会使
 * 对象数量多且性质相近，此时我们就将这些对象的信息分为两个部分：内部状态和外部状态；
 * 内部状态指对象共享出来的信息，存储在享元对象内部并且不会随环境的改变而改变；外部状态指对象得
 * 依赖的一个标记，是岁环境改变而改变的、不可共享的状态
 * 比如，连接池中的连接对象，保存在连接对象中的用户名、密码连接url等信息，在创建对象的时候就已经设置好了，
 * 不会岁环境的改变而改变，这些为内部状态。而每个连接要回收利用时，我们需要把它标记为可用状态，这些为外部状态
 *
 * 优点：
 * 1、减少对象的创建，降低内存中对象的数量，降低系统的内存消耗，提高效率
 * 2、减少内存之外的其他资源占用
 * 缺点：
 * 1、关注内、外部状态、关注线程安全问题；
 * 2、使系统、程序的逻辑复杂化
 *
 */
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("余姚北","杭州");
        ticket.showInfo("二等座");
        ITicket ticket1 = TicketFactory.queryTicket("余姚北","杭州");
        ticket1.showInfo("二等座");
    }
}
