package creationalPattern.simpleFactory;

/**
 * 简单方法模式
 * 简单工厂模式（Simple Factory Pattern）是指由一个工厂对象决定创建出哪一种产品类的实例，
 * 但它不属于GOF23中设计模式。简单工厂适用于工厂类负责创建的对象较少的场景，
 * 且客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        //v1
//        CourseFactory courseFactory = new CourseFactory();
//        ICourse course = courseFactory.craete("java");
//        course.record();
//        course = courseFactory.craete("python");
//        course.record();

        //v2

//        CourseFactory courseFactory = new CourseFactory();
//        ICourse iCourse = courseFactory.craete("creationalPattern.simpleFactory.JavaCourse");
//        iCourse.record();
//        iCourse = courseFactory.craete("creationalPattern.simpleFactory.PythonCourse");
//        iCourse.record();

        //v3
        CourseFactory courseFactory = new CourseFactory();
        ICourse iCourse = courseFactory.craete(JavaCourse.class);
        iCourse.record();
        iCourse = courseFactory.craete(PythonCourse.class);
        iCourse.record();
    }
}
