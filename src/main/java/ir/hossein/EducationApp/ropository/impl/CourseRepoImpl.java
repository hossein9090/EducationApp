package ir.hossein.EducationApp.ropository.impl;

import ir.hossein.EducationApp.entity.CourseEntity;
import ir.hossein.EducationApp.ropository.CourseRepo;
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
public class CourseRepoImpl implements CourseRepo {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<CourseEntity> getCourse() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CourseEntity> cq = cb.createQuery(CourseEntity.class);
        Root<CourseEntity> root = cq.from(CourseEntity.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void saveCourse(CourseEntity courseEntity) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(courseEntity);
    }

    @Override
    public CourseEntity getCourse(int courseId) {
        Session currentSession = sessionFactory.getCurrentSession();
        CourseEntity courseEntity = currentSession.get(CourseEntity.class, courseId);
        return courseEntity;
    }

    @Override
    public void deleteCourse(int courseId) {
        Session session = sessionFactory.getCurrentSession();
        CourseEntity courseEntity = session.byId(CourseEntity.class).load(courseId);
        session.delete(courseEntity);
    }
}
