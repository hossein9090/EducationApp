package ir.hossein.EducationApp.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teacher_course", schema = "educationapp")
public class TeacherCourseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "teacherId", nullable = true)
    private Integer teacherId;
    @Basic
    @Column(name = "courseId", nullable = true)
    private Integer courseId;
    @ManyToOne
    @JoinColumn(name = "teacherId", referencedColumnName = "id",insertable = false,updatable = false)
    private TeacherEntity teacherByTeacherId;
    @ManyToOne
    @JoinColumn(name = "courseId", referencedColumnName = "id",insertable = false,updatable = false)
    private CourseEntity courseByCourseId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherCourseEntity that = (TeacherCourseEntity) o;
        return id == that.id && Objects.equals(teacherId, that.teacherId) && Objects.equals(courseId, that.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teacherId, courseId);
    }

    public TeacherEntity getTeacherByTeacherId() {
        return teacherByTeacherId;
    }

    public void setTeacherByTeacherId(TeacherEntity teacherByTeacherId) {
        this.teacherByTeacherId = teacherByTeacherId;
    }

    public CourseEntity getCourseByCourseId() {
        return courseByCourseId;
    }

    public void setCourseByCourseId(CourseEntity courseByCourseId) {
        this.courseByCourseId = courseByCourseId;
    }
}
