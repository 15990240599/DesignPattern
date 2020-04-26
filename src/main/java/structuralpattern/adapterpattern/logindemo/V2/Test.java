package structuralpattern.adapterpattern.logindemo.V2;

import structuralpattern.adapterpattern.logindemo.IPassportForThird;

public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThridAdapter();
        adapter.loginForQq("aaaaaaaaaaaaaaaa");
    }
}
