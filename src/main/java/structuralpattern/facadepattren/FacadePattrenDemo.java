package structuralpattern.facadepattren;

/**
 * 门面模式：
 * 又叫外观模式，提供了一个统一的接口，用来访问子系统中的一群接口。其主要特征是定义一个高层接口，
 * 让子系统更容易使用，属于结构性模式
 *
 * 应用场景
 * 1、子系统越来越复杂，增加门面模式提供简单接口
 * 2、构建多层系统结构，利用门面对象作为每层的入口，简化层间调用
 *
 * 主要包含2种角色
 * 外观角色（Facade）：也称门面角色，系统对外的统一接口
 * 子系统角色（SubSystem）：可以同时有一个或多个SubSystem。每个SubSystem都不是一个单独的类，
 * 而是一个类的集合。SubSystem并不知道Facade的存在，对SubSystem而言，Facade只是另一个客户端
 * 而已（即Facade对SubSystem透明）
 *
 * 优点：
 * 1、简化了调用过程，无需深入了解子系统，以防给子系统带来风险
 * 2、减少系统依赖、松散耦合
 * 3、更好地划分访问层次，提高了安全性
 * 4、遵循迪米特法则，即最少知道原则
 * 缺点：
 * 1、当增加子系统和扩展子系统行为时，可能容易带来未知风险
 * 2、不符合开闭原则
 * 3、某些情况下可能违背单一职责原则
 *
 * 与静态代理模式区别
 * 代理模式注重扩展增强，门面模式注重组合
 */
public class FacadePattrenDemo {


    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}
