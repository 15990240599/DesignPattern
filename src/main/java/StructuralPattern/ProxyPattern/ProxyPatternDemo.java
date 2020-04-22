package StructuralPattern.ProxyPattern;

/**
 * 代理模式
 *
 * 代理模式一般包含三种角色
 * 抽象主题角色（Subject）：抽象主题类的主要职责是声明真实主题与代理的共同接口方法，
 * 该类可以是接口也可以是抽象类
 * 真实主题角色（RealSubject）：该类也被称为被代理类，该类定义了代理所表示的真实对象，
 * 是负责执行系统真正的业务逻辑对象
 * 代理主题角色（Proxy）：也被称为代理类，其内部持有RealSubject的引用，因此具备完全
 * 的对RealSubject的代理权。客户端调用代理对象的方法，同时也调用被代理对象的方法，
 * 但是会在代理对象前后增加一些处理代码
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new ZhangSan());
        zhangsan.findLove();
    }

}
