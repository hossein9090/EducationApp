package ir.hossein.EducationApp.ropository;

import ir.hossein.EducationApp.entity.TeacherCourseEntity;
import ir.hossein.EducationApp.entity.TeacherEntity;

import java.util.List;

public interface TeacherCourseRepo {

    public List<TeacherCourseEntity> getTeacherCourse();

    public void saveTeacherCourse(TeacherCourseEntity teacherCourseEntity);

    public TeacherCourseEntity getTeacherCourse(int teacherCourseId);

    public void deleteTeacherCourse(int teacherCourseId);
}
