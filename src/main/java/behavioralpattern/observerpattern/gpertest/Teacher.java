package behavioralpattern.observerpattern.gpertest;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;
    public Teacher(String name){
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question)arg;

        System.out.println("========================");
        System.out.println(name + "老师你好!\n" +
                "您收到了一个来自" + gPer.getName() + "的提问,希望你解答，问题内容如下，\n" +
                "提问者：" + question.getUserName());
    }
}
