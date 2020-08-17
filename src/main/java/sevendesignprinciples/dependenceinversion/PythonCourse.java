package sevendesignprinciples.dependenceinversion;

public class PythonCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("我在学python");
    }
}
