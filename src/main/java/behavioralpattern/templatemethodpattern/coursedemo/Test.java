package behavioralpattern.templatemethodpattern.coursedemo;

public class Test {
    public static void main(String[] args) {
        System.out.println("===============架构师课程===============");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomeWork(true);
        javaCourse.createCourse();

        System.out.println("===============python课程===============");
        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();
    }


}
