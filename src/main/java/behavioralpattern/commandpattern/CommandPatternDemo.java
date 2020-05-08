package behavioralpattern.commandpattern;

/**
 * 命令模式
 * 命令模式（CommandPattern）是对命令的封装，每一个命令都是一个操作；请求的一方
 * 发出请求要求执行一个操作；接受的一方收到请求，并执行操作。命令模式解耦了请求方
 * 和接受方，请求方只需请求执行命令，不用关心命令是怎样被接受，怎样被操作以及
 * 是否被执行等。命令模式属于行为型模式
 *
 * 在软件系统中，行为请求者与行为实现者通常是一种紧耦合关系，因为这样的实现简单
 * 明了。但紧耦合关系缺乏扩展性，在某些长河中，当需要为行为进行记录，撤销或重做
 * 等处理时，只能修改源码。而命令模式通过为请求与实现间引入一个抽象命令接口，解耦
 * 了请求与实现，并且中间件是抽象的，它可以有不同的子类实现，因此其具备扩展性。所
 * 以，命令模式的本质是解耦命令请求与处理。
 *
 * 应用场景
 * 当系统的某项箱操作具备命令语义是，且命令实现不稳定（变化），那么可以通过命令模式解耦
 * 请求与实现，利用抽象接口是请求方式代码架构稳定，封装接受方具体命令实现细节。
 * 接受方与抽象命令接口呈现弱耦合（内部方法无需一直），具备两个的扩展性。
 * 1、显示语义中具备“命令”的操作（如命令菜单，shell命令）
 * 2、请求调用者和请求的接收者需要解耦，是的调用者和接收者不直接交互
 * 3、需要抽象出等待执行的行为，比如撤销（Undo）操作和恢复（Redo）等操作
 * 4、需要支持命令宏（即命令组合操作）
 *
 * 包含四种角色
 * 接收者角色（Receiver）：该类负责具体实施或执行一个请求
 * 命令角色（Command）：定义需要执行的所有命令行为
 * 具体命令角色（ConcreteCommand）：该内部维护的一个接收者（Receiver），在其execute()方法中调用Reciver的相关方法
 * 请求者角色（Invoker）：接受客户端的命令，并执行命令
 *
 * 优点：
 * 1、通过引入中间件（抽象接口），解耦了命令请求与实现
 * 2、扩展性良好，可以和容易的增加新命令；
 * 3、支持组合命令，支持命令队列
 * 4、可以在现有命令的基础上，增加额外功能
 * 缺点：
 * 具体命令类可能过多
 * 命令模式的结果其实就是接受方的执行结果，但是为了以命令的形式进行价格，解耦请求与实现，引入了
 * 额外类型结构（引入了请求方与抽象命令接口，增加了理解上的困难）
 *
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        GPlayer gPlayer = new GPlayer();

        Controller controller = new Controller();
        controller.execute(new PlayAction(gPlayer));

        controller.addAction(new PauseAction(gPlayer));
        controller.addAction(new PlayAction(gPlayer));
        controller.addAction(new SpeedAction(gPlayer));
        controller.addAction(new SpeedAction(gPlayer));
        controller.executes();
    }
}
