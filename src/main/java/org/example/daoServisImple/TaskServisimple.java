package org.example.daoServisImple;

import org.example.dao.TaskDao;
import org.example.daoImple.TaskDaoServis;
import org.example.example.Task;

import java.util.List;

public class TaskServisimple implements TaskDaoServis {
    TaskDao taskDao = new org.example.daoMethods.TaskDao();

    @Override
    public void saveTaskToLesson(Long id, Task task) {
        taskDao.saveTaskToLesson(id, task);
    }

    @Override
    public void updateTaskToLesson(Long id, Task task) {
        taskDao.updateTaskToLesson(id, task);
    }

    @Override
    public List<Task> getAllTaskByLessonId(Long id) {
        return taskDao.getAllTaskByLessonId(id);
    }

    @Override
    public void deleteTaskById(Long id) {
        taskDao.deleteTaskById(id);
    }
}
