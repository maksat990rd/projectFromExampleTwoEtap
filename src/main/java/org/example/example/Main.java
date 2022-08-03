package org.example.example;


import org.example.config.Config;
import org.example.dao.TaskDao;
import org.example.daoImple.CourseDaoServis;
import org.example.daoImple.InstructorDaoServis;
import org.example.daoImple.LessonDaoServis;
import org.example.daoImple.TaskDaoServis;
import org.example.daoMethods.InstructorDao;
import org.example.daoServisImple.CourseDaoImple;
import org.example.daoServisImple.InstructorServisImple;
import org.example.daoServisImple.LessonServisimple;
import org.example.daoServisImple.TaskServisimple;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//        Config.getSession();

        InstructorDaoServis instructor = new InstructorServisImple();

//        instructor.saveInstructor(new Instructor("Aijamal", "Asangazieva", "Zamir@gmail.com", "+996509656565"));
//        instructor.updateInstructor(1L,"Chingiz", "Chingizov", "Chingiz@gmail.com", "+996705454545");
//       System.out.println(instructor.getInstructorById(1L));
//        instructor.assignInstructorToCourse(1L, 1L);
//        instructor.deleteInstructorById(1L);

        CourseDaoServis course = new CourseDaoImple();

//        course.saveCourseMethod(new Course("JS", "12.12.2022", "12.12.2018","photo@gmail.com", "9 month"));
//      System.out.println(course.getCourseById(1L));
//       course.getAllCourse().forEach(System.out::println);
//        course.updateCourse(1L, "JavaAdvanced", "4512465", "456154", "6565656", "6565626");
//        course.deleteCourseById(2L);
       // System.out.println(course.getCourseByName("JavaAdvanced"));

        LessonDaoServis lesson = new LessonServisimple();

//        lesson.saveLesson(1L,new Lesson("Hibernate", "videoLink"));
//        lesson.updateLessonToCourse(1L,"JDBS", "VideoLink");
//        System.out.println(lesson.getLessonById(1L));
//       lesson.getLessonByCourseId(1L).forEach(System.out::println);

        TaskDaoServis taskDao = new TaskServisimple();

//        taskDao.saveTaskToLesson(1L, new Task("test", "12.12.2012","test"));
//        taskDao.updateTaskToLesson(1L, new Task("Test", "Tddddddddddddt", "dddddddddddd"));
//        taskDao.getAllTaskByLessonId(1L).forEach(System.out::println);
//        taskDao.deleteTaskById(1L);



    }
}
