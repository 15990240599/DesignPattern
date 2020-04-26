package structuralpattern.adapterpattern.logindemo;

public class LoginDemo {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.login("Tom", "123456");
        adapter.loginForQq("asdasdasd");
        adapter.loginForWechat("qweqwe");
    }
}
