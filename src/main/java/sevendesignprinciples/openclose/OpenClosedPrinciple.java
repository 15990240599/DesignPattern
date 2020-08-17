package sevendesignprinciples.openclose;

/**
 * 开闭原则
 * 定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。
 * 用出现构建框架，用实现扩展细节
 * 优点：提高软件系统的可复用性及可维护性
 *
 */
public class OpenClosedPrinciple {

    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse(1, "java", 1000.0);

        System.out.println(String.format("课程id:%s\n课程名称:%s\n原价:%s",javaCourse.getId(), javaCourse.getName(), javaCourse.getPrice()));

        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(1, "java", 1000.0);
        System.out.println(String.format("课程id:%s\n课程名称:%s\n原价:%s\n售价:%s",javaDiscountCourse.getId(), javaDiscountCourse.getName(), javaDiscountCourse.getPrice(), javaDiscountCourse.getDiscountPrice()));
    }
}
