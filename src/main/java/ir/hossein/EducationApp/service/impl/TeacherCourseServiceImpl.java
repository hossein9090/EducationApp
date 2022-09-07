package ir.hossein.EducationApp.service.impl;

import ir.hossein.EducationApp.entity.TeacherCourseEntity;
import ir.hossein.EducationApp.entity.TeacherEntity;
import ir.hossein.EducationApp.mapper.CourseMapper;
import ir.hossein.EducationApp.mapper.TeacherCourseMapper;
import ir.hossein.EducationApp.model.TeacherCourseModel;
import ir.hossein.EducationApp.ropository.TeacherCourseRepo;
import ir.hossein.EducationApp.ropository.TeacherRepo;
import ir.hossein.EducationApp.service.TeacherCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class TeacherCourseServiceImpl implements TeacherCourseService {

    @Autowired
    private TeacherCourseRepo teacherCourseRepo;

    @Autowired
    private TeacherCourseMapper teacherCourseMapper;

    @Override
    public List<TeacherCourseModel> getTeacherCourse() {
        List<TeacherCourseEntity> teacherCourseEntityList = teacherCourseRepo.getTeacherCourse();
        return teacherCourseMapper.convertListToListModel(teacherCourseEntityList);
    }

    @Override
    public void saveTeacherCourse(TeacherCourseModel teacherCourseModel) {
        TeacherCourseEntity teacherCourseEntity = teacherCourseMapper.convertToEntity(teacherCourseModel);
        teacherCourseRepo.saveTeacherCourse(teacherCourseEntity);
    }

    @Override
    public TeacherCourseModel getTeacherCourse(int teacherCourseId) {
        TeacherCourseEntity teacherCourseEntity = teacherCourseRepo.getTeacherCourse(teacherCourseId);
        return teacherCourseMapper.convertToModel(teacherCourseEntity);
    }

    @Override
    public void deleteTeacherCourse(int teacherCourseId) {
        teacherCourseRepo.deleteTeacherCourse(teacherCourseId);
    }
}
