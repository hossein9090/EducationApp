package ir.hossein.EducationApp.service;

import ir.hossein.EducationApp.model.TeacherCourseModel;

import java.util.List;

public interface TeacherCourseService {

    public List<TeacherCourseModel> getTeacherCourse();

    public void saveTeacherCourse(TeacherCourseModel teacherCourseModel);

    public TeacherCourseModel getTeacherCourse(int teacherCourseId);

    public void deleteTeacherCourse(int teacherCourseId);
}
