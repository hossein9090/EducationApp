package ir.hossein.EducationApp.ropository.impl;

import ir.hossein.EducationApp.entity.CourseEntity;
import ir.hossein.EducationApp.entity.TeacherEntity;
import ir.hossein.EducationApp.ropository.TeacherRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class TeacherRepoImpl implements TeacherRepo {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<TeacherEntity> getTeacher() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<TeacherEntity> cq = cb.createQuery(TeacherEntity.class);
        Root<TeacherEntity> root = cq.from(TeacherEntity.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void saveTeacher(TeacherEntity teacherEntity) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(teacherEntity);
    }

    @Override
    public TeacherEntity getTeacher(int teacherId) {
        Session currentSession = sessionFactory.getCurrentSession();
        TeacherEntity teacherEntity = currentSession.get(TeacherEntity.class, teacherId);
        return teacherEntity;
    }

    @Override
    public void deleteTeacher(int teacherId) {
        Session session = sessionFactory.getCurrentSession();
        TeacherEntity teacherEntity = session.byId(TeacherEntity.class).load(teacherId);
        session.delete(teacherEntity);
    }
}
