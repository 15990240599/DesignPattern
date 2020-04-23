package creationalpattern.builderpattern;

/**
 * 建造者模式链式写法
 */
public class CourseChainedBuilder {
    private Course course = new Course();

    public CourseChainedBuilder addName(String name){
        course.setName(name);
        return this;
    }
    public CourseChainedBuilder addPPT(String ppt){
        course.setPpt(ppt);
        return this;
    }
    public CourseChainedBuilder addVideo(String video){
        course.setVideo(video);
        return this;
    }
    public CourseChainedBuilder addNote(String note){
        course.setNote(note);
        return this;
    }
    public CourseChainedBuilder addHomework(String homework){
        course.setHomework(homework);
        return this;
    }
    public Course build(){
        return this.course;
    }

}
