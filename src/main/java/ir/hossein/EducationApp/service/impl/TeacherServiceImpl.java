package ir.hossein.EducationApp.service.impl;

import ir.hossein.EducationApp.entity.CourseEntity;
import ir.hossein.EducationApp.entity.TeacherEntity;
import ir.hossein.EducationApp.mapper.CourseMapper;
import ir.hossein.EducationApp.mapper.TeacherMapper;
import ir.hossein.EducationApp.model.TeacherModel;
import ir.hossein.EducationApp.ropository.CourseRepo;
import ir.hossein.EducationApp.ropository.TeacherRepo;
import ir.hossein.EducationApp.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<TeacherModel> getTeacher() {
        List<TeacherEntity> teacherEntityList = teacherRepo.getTeacher();
        return teacherMapper.convertListToListModel(teacherEntityList);
    }

    @Override
    public void saveTeacher(TeacherModel teacherModel) {
        TeacherEntity teacherEntity = teacherMapper.convertToEntity(teacherModel);
        teacherRepo.saveTeacher(teacherEntity);
    }

    @Override
    public TeacherModel getTeacher(int teacherId) {
        TeacherEntity teacherEntity = teacherRepo.getTeacher(teacherId);
        return teacherMapper.convertToModel(teacherEntity);
    }

    @Override
    public void deleteTeacher(int teacherId) {
        teacherRepo.deleteTeacher(teacherId);
    }
}
