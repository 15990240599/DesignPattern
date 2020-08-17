package sevendesignprinciples.lawofdemeter;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public void checkNumber(){
        List<Course> courses = new ArrayList<Course>();
        for (int i = 0; i < 20; i++){
            courses.add(new Course());
        }
        System.out.println("目前已发布课程数量为："+ courses.size());
    }
}
