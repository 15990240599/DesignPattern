package creationalpattern.factorypattern;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
