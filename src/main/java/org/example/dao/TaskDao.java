package org.example.dao;

import org.example.example.Task;

import java.util.List;

public interface TaskDao {

    void saveTaskToLesson(Long id, Task task);
    void updateTaskToLesson(Long id, Task task);
    List<Task> getAllTaskByLessonId(Long id);
    void deleteTaskById(Long id);
}
