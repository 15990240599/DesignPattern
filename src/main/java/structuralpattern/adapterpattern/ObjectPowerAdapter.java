package structuralpattern.adapterpattern;

/**
 * 对象适配器
 */
public class ObjectPowerAdapter implements DC5 {
    private AC220 ac220;

    public ObjectPowerAdapter(AC220 ac220){
        this.ac220 = ac220;
    }
    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println(String.format("使用Adapter输入AC%sV，输出DC%sV",adapterInput,adapterOutput));
        return adapterOutput;
    }
}
