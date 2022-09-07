package ir.hossein.EducationApp.mapper;

import ir.hossein.EducationApp.entity.CourseEntity;
import ir.hossein.EducationApp.model.CourseModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-06T18:16:48+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0-262 (OpenLogic-OpenJDK)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public CourseEntity convertToEntity(CourseModel courseModel) {
        if ( courseModel == null ) {
            return null;
        }

        CourseEntity courseEntity = new CourseEntity();

        courseEntity.setId( courseModel.getId() );
        courseEntity.setName( courseModel.getName() );
        courseEntity.setCourseTime( courseModel.getCourseTime() );

        return courseEntity;
    }

    @Override
    public CourseModel convertToModel(CourseEntity courseEntity) {
        if ( courseEntity == null ) {
            return null;
        }

        CourseModel courseModel = new CourseModel();

        courseModel.setId( courseEntity.getId() );
        courseModel.setName( courseEntity.getName() );
        courseModel.setCourseTime( courseEntity.getCourseTime() );

        return courseModel;
    }

    @Override
    public List<CourseModel> convertListToListModel(List<CourseEntity> courseEntityList) {
        if ( courseEntityList == null ) {
            return null;
        }

        List<CourseModel> list = new ArrayList<CourseModel>( courseEntityList.size() );
        for ( CourseEntity courseEntity : courseEntityList ) {
            list.add( convertToModel( courseEntity ) );
        }

        return list;
    }

    @Override
    public List<CourseEntity> convertListToListEntity(List<CourseModel> courseModelList) {
        if ( courseModelList == null ) {
            return null;
        }

        List<CourseEntity> list = new ArrayList<CourseEntity>( courseModelList.size() );
        for ( CourseModel courseModel : courseModelList ) {
            list.add( convertToEntity( courseModel ) );
        }

        return list;
    }
}
