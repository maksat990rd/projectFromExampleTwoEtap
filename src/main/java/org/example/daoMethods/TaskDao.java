package org.example.daoMethods;

import org.example.config.Config;
import org.example.example.Lesson;
import org.example.example.Task;
import org.hibernate.Session;

import java.util.List;

public class TaskDao implements org.example.dao.TaskDao {

    @Override
    public void saveTaskToLesson(Long id, Task task) {
            Session session = Config.getSession().openSession();
            session.beginTransaction();
            Lesson lesson = session.get(Lesson.class, id);
            lesson.addTask(task);
            session.save(task);
            session.getTransaction().commit();
            session.close();
    }

    @Override
    public void updateTaskToLesson(Long id, Task task) {
            Session session = Config.getSession().openSession();
            session.beginTransaction();
            Task task1 = session.get(Task.class, id);
            task1.setTask(task.getTask());
            task1.setDeadLine(task.getDeadLine());
            task1.setName(task.getName());
            session.getTransaction().commit();
            session.close();
    }

    @Override
    public List<Task> getAllTaskByLessonId(Long id) {
            Session session = Config.getSession().openSession();
            session.beginTransaction();
            session.get(Lesson.class, id);
            List<Task> task = session.createQuery("from Task").getResultList();
            session.getTransaction().commit();
            session.close();
            return task;
    }

    @Override
    public void deleteTaskById(Long id) {
            Session session = Config.getSession().openSession();
            session.beginTransaction();
            Task task = session.get(Task.class, id);
            session.delete(task);
            session.getTransaction().commit();
            session.close();
    }
}
