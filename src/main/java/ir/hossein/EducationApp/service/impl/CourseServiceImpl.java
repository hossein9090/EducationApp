package ir.hossein.EducationApp.service.impl;

import ir.hossein.EducationApp.entity.CourseEntity;
import ir.hossein.EducationApp.mapper.CourseMapper;
import ir.hossein.EducationApp.model.CourseModel;
import ir.hossein.EducationApp.ropository.CourseRepo;
import ir.hossein.EducationApp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<CourseModel> getCourse() {
        List<CourseEntity> courseEntityList = courseRepo.getCourse();
        return courseMapper.convertListToListModel(courseEntityList);
    }

    @Override
    public void saveCourse(CourseModel courseModel) {
        CourseEntity courseEntity = courseMapper.convertToEntity(courseModel);
        courseRepo.saveCourse(courseEntity);
    }

    @Override
    public CourseModel getCourse(int courseId) {
        CourseEntity courseEntity = courseRepo.getCourse(courseId);
        return courseMapper.convertToModel(courseEntity);
    }

    @Override
    public void deleteCourse(int courseId) {
        courseRepo.deleteCourse(courseId);
    }
}
