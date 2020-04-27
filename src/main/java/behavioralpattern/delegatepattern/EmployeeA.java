package behavioralpattern.delegatepattern;

public class EmployeeA implements IEmployee {
    protected String goodAt = "编程";

    @Override
    public void doing(String task) {
        System.out.println(String.format("我是员工A，我擅长%s,现在开始做%Ss工作", goodAt, task));
    }
}
