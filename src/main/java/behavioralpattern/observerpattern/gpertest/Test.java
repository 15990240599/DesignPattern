package behavioralpattern.observerpattern.gpertest;

/**
 * 业务场景：
 * 当小伙伴在GPer神态去那种提问的时候，如果有设置指定老师回答，对应的老师就会
 * 收到邮件通知，这就是观察者模式的一种应用场景
 */
public class Test {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("tom");
        Teacher mic = new Teacher("mic");

        gPer.addObserver(tom);
        gPer.addObserver(mic);

        //业务逻辑
        Question question = new Question();
        question.setUserName("小晓明");
        question.setContent("观察者模式适用与那些场景");

        gPer.publishQuestion(question);
    }
}
