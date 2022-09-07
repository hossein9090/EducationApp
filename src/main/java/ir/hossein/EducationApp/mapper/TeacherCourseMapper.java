package ir.hossein.EducationApp.mapper;

import ir.hossein.EducationApp.entity.TeacherCourseEntity;
import ir.hossein.EducationApp.model.TeacherCourseModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeacherCourseMapper {

    TeacherCourseEntity convertToEntity(TeacherCourseModel teacherCourseModel);

    TeacherCourseModel convertToModel(TeacherCourseEntity teacherCourseEntity);

    List<TeacherCourseModel> convertListToListModel(List<TeacherCourseEntity> teacherCourseEntityList);

    List<TeacherCourseEntity> convertListToListEntity(List<TeacherCourseModel> teacherCourseModelList);
}
