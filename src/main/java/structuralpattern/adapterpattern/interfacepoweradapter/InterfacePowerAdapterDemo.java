package structuralpattern.adapterpattern.interfacepoweradapter;

/**
 * 接口适配器
 */
public class InterfacePowerAdapterDemo {
    public static void main(String[] args) {
        DC adapter = new InterfacePowerAdapter(new AC220());
        adapter.output5V();
    }
}
