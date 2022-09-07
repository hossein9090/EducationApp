package ir.hossein.EducationApp.mapper;

import ir.hossein.EducationApp.entity.TeacherEntity;
import ir.hossein.EducationApp.model.TeacherModel;
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
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherEntity convertToEntity(TeacherModel teacherModel) {
        if ( teacherModel == null ) {
            return null;
        }

        TeacherEntity teacherEntity = new TeacherEntity();

        teacherEntity.setId( teacherModel.getId() );
        teacherEntity.setFirstName( teacherModel.getFirstName() );
        teacherEntity.setLastName( teacherModel.getLastName() );
        teacherEntity.setEmail( teacherModel.getEmail() );

        return teacherEntity;
    }

    @Override
    public TeacherModel convertToModel(TeacherEntity teacherEntity) {
        if ( teacherEntity == null ) {
            return null;
        }

        TeacherModel teacherModel = new TeacherModel();

        teacherModel.setId( teacherEntity.getId() );
        teacherModel.setFirstName( teacherEntity.getFirstName() );
        teacherModel.setLastName( teacherEntity.getLastName() );
        teacherModel.setEmail( teacherEntity.getEmail() );

        return teacherModel;
    }

    @Override
    public List<TeacherModel> convertListToListModel(List<TeacherEntity> teacherEntityList) {
        if ( teacherEntityList == null ) {
            return null;
        }

        List<TeacherModel> list = new ArrayList<TeacherModel>( teacherEntityList.size() );
        for ( TeacherEntity teacherEntity : teacherEntityList ) {
            list.add( convertToModel( teacherEntity ) );
        }

        return list;
    }

    @Override
    public List<TeacherEntity> convertListToListEntity(List<TeacherModel> teacherModelList) {
        if ( teacherModelList == null ) {
            return null;
        }

        List<TeacherEntity> list = new ArrayList<TeacherEntity>( teacherModelList.size() );
        for ( TeacherModel teacherModel : teacherModelList ) {
            list.add( convertToEntity( teacherModel ) );
        }

        return list;
    }
}
