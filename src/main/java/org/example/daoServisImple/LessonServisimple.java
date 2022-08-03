package org.example.daoServisImple;

import org.example.daoImple.LessonDaoServis;
import org.example.daoMethods.LessonDao;
import org.example.example.Lesson;

import java.util.List;

public class LessonServisimple implements LessonDaoServis {
    LessonDao lessonDao = new LessonDao();
    @Override
    public void saveLesson(Long id, Lesson lesson) {
        lessonDao.saveLessonToCourse(id,lesson);
    }

    @Override
    public void updateLessonToCourse(Long id, String name, String videoLink) {
        lessonDao.updateLesson(id, name, videoLink);
    }


    @Override
    public Lesson getLessonById(Long id) {
        return lessonDao.getLessonById(id);
    }

    @Override
    public List<Lesson> getLessonByCourseId(Long id) {
        return lessonDao.getLessonByCourseId(id);
    }
}
