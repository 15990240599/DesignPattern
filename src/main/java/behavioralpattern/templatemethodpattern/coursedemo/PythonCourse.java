package behavioralpattern.templatemethodpattern.coursedemo;

public class PythonCourse extends AbstractCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查Python作业");
    }
}
