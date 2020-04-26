package structuralpattern.adapterpattern;

/**
 * 类适配器
 */
public class ClassPowerAdapter extends AC220 implements DC5 {
    @Override
    public int outputDC5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println(String.format("使用Adapter输入AC%sV，输出DC%sV",adapterInput,adapterOutput));
        return adapterOutput;
    }
}
