package structuralpattern.adapterpattern.interfacepoweradapter;

public class InterfacePowerAdapter implements DC {
    private AC220 ac220;

    public InterfacePowerAdapter(AC220 ac220){
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println(String.format("使用Adapter输入AC%sV，输出DC%sV",adapterInput,adapterOutput));
        return adapterInput;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }

}
