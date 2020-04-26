package structuralpattern.adapterpattern;

import com.sun.corba.se.spi.oa.ObjectAdapter;

/**
 * 适配器模式（AdapterPattren）
 * 又叫变压器模式，他的功能是将一个类的接口编程客户端所期望的另一种接口，从而使原本因接口不匹配
 * 而导致无法在一起工作的两个类能够在一起工作，属于结构型模式
 *
 * 使用场景
 * 1、抑菌存在额类，他的方法和需求不匹配（方法结果相同或相似）的情况
 * 2、适配器模式不是软件设计阶段考虑的的设计模式，是随着软件维护，由于不同产品、不同厂家造成功能
 * 类似而接口不相同情况下的解决方案。有点像亡羊补牢的感觉
 *
 * 适配器模式一般包含三种角色：
 * 目标角色（Target）：也就是我们期望的接口
 * 源角色（Adaptee）：存在于系统中，内容满足客户需求（需转换），但是接口不匹配的接口实例
 * 适配器（Adapter）：将源角色（Adaptee）转换为目标角色（Target）的类实例
 *
 * 适配器模式各角色之间的关系如下：
 * 假设当前系统中，客户端需要访问的是Target接口，但是Target接口没有一个实例符合需求，
 * 而Adaptee实例符合需求，但是客户端无法直接使用Adaptee（接口不兼容）；因此，我们需要一个
 * 适配器(Adapter)来进行中转，让Adaptee能转换为Target接口形式；
 *
 * 适配器模式有3中形式：类适配器、对象适配器、接口适配器
 *
 * 类适配器：
 * 类适配器的原理就是通过继承来实现适配器的功能。具体做法：让Adapter实现Target接口，并且
 * 集成Adpatee，这样Adapter就具备Target和Adaptee的特性，就能将两者进行转换。
 * 对象适配器：
 * 对象适配器的原理就是通过组合来实现适配器的功能。具体做法：让Adapter实现Target接口，
 * 然后内部持有Adaptee实例，然后在Target接口规定的方法内转换Adaptee
 * 接口适配器：
 * 接口适配器的关注点与类适配器和对象适配器的关注点不太一样，类适配器和对象适配器着重于将
 * 系统存在的一个角色（Adaptee）转换成目标接口（Target）所需内容，而接口适配额使用场景是
 * 解决接口方法过多，如果直接实现接口，那么类会多处许多空实现的方法，类显得很臃肿。
 * 此时，使用接口适配器就能让我们只实现我们需要的接口犯法，让目标更清晰
 *
 * 适配器模式的优缺点：
 * 优点：
 * 1、能提高类的透明性和复用，现有的类复用但不需要改变
 * 2、目标类和适配器类解耦，提高程序的扩展性
 * 3、在很多业务场景中符合开闭原则
 * 缺点：
 * 1、适配器编写过程需要考虑全面，可能增加系统的复杂性
 * 2、增加代码的阅读难度，降低代码可读性，过多使用适配器会使系统的代码变得凌乱
 *
 */

public class AdapterPatternDemo {
    public static void main(String[] args) {
        DC5 adapter = new ClassPowerAdapter();
        adapter.outputDC5V();

        DC5 objectAdapter = new ObjectPowerAdapter(new AC220());
        objectAdapter.outputDC5V();
    }

}
