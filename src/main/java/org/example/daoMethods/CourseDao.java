package org.example.daoMethods;

import org.example.config.Config;
import org.example.dao.CourDao;
import org.example.example.Course;
import org.example.example.Task;
import org.hibernate.Session;

import javax.management.Query;
import java.util.List;
import java.util.Queue;

public class CourseDao implements CourDao {
    @Override
    public void saveCourseMethod(Course course) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Course getCourseById(Long id) {
        Session session = Config.getSession().openSession();
        session.getTransaction().begin();
        Course course = session.get(Course.class, id);
        session.getTransaction().commit();
        session.close();
        return course;
    }

    @Override
    public List<Course> getAllCourse() {
        Session session = Config.getSession().openSession();
        session.getTransaction().begin();
        List<Course> course = session.createQuery("select c from Course c order by createAt ", Course.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return course;
    }

    @Override
    public void updateCourse(Long id, String name, String duration, String creationAt,
                             String imageLink, String description) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Course course = session.get(Course.class, id);
        course.setCurseName(name);
        course.setDuration(duration);
        course.setCreateAt(creationAt);
        course.setImageLink(imageLink);
        course.setDescription(description);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void deleteCourseById(Long id) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Course course = session.get(Course.class, id);
        session.delete(course);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Course getCourseByName(String name) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
       Course course = session.createQuery("select c from Course c where c.curseName =:name",Course.class).
                setParameter("name",name).getSingleResult();
        session.getTransaction().commit();
        session.close();
        return course;
    }

    // * 3) Course:
    //         *  3.2) Курста getCourseById(), getAllCourse()(датасы боюнча сорттоп чыгаруу),
    //         updateCourse(), deleteCourseById() (курсту очургондо,
    //         курска assign болгон инструктор очпошу керек, курсун ичиндеги сабактар очуш керек) ,
    //         getCourseByName() методдорун тузуп, ишке ашыруу.
    //
}
