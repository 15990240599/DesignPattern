package behavioralpattern.delegatepattern;

public class EmployeeB implements IEmployee {
    protected String goodAt = "平面设计";

    @Override
    public void doing(String task) {
        System.out.println(String.format("我是员工B，我擅长%s,现在开始做%Ss工作", goodAt, task));
    }
}
