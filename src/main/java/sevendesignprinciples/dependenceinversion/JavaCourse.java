package sevendesignprinciples.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("我在学java");
    }
}
