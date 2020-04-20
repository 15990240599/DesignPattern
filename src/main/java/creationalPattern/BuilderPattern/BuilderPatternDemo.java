package creationalPattern.BuilderPattern;

/**
 * 建造者模式
 * 建造者模式是将一个复杂对象的构建过程与他的表示分离，使得同样的构建过程
 * 可以创建不同的表示，属于创建型模式。使用建造者模式对于用户而言只需要指
 * 定创建的类型就可以获得对象，建造过程及细节不需要了解
 *
 * 建造者模式的设计中主要有四个角色
 * 1、产品（Product）：要创建的产品类对象
 * 2、建造者对象（Builder）：具体的Builder类，根据不同的业务逻辑，具体
 * 化对象的各个组成部分的创建
 * 3、建造者（ConcreteBuilder）：具体的Builder类，根据不同的业务逻辑，
 * 具体化对象各个组成部分的创建
 * 4、调用者（Director）：调用具体的建造者，来创建对象的各个部分，在指
 * 导者中不涉及具体产品的信息，值负责保证对象各部分完整创建或按某种顺序创建
 *
 * 应用场景
 * 建造者模式适用于一个具有较多的零件的复杂产品的创建过程，由于需求的变化，
 * 组成这个复杂产品的各个零件撑场猛烈变化，但是他们的组合方式却相对稳定。
 * 建造者模式适用于以下几种场景：
 * 1、相同的方法，不同的执行顺序，产生不同的结果时
 * 2、多个部件或零件，都可以装配到一个对象中，但是产生的结果又不相同
 * 3、产品类非常复杂，或者产品类中的调用顺序不同产生不同的作用
 * 4、当初始化一个对象特别复杂，参数多，而且很多参数都具有默认值时。
 *
 * 优点：
 * 1、封装性好，创建和使用分离
 * 2、扩展性好，建造类之间独立，一定程度上解耦
 * 缺点：
 * 1、产生多余的Builder对象
 * 2、产品内部发生变化，建造者都要修改，成本较大
 *
 * 建造者模式与工厂模式的区别
 * 1、建造者模式更加注重方法的调用顺序，工厂模式注重于创建对象
 * 2、创建对象的力度不同，建造者模式创建复杂的对象，由各种复杂的部件组成，
 * 工厂模式创建出来的都一样
 * 3、关注重点不一样，工厂模式只需要吧对象创建出来就可以了，而建造者模式
 * 不仅要创建出这个对象，还要知道这个对象由哪些部件组成
 * 4、建造者模式根据建造过程中的顺序不一样，最终的对象部件组成也不一样
 *
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        //v1
//        CourseBuilder courseBuilder = new CourseBuilder();
//        courseBuilder.addName("设计模式");
//        courseBuilder.addPPT("【PPT课件】");
//        courseBuilder.addVideo("【回放视频】");
//        courseBuilder.addNote("【课堂笔记】");
//        courseBuilder.addHomework("【课后作业】");
//        System.out.println(courseBuilder.build());

        //v2   建造者模式链式写法
        CourseChainedBuilder builder = new CourseChainedBuilder()
                                    .addName("设计模式")
                                    .addPPT("【PPT课件】")
                                    .addVideo("【回放视频】")
                                    .addNote("【课堂笔记】")
                                    .addHomework("【课后作业】");
        System.out.println(builder.build());
    }
}
