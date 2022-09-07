package ir.hossein.EducationApp.mapper;

import ir.hossein.EducationApp.entity.CourseEntity;
import ir.hossein.EducationApp.model.CourseModel;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseEntity convertToEntity(CourseModel courseModel);

    CourseModel convertToModel(CourseEntity courseEntity);

    List<CourseModel> convertListToListModel(List<CourseEntity> courseEntityList);

    List<CourseEntity> convertListToListEntity(List<CourseModel> courseModelList);
}
