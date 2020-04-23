package structuralpattern.facadepattren;

public class Facade {
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();

    public void doA(){
        this.a.doA();
    }
    public void doB(){
        this.b.doB();
    }
    public void doC(){
        this.c.doC();
    }
}
