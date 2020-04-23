package creationalpattern.prototypepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式适用一下场景
 * 1、类初始化消耗资源较多
 * 2、new产生的一个对象需要非常繁琐的过程（数据准备、访问权限等）
 * 3、构造函数比较复杂
 * 4、循环体中生产大量对象时
 * 在Spring中，原型模式应用的非常广泛。例如scope=“prototype”，在我们经常用的JSON.parseObject（）也是一种原型模式
 *
 *
 * 原型模式的优缺点
 * 优点：
 * 1、性能优良，Java自带的原型模式是给予二进制流的拷贝，比直接new一个对象性能上提升了许多
 * 2、可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一根并将其状态保存起来，
 * 简化了创建对象的过程，以便于在需要的时候使用（例如恢复到历史某一状态），
 * 可辅助实现撤销操作
 * 缺点：
 * 1、需要为每一个类配置一个克隆方法
 * 2、克隆方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违反开闭原则。
 * 3、在实现深克隆时需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，
 * 为了实现深克隆，每一层对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深拷贝、
 * 浅拷贝需要运用得当
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototypeV2 prototype = new ConcretePrototypeV2();
        prototype.setAge(18);
        prototype.setName("Tom");
        List<String> hobbis = new ArrayList<>();
        hobbis.add("书法");
        hobbis.add("美术");
        prototype.setHobbies(hobbis);
        System.out.println(prototype);
        //拷贝原型对象
        ConcretePrototypeV2 cloneType = prototype.deepClone();
        cloneType.getHobbies().add("技术控");

        System.out.println("原型对象：" + prototype);
        System.out.println("克隆对象：" + cloneType);
        System.out.println(prototype == cloneType);
        System.out.println("原型对象的爱好：" + prototype.getHobbies());
        System.out.println("克隆对象的爱好：" + cloneType.getHobbies());
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());
    }
}
