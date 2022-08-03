package org.example.daoImple;

import org.example.example.Lesson;

import java.util.List;

public interface LessonDaoServis {

    void saveLesson(Long id, Lesson lesson);

    void updateLessonToCourse(Long id, String name, String videoLink);

    Lesson getLessonById(Long id);

    List<Lesson> getLessonByCourseId(Long id);
}
