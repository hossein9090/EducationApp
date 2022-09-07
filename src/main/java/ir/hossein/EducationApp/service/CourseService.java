package ir.hossein.EducationApp.service;

import ir.hossein.EducationApp.model.CourseModel;

import java.util.List;

public interface CourseService {

    public List<CourseModel> getCourse();

    public void saveCourse(CourseModel courseModel);

    public CourseModel getCourse(int courseId);

    public void deleteCourse(int courseId);
}
