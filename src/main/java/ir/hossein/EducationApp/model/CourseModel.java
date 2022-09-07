package ir.hossein.EducationApp.model;



public class CourseModel {

    private int id;
    private String name;
    private Integer courseTime;

    public CourseModel(int id, String name, Integer courseTime) {
        this.id = id;
        this.name = name;
        this.courseTime = courseTime;
    }

    public CourseModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Integer courseTime) {
        this.courseTime = courseTime;
    }
}
