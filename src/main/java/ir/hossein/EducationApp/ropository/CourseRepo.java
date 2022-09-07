package ir.hossein.EducationApp.ropository;

import ir.hossein.EducationApp.entity.CourseEntity;

import java.util.List;

public interface CourseRepo {

    public List<CourseEntity> getCourse();

    public void saveCourse(CourseEntity courseEntity);

    public CourseEntity getCourse(int courseId);

    public void deleteCourse(int courseId);
}
