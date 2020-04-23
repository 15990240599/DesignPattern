package structuralpattern.decoratoroattern;

/**
 * 也称为包装模式（Wrapper Pattern）
 * 是指在不改变原有对象的基础之上，将功能附加到对象上，提供了比集成更有弹性的替代方案（扩展
 * 原有对象的功能），属于结构型模式
 *
 * 装饰器模式的核心是扩展功能。使用装饰器模式可以透明且动态额扩展类的功能。
 * 装饰器模式主要用于透明且动态地扩展类的功能。其实现原理为：让装饰器实现
 * 包装类（ConcreteComponent）相同的接口（Component）（使得装饰器与被扩展类类型一致），
 * 并在构造函数中传入改接口（Component）对象，然后就可以在接口需要实现的方法中在被包装类对象
 * 的现有功能上添加新功能了。而且由于装饰器与被包装类属于同一类型（均为Component），且
 * 构造函数的参数为其实现接口类（Component），因此装饰器模式具备嵌套扩展功能，这样我们就能使用
 * 装饰器模式一层一层的对最底层被包装类进行功能扩展了
 *
 * 抽象组件（Component）：可以是一个接口或者抽象类，其充当被装饰类的原始对象，规定了被装饰对象的行为
 * 具体组件（ConcreteComponent）：实现/继承Component的一个具体对象，即被装饰对象
 * 抽象装饰器（Decorator）：通用的装饰ConcreteComponent的装饰器，其内部必然又一个属性指向
 * Component抽象组件；其实现一般是一个抽象类，主要是为了让其子类按照其构造形式传入一个Component
 * 抽象组件，这是强制的通用行为（当然，如果系统中装饰逻辑单一，并不需要实现许多装饰器，那么我们
 * 可以直接省略该类，而直接实现一个具体装饰器（ConcreteDecorator）即可）
 * 具体装饰器（ConcreteDecorator）：Decorator的具体实现类，理论上，每个ConcreteDecorator都扩
 * 展了Component对象的一种功能
 *
 * 适用场景
 * 1、用于扩展一个类的功能或给一个类添加附加职责
 * 2、动态的给一个对象添加功能，这些功能可以在动态的撤销
 * 3、需要为一批的兄弟类进行改装或加装功能
 *
 * 与静态代理模式区别
 * 静态代理不一定满足is-a的关系，静态代理会做功能增强，同一个职责变得不一样
 * 比如这里：装饰器模式始终围绕吃煎饼，而代理可能会添加买煎饼的动作
 *
 *
 * 优点：
 * 1、装饰器是继承的有力补充，比继承灵活，不改变原有对象的情况下动态的给一个对象扩展功能，即插即用
 * 2、通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同的效果
 * 3、装饰器完全遵守开闭原则
 * 缺点：
 * 1、会出现更多代码，更多的类，增加程序复杂性
 * 2、动态装饰时，多层装饰时会更复杂
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Battercake battercake;

        //路边买一个煎饼
        battercake = new BaseBattercake();
        //加一个鸡蛋
        battercake = new EggDecorator(battercake);
        //加香肠
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() + ",总价:" + battercake.getPrice());
    }
}
