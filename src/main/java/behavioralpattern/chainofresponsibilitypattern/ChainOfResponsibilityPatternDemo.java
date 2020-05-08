package behavioralpattern.chainofresponsibilitypattern;

/**
 * 责任链模式（ChainOfResponsibilityPattern）是将链中每一个节点看作是一个对象，
 * 每个节点处理的请求均不同，且内部自动维护一个下一个节点对象。当一个请求从链式的
 * 手段出发的时候，会沿着链的路径一次传递给每一个节点对象，知道有对象处理这个请求
 * 为止。属于行为型模式。
 *
 * 应用场景
 * 责任链模式主要是解耦了请求与处理，客户端只需将请求发送到链上即可，无需关心请求
 * 的具体内容和处理细节，请求会自动进行传递至有节点对象进行处理。
 * 1、多个对象可以处理同一请求，但具体由哪个对象处理则在运行时动态决定
 * 2、在不明确指定接受者的情况下，向多个对象中的一个提交一个请求
 * 3、可动态指定一组对象处理请求
 *
 * 包含两种角色
 * 抽象处理者（Handler）：定义一个请求处理的犯法，并维护一个下一个处理节点Handler
 * 对象的引用
 * 具体处理者（ConcreteHandler）：对请求进行处理，如果不感兴趣，则进行转发
 *
 * 责任链模式的本质是解耦请求与处理，让请求在处理链中能进行传递与被处理；理解责任链
 * 应当理解的是其模式而不是其具体数显，责任链模式的独到之处是将其节点处理者组合成了
 * 链式结构，并允许节点自身决定是否进行请求处理或转发，相当于让请求流动了起来
 *
 * 优点：
 * 1、将请求与处理解耦
 * 2、请求处理者（节点对象）只需关注自己感兴趣的请求进行处理即可，对于不感兴趣的请
 * 求，直接转发给下一级节点对象
 * 3.具备链式传递处理请求功能，请求发送者无需知晓链路结构，只需等待请求处理结果
 * 4、链路结构灵活，可以通过改变链路结构动态地新增或删减责任
 * 5、易于扩展新的请求处理类（节点），符合开闭原则。
 * 缺点：
 * 1、责任链太长或者处理时间过长，会影响整体性能
 * 2、如果节点对象存在循环引用时，会造成死循环，导致系统崩溃
 */
public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.login("tom", "666");
    }
}