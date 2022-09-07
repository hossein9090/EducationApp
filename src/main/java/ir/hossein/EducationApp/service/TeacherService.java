package ir.hossein.EducationApp.service;

import ir.hossein.EducationApp.model.TeacherModel;

import java.util.List;

public interface TeacherService {

    public List<TeacherModel> getTeacher();

    public void saveTeacher(TeacherModel teacherModel);

    public TeacherModel getTeacher(int teacherId);

    public void deleteTeacher(int teacherId);
}
