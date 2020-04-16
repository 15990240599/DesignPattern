package creationalPattern.abstractFactoryPattern;

/**
 *  Python产品族
 */
public class PythonVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
