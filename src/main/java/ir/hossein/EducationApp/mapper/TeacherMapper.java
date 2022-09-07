package ir.hossein.EducationApp.mapper;

import ir.hossein.EducationApp.entity.TeacherEntity;
import ir.hossein.EducationApp.model.TeacherModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    TeacherEntity convertToEntity(TeacherModel teacherModel);

    TeacherModel convertToModel(TeacherEntity teacherEntity);

    List<TeacherModel> convertListToListModel(List<TeacherEntity> teacherEntityList);

    List<TeacherEntity> convertListToListEntity(List<TeacherModel> teacherModelList);
}
