package ir.hossein.EducationApp.ropository.impl;

import ir.hossein.EducationApp.entity.TeacherCourseEntity;
import ir.hossein.EducationApp.entity.TeacherEntity;
import ir.hossein.EducationApp.ropository.TeacherCourseRepo;
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
public class TeacherCourseRepoImpl implements TeacherCourseRepo {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<TeacherCourseEntity> getTeacherCourse() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<TeacherCourseEntity> cq = cb.createQuery(TeacherCourseEntity.class);
        Root<TeacherCourseEntity> root = cq.from(TeacherCourseEntity.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void saveTeacherCourse(TeacherCourseEntity teacherCourseEntity) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(teacherCourseEntity);
    }

    @Override
    public TeacherCourseEntity getTeacherCourse(int teacherCourseId) {
        Session currentSession = sessionFactory.getCurrentSession();
        TeacherCourseEntity teacherCourseEntity = currentSession.get(TeacherCourseEntity.class, teacherCourseId);
        return teacherCourseEntity;
    }

    @Override
    public void deleteTeacherCourse(int teacherCourseId) {
        Session session = sessionFactory.getCurrentSession();
        TeacherCourseEntity teacherCourseEntity = session.byId(TeacherCourseEntity.class).load(teacherCourseId);
        session.delete(teacherCourseEntity);
    }
}
