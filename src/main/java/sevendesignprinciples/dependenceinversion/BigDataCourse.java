package sevendesignprinciples.dependenceinversion;

public class BigDataCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("我在学大数据");
    }
}
