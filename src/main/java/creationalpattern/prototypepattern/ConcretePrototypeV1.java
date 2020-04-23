package creationalpattern.prototypepattern;

public class ConcretePrototypeV1 implements IPrototype {

    private int age;
    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public ConcretePrototypeV1 clone() {
        ConcretePrototypeV1 concretePrototype = new ConcretePrototypeV1();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
}
