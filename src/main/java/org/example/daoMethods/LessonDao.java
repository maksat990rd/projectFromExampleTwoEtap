package org.example.daoMethods;

import org.example.config.Config;
import org.example.example.Course;
import org.example.example.Instructor;
import org.example.example.Lesson;
import org.hibernate.Session;

import java.util.List;

public class LessonDao implements org.example.dao.LessonDao {
    //* 5) Lesson:
    //         * 5.1) Lesson да saveLesson()
    //         (Lesson сакталып жатканда кандайдыр бир курска сакталуусу керек),
    //         updateLesson(), getLessonById(),
    //         getLessonsByCourseId()(курска тиешелуу сабактарды чыгаруу);
    //
    @Override
    public void saveLessonToCourse(Long id, Lesson lesson) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Course course = session.find(Course.class, id);
        lesson.setCourses(course);
        session.save(lesson);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateLesson(Long id, String name, String videoLink) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Lesson lesson = session.get(Lesson.class, id);
        lesson.setName(name);
        lesson.setVideoLink(videoLink);
        session.save(lesson);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Lesson getLessonById(Long id) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Lesson lesson = session.get(Lesson.class, id);
        session.getTransaction().commit();
        session.close();
        return lesson;
    }

    @Override
    public List<Lesson> getLessonByCourseId(Long id) {
        Session session = Config.getSession().openSession();
        session.beginTransaction();
        Course course = session.get(Course.class, id);
        List<Lesson> lessons = course.getLessons();
        session.getTransaction().commit();
        session.close();
        return lessons;


    }
}
