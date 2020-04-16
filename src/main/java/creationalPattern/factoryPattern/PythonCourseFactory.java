package creationalPattern.factoryPattern;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
