package behavioralpattern.templatemethodpattern;

/**
 * 模板方法模式（TemplateMethodPattern）
 * 是指定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法
 * 的结构即可重定义该算法的某些特定步骤，属于行为型模式。
 * 模板方法模式实际上是封装了一个固定流程，该流程由几个步骤组成，具体步骤可以由子类进行
 * 不同实现，从而让固定的流程产生不同的结构。他非常简单，其实就是类的继承机制，但它却是
 * 一个应用非常广泛的模式。模板方法模式的本质是抽象封装流程，具体进行实现
 *
 * 应用场景
 * 当完成一个操作具有固定的流程时，由抽象固定流程步骤，具体步骤交给子类进行具体实现
 * （固定的流程，不同的实现）
 * 1、一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现
 * 2、各子类中公共的行为被提取出来并集中到一个公共的父类中，从而避免代码重复
 *
 * 包含两个角色：
 * 抽象模板（AbstractClass）：抽象模板类，定义了一套算法框架/流程
 * 具体实现（ConcreteClass）：具体实现类，对算法架构、流程的某些步骤进行了实现
 *
 * 优点：
 * 1、利用模板方法将相同处理逻辑的代码放到抽象父类中，可以提高代码的复用性
 * 2、将不同的逻辑写到不同的子类中，通过对子类的扩展增加新的行为，提高代码的扩展性
 * 3、吧不变的行为写在父类上，去除子类的重复代码，提供一个很好的代码复用平台，符合
 * 开闭原则
 *
 * 缺点：
 * 1、类数目的增加，每一个抽象类都需要一个子类来实现，这样导致类的个数增加
 * 2、类数量的增加，间接地增加了系统的复杂度
 * 3、继承关系自身缺点，如果父类添加新的抽象方法，所有的子类都要改一遍
 */
public class TemplateMethodPatternDemo {
}