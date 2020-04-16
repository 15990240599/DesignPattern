package creationalPattern.abstractFactoryPattern;

/**
 * Python产品族的具体工厂
 */
public class PythonCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
