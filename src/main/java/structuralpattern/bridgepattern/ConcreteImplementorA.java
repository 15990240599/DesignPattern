package structuralpattern.bridgepattern;

public class ConcreteImplementorA implements IImplementor {
    @Override
    public void operationImpl() {
        System.out.println("I`m ConcreteImplementor A");
    }
}
