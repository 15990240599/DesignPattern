package creationalPattern.factoryPattern;

/**
 * 工厂方法模式
 * 工厂方法模式（Factory Method Pattern）是指定义一个创建对象的接口，但让实现这个接口的类来
 * 决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行。在工厂方法模式中用户秩序关心所需
 * 产品对应的工厂，无需关心创建细节，而且加入新的产品符合开闭原则。
 * 工厂方法模式主要解决产品扩展的问题，在简单工厂中，随着产品链的丰富，如果每个课程的创建逻辑
 * 有区别的话，工厂的职责会变得越来越多，有点像万能工厂，并不便于维护。根据单一职责原则我们
 * 将职责能继续拆分，专人干专事。Java课程由Java工厂创建，Python课程由Python工厂创建，
 * 对工厂本身也做一个抽象。
 *
 */
public class FactoryPatternDemo {
 
   public static void main(String[] args) {

   }
}