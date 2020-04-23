package creationalpattern.abstractfactorypattern;


/**
 * 抽象工厂模式
 *
 *抽象工厂模式（Abstract Factory Pattern）是指提供一个创建一系列相关或者相互依赖
 * 的接口，无须指定他们具体的类。客户端（应用层）不依赖与产品类实例如何被创建、实现等
 * 细节，强调的是一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量的重复
 * 的代码。需要提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具
 * 体实现。
 *
 *
 * 下面的代码完整描述了两个产品族Java课程和Python课程，也描述了两个产品等级视频和笔记。
 * 抽象工厂非常完美清晰地描述这样一层复杂的关系。但是如果再继续扩展产品等级，
 * 将源码Source也加入到课程中，那么我们的代码从抽象工厂，到具体工厂要全部调整，
 * 很显然不符合开闭原则。因此抽象工厂也是有缺点的：
 * 1、规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
 * 2、增加了系统的抽象性和理解难度
 */
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
      javaCourseFactory.createNote().edit();
      javaCourseFactory.createVideo().record();

      PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
      pythonCourseFactory.createNote().edit();
      pythonCourseFactory.createVideo().record();
   }
}