package behavioralpattern.delegatepattern;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {

    private Map<String, IEmployee> employee = new HashMap<String, IEmployee>();

    public Leader(){
        employee.put("爬虫", new EmployeeA());
        employee.put("海报图", new EmployeeB());
    }
    @Override
    public void doing(String task) {
        if (!employee.containsKey(task)){
            System.out.println(String.format("这个任务%s超出我的能力范围", task));
            return;
        }
        employee.get(task).doing(task);
    }
}
