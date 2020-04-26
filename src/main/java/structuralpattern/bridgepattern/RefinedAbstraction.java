package structuralpattern.bridgepattern;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(IImplementor iImplementor) {
        super(iImplementor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("refined operation");
    }
}
