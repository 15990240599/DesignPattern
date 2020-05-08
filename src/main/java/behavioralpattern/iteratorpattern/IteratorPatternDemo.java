package behavioralpattern.iteratorpattern;

/**
 * 迭代器模式
 * 迭代器模式（IteratorPattern）又称为游标模式（CursorPattern），它提供一种顺序
 * 访问集合/容器对象元素的方法，而又无须暴露集合内部表示。迭代器模式可以为不同的容器
 * 提供一致的遍历行为，而不用关心容器内元素组成结构，属于行为型模式。
 * 迭代器模式的本质是抽离集合对象迭代行为到迭代器中，提供一致访问接口
 *
 * 应用场景
 * 我们把多个对象聚合在一起形成的总体称之为集合（Aggregate），集合对象是能够包容一
 * 组对象的容器对象。不同的集合其内部元素的聚合结构可能不同，而迭代器模式屏蔽了内部元
 * 素获取细节，为外部提供一致的元素访问结构，解耦了元素迭代与集合对象间的耦合，并且通
 * 过提供不同的迭代器，可以为同个集合对象提供不同顺序的元素访问行为，扩展了集合对象元
 * 素迭代功能，符合开闭原则
 * 1、访问一个集合对象的内容而无需暴露它的内部表示
 * 2、为遍历不同的集合结构提供一个统一的访问接口
 *
 * 包含三种角色
 * 抽象迭代器（Iterator）：抽象迭代器负责定义访问和遍历元素的接口
 * 具体迭代器（ConcreteIterator）：提供具体的元素遍历行为
 * 抽象容器（Aggregate）：负责定义提供具体迭代器的接口
 * 具体容器（ConcreteAggregate）：创建具体迭代器
 *
 * 迭代器模式和组合模式，两者存在一定的相似性，但是组合模式解决的是统一树形结构各层次
 * 访问接口，迭代器模式解决的是统一各级河对象元素遍历接口
 *
 * 迭代器模式优缺点：
 * 优点：
 * 1、多态迭代：为不同的聚合结构提供一致的遍历接口，即一个迭代接口可以访问不同的集合
 * 对象；
 * 2、接话集合对象接口：迭代器模式将集合对象本省应该提供的元素迭代接口抽象到了迭代器
 * 中，使集合无需关心具体迭代行为
 * 3、元素迭代功能多样化：每个集合对象都可以提供一个或多个不同的迭代器，使得同种元素
 * 聚合结构可以有不同的迭代行为；
 * 4、解耦迭代与集合：迭代器模式封装了具体的迭代算法，迭代算法的变化不会影响到对象架构
 * 缺点：
 * 1、对于比较简单的遍历（像数组或者有序列表），使用迭代器方式遍历较为繁琐。
 *
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        Course java = new Course("Java架构");
        Course javaBase = new Course("Java入门");
        Course design = new Course("Java设计模式精讲");
        Course ai = new Course("人工智能");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.add(java);
        courseAggregate.add(javaBase);
        courseAggregate.add(design);
        courseAggregate.add(ai);

        System.out.println("----课程列表----");
        printCourse(courseAggregate);

        courseAggregate.remove(ai);

        System.out.println("-----删除操作之后的课程列表-----");
        printCourse(courseAggregate);
    }

    private static void printCourse(CourseAggregate courseAggregate) {
        Iterator<Course> iterator = courseAggregate.iterator();
        while (iterator.hasNext()){
            Course course = iterator.next();
            System.out.println("《" + course.getName() + "》");
        }
    }
}
