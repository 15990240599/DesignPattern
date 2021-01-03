package creationalpattern.prototypepattern;

import util.GsonUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConcretePrototypeV2 implements Cloneable, Serializable {

    private int age;
    private String name;
    private List<String> hobbies;


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

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public ConcretePrototypeV2 deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (ConcretePrototypeV2) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototypeV2 jsonDeepClone(){
        String jsonObject = GsonUtil.GsonString(this);
        ConcretePrototypeV2 concretePrototypeV2 = GsonUtil.GsonToBean(jsonObject, ConcretePrototypeV2.class);
        return concretePrototypeV2;
    }

//    public ConcretePrototypeV2 deepCloneHobbies(){
//        try {
//            ConcretePrototypeV2 concretePrototypeV2 = (ConcretePrototypeV2) super.clone();
//            concretePrototypeV2.hobbies = (List)((ArrayList)concretePrototypeV2.hobbies).clone();
//            return concretePrototypeV2;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    @Override
    public String toString() {
        return "ConcretePrototypeV2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    @Override
    public ConcretePrototypeV2 clone() {
        try {
            return (ConcretePrototypeV2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
