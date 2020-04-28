package behavioralpattern.templatemethodpattern.coursedemo;

public class JavaCourse extends AbstractCourse {
    private boolean needCheckHomeWork = false;

    public void setNeedCheckHomeWork(boolean needCheckHomeWork){
        this.needCheckHomeWork = needCheckHomeWork;
    }

    @Override
    protected boolean needCheckHomework() {
        return this.needCheckHomeWork;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查Java作业");
    }
}
