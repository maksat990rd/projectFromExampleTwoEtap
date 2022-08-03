package org.example.daoMethods;

import org.example.config.Config;
import org.example.dao.IntstDao;
import org.example.example.Course;
import org.example.example.Instructor;
import org.hibernate.Session;

import java.util.List;

public class InstructorDao implements IntstDao {
    //* 4) Instructor:
    //         * 4.1) Инструктордо saveInstructor(), updateInstructor(), getInstructorById(),
    //         getInstructorByCourseId()(тиешелуу курстун инструкторлорун чыгарып беруу),
    //         deleteInstructorById()(инструктор очкондо, инструкторго тиешелуу курс очпошу керек),
    //         assignInstructorToCourse()(инструкторду курска кошуп коюу(назначить)).
    //
    @Override
    public void saveInstructor(Instructor instructor) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        session.save(instructor);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateInstructor(Long id, String firstName, String lastName
            ,String email, String phoneNumber) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Instructor instr = session.get(Instructor.class, id);
        instr.setFirstName(firstName);
        instr.setLastName(lastName);
        instr.setEmail(email);
        instr.setPhoneNumber(phoneNumber);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Instructor getInstructorById(Long id) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Instructor instructor = session.get(Instructor.class, id);
        session.getTransaction().commit();
        session.close();
        return instructor;
    }

    @Override
    public List<Instructor> getInstructorByCourseId(Long id) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Course course = session.get(Course.class, id);
        List<Instructor> instructors = course.getInstructors();
        session.getTransaction().commit();
        session.close();
        return instructors;
    }

    @Override
    public void deleteInstructorById(Long id) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Instructor instructor = session.get(Instructor.class, id);
        session.delete(instructor);
        session.getTransaction().commit();
        session.close();
        System.out.println("delete is instructor id : " + id);
    }

    @Override
    public void assignInstructorToCourse(Long courseId,Long ins_id) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Course course = session.get(Course.class, ins_id);
        Instructor instructor = session.get(Instructor.class, courseId);
        instructor.addCourse(course);
        course.addInstructors(instructor);
        session.persist(instructor);
        session.persist(course);
        session.getTransaction().commit();
        session.close();
    }
}
