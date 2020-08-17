package sevendesignprinciples.dependenceinversion;

public class My {
//    ==========v1===============
//    public void studyJavaCourse(){
//        System.out.println("我在学java");
//    }
//    public void studyPythonCourse(){
//        System.out.println("我在学python");
//    }
//    public void studyBigDataCourse(){
//        System.out.println("我在学大数据");
//    }

//    ==========v2===============
//    public void study(ICourse iCourse){
//        iCourse.study();
//    }

//    ==========v3===============
//    private ICourse iCourse;
//    public My(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//    public void study(){
//        this.iCourse.study();
//    }

//    ==========v4===============
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        this.iCourse.study();
    }
}
