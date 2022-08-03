package org.example.daoServisImple;

import org.example.daoImple.CourseDaoServis;
import org.example.daoMethods.CourseDao;
import org.example.example.Course;

import java.util.List;

public class CourseDaoImple implements CourseDaoServis {
    CourseDao courseDao = new CourseDao();

    @Override
    public void saveCourseMethod(Course course) {
        courseDao.saveCourseMethod(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseDao.getCourseById(id);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseDao.getAllCourse();
    }

    @Override
    public void updateCourse(Long id, String name, String duration, String creationAt, String imageLink, String description) {
        courseDao.updateCourse(id, name, duration, creationAt, imageLink, description);
    }

    @Override
    public void deleteCourseById(Long id) {
        courseDao.deleteCourseById(id);
    }

    @Override
    public Course getCourseByName(String name) {
        return courseDao.getCourseByName(name);
    }
}
