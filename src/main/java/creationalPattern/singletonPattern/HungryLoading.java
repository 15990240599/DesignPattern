package creationalPattern.singletonPattern;

/**
 * 饿汉式
 */
public class HungryLoading {
    private HungryLoading(){}
    private static HungryLoading hungryLoading = new HungryLoading();
    private static HungryLoading getInstance(){
        return hungryLoading;
    }
}
