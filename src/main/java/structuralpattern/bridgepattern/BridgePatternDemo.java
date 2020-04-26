package structuralpattern.bridgepattern;

/**
 * 桥接模式（BridgePattern） 也称为桥梁模式、接口（Interface）模式或
 * 柄体（Handle and Body）模式，是将抽象部分与他的具体实现部分分离，
 * 是他们都可以独立的变化，属于结构型模式
 *
 * 桥接模式主要目的是通过组合的方式简历两个类直接的联系，而不是继承。
 * 但又类似于多重继承的方案，但是多重继承方案往往违背了类的单一职责原则，其复用性比较差，
 * 桥接模式是比多重继承更好的替代方案。桥接模式的核心在于解耦抽象和实现。
 *
 * 桥接模式主要包含四种角色：
 * 抽象（Abstraction）：该类持有一个对实现角色的引用，抽象角色中的方法需要实现角色来实现。
 * 抽象角色一般为抽象类（构造函数规定子类要传入一个实现对象）
 * 修正抽象（RefinedAbstraction）：Abstraction的具体实现，对Abstraction的方法进行完善
 * 和扩展；
 * 实现（Implementor）：确定实现维度的基本操作，提供Abstraction使用。该类一般为接口或
 * 抽象类
 * 具体实现（ConcreteImplementor）：Implementor的具体实现
 *
 * 应用场景
 * 当一个内部类具备两种或多种变化维度时，使用桥接模式可以解耦这些变化的维度，使高层代码架构
 * 稳定。桥接模式适用于一下几种业务场景：
 * 1、在抽象和具体实现之间需要增加更多的灵活性的场景
 * 2、一个类存在两个（或多个）独立变化的维度，而这两个（或多个）维度需要独立进行扩展
 * 3、不希望使用继承，或因为多层导致系统类的个数剧增
 *
 * 桥接模式的优缺点：
 * 通过上面的例子，我们能很好的感知到桥接模式遵循了里氏替换原则和依赖导致原则，最终实现了
 * 开闭原则，对修改关闭，对扩展开放。
 * 优点：
 * 1、分离抽象部门及其具体实现部分
 * 2、提高了系统的扩展性
 * 3、符合开闭原则
 * 4、符合合成复用原则
 * 缺点：
 * 1、增加了系统的理解与设计难度
 * 2、需要正确的识别系统中两个独立变化的维度
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        //来一个实现化角色
        IImplementor imp = new ConcreteImplementorA();
        //来一个抽象化角色，聚合实现
        Abstraction abs = new RefinedAbstraction(imp);
        //执行操作
        abs.operation();
    }
}
