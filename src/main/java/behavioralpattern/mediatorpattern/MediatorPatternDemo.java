package behavioralpattern.mediatorpattern;

/**
 * 中介者模式（MediatorPattern）又称为调节者模式或调停者模式。用一个中介对象封装一系列
 * 的对象交互，中介者使个对象不需要显示的相互作用，从而使其耦合松散，而且可以独立地改变
 * 它们之间的交互。属于行为型模式。
 *
 * 中介者模式包装了一系列对象相互作用的方式，使得这些对象不必相互明显作用。从而使它们可以
 * 松散耦合。当某些对象之间的作用发生改变时，不会立即影响其他的一些对象之间的作用。
 * 保证这些作用可以彼此独立的变化。其核心思想是，通过中介者解耦系统各层次对象的直接耦合，
 * 层次对象的对外依赖通信统统交由中介者转发
 *
 * 中介者模式是用来降低多个对象和类之间的通信复杂性。这种模式通过提供一个中介类，将系统各层次
 * 对象间的多对多关系变成一对多关系，中介者对象可以将复杂的王庄结构变成以调节者为中心的星形
 * 结构，达到降低系统的复杂性，提高可扩展性的作用。
 * 若系统各层次对象之间存在大量的关联关系，即层次对象呈复杂的网状结构，如果直接让它们紧耦合
 * 通信，会造成系统结构变得异常复杂，且其中某个层次对象发生改变，则与其紧耦合的相应层次对象
 * 也需要进行修改，系统很难进行维护。而通过该系统增加一个中介者层次对象，让其他个层次需要对
 * 外通信的行为统统交由中介者进行转发，系统呈现以中介者为中心进行通讯的星型结构，系统的复杂
 * 性大大降低
 * 简单的说就是多个类相互耦合，形成了网状结构，则考虑使用中介者模式进行优化。总结中介者模式
 * 使用于一下场景：
 * 1、系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解；
 * 2、交互的公共行为，如果需要改变行为则可以增加新的中介类
 *
 * 中介者模式主要包含四个角色：
 * 抽象中介者（Mediator）：定义统一的接口，用于个同事角色之间的通信；
 * 具体中介者（ConcreteMediator）：从具体的同事对象接收消息，向具体同事对象发出命令，协调
 * 个同事间的写作
 * 抽象同事类（Colleague）：每一个同事对象均需要依赖中介者角色，与其他同事间通信时，交由
 * 中介者进行转发写作；
 * 具体同事类（ConcreteColleague）：负责实现自发行为（Self-Method）,转发依赖方法（Dep-Method)
 * 交由中介者进行协调
 *
 * 中介者模式的优缺点
 * 优点：
 * 1、减少类间依赖，将多对多依赖转化成了一对多，降低了类间耦合
 * 2、类间各司其职，符合迪米特法则
 * 缺点:
 * 中介者模式中将原本多个对象直接的相互依赖变成了中介者和多个同事类的依赖关系。当同事
 * 类越多时，中介者会月臃肿，变得复杂且难以维护
 *
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();
        User tom = new User("Tom", room);
        User jerry = new User("Jerry", room);
        tom.sendMessage("Hi I am Tom");
        jerry.sendMessage("Hello My name is jerry");
    }
}