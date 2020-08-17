package sevendesignprinciples.lawofdemeter;

/**
 * 迪米特法则
 * 定义：一个对象应该对其他对象保持最少的了解。又叫最少知道原则，尽量降低类与类之间的耦合
 * 优点：降低类之间的耦合
 *
 * 强调只和朋友交流，不和陌生人说话
 * 朋友：出现在成员变量、方法的输入、输出参数中的类成为成员朋友类，而出现在方法体内部的类不属于朋友类
 */
public class LawOfDemeter {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckNumber(employee);
    }
}
