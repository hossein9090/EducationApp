package ir.hossein.EducationApp.mapper;

import ir.hossein.EducationApp.entity.TeacherCourseEntity;
import ir.hossein.EducationApp.model.TeacherCourseModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-06T18:16:47+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0-262 (OpenLogic-OpenJDK)"
)
@Component
public class TeacherCourseMapperImpl implements TeacherCourseMapper {

    @Override
    public TeacherCourseEntity convertToEntity(TeacherCourseModel teacherCourseModel) {
        if ( teacherCourseModel == null ) {
            return null;
        }

        TeacherCourseEntity teacherCourseEntity = new TeacherCourseEntity();

        teacherCourseEntity.setId( teacherCourseModel.getId() );
        teacherCourseEntity.setTeacherId( teacherCourseModel.getTeacherId() );
        teacherCourseEntity.setCourseId( teacherCourseModel.getCourseId() );

        return teacherCourseEntity;
    }

    @Override
    public TeacherCourseModel convertToModel(TeacherCourseEntity teacherCourseEntity) {
        if ( teacherCourseEntity == null ) {
            return null;
        }

        TeacherCourseModel teacherCourseModel = new TeacherCourseModel();

        teacherCourseModel.setId( teacherCourseEntity.getId() );
        teacherCourseModel.setTeacherId( teacherCourseEntity.getTeacherId() );
        teacherCourseModel.setCourseId( teacherCourseEntity.getCourseId() );

        return teacherCourseModel;
    }

    @Override
    public List<TeacherCourseModel> convertListToListModel(List<TeacherCourseEntity> teacherCourseEntityList) {
        if ( teacherCourseEntityList == null ) {
            return null;
        }

        List<TeacherCourseModel> list = new ArrayList<TeacherCourseModel>( teacherCourseEntityList.size() );
        for ( TeacherCourseEntity teacherCourseEntity : teacherCourseEntityList ) {
            list.add( convertToModel( teacherCourseEntity ) );
        }

        return list;
    }

    @Override
    public List<TeacherCourseEntity> convertListToListEntity(List<TeacherCourseModel> teacherCourseModelList) {
        if ( teacherCourseModelList == null ) {
            return null;
        }

        List<TeacherCourseEntity> list = new ArrayList<TeacherCourseEntity>( teacherCourseModelList.size() );
        for ( TeacherCourseModel teacherCourseModel : teacherCourseModelList ) {
            list.add( convertToEntity( teacherCourseModel ) );
        }

        return list;
    }
}
