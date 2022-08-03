package org.example.daoImple;

import org.example.example.Course;

import java.util.List;

public interface CourseDaoServis {
    void saveCourseMethod(Course course);

    Course getCourseById(Long id);

    List<Course> getAllCourse();

    void updateCourse(Long id, String name, String duration, String creationAt,
                      String imageLink, String description);

    void deleteCourseById(Long id);

    Course getCourseByName(String name);
}
