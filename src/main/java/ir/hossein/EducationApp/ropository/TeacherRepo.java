package ir.hossein.EducationApp.ropository;

import ir.hossein.EducationApp.entity.CourseEntity;
import ir.hossein.EducationApp.entity.TeacherEntity;

import java.util.List;

public interface TeacherRepo {

    public List<TeacherEntity> getTeacher();

    public void saveTeacher(TeacherEntity teacherEntity);

    public TeacherEntity getTeacher(int teacherId);

    public void deleteTeacher(int teacherId);
}
