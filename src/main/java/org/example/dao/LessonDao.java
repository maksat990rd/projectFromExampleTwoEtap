package org.example.dao;

import org.example.example.Course;
import org.example.example.Lesson;

import java.util.List;

public interface LessonDao {

    void saveLessonToCourse(Long id, Lesson lesson);
    void updateLesson(Long id, String name, String videoLink);
    Lesson getLessonById(Long id);
    List<Lesson> getLessonByCourseId(Long id);
}
