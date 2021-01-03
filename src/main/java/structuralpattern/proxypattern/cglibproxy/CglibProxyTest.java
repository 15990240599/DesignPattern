package structuralpattern.proxypattern.cglibproxy;

public class CglibProxyTest {
    public static void main(String[] args) {
       ZhangSan zhangSan = (ZhangSan) new CglibMeipo().getInstance(ZhangSan.class);
       zhangSan.findLove();
    }
}
