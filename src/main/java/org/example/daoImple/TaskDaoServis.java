package org.example.daoImple;

import org.example.example.Task;

import java.util.List;

public interface TaskDaoServis {

    void saveTaskToLesson(Long id, Task task);

    void updateTaskToLesson(Long id, Task task);

    List<Task> getAllTaskByLessonId(Long id);

    void deleteTaskById(Long id);
}
