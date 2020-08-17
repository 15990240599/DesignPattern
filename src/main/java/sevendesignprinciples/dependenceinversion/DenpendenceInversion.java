package sevendesignprinciples.dependenceinversion;

/**
 * 依赖倒置原则
 * 定义：高层模块不应该依赖底层模块，二者都应该依赖其抽象
 * 抽象不应该依赖细节；细节应该依赖抽象
 * 针对接口编程，不要针对实现编程
 * 优点：可以减少类间耦合性、提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险
 */
public class DenpendenceInversion {
    public static void main(String[] args) {
//        ======v1=======
//        My my = new My();
//        my.studyBigDataCourse();
//        my.studyJavaCourse();
//        my.studyPythonCourse();

//        ========v2=======
//        My my = new My();
//        my.study(new JavaCourse());
//        my.study(new PythonCourse());
//        my.study(new BigDataCourse());

//        ========v3=======
//        My my = new My(new JavaCourse());
//        my.study();
//        my = new My(new PythonCourse());
//        my.study();
//        my = new My(new BigDataCourse());
//        my.study();

//        ========v4=======
        My my = new My();
        my.setiCourse(new JavaCourse());
        my.study();
        my.setiCourse(new PythonCourse());
        my.study();
        my.setiCourse(new BigDataCourse());
        my.study();
    }
}
