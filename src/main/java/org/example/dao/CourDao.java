package org.example.dao;

import org.example.example.Course;

import java.util.List;

public interface CourDao {
     void saveCourseMethod(Course course);
     Course getCourseById(Long id);
     List<Course> getAllCourse();
     void updateCourse(Long id, String name, String duration, String creationAt,
                       String imageLink, String description);
     void deleteCourseById(Long id);
     Course getCourseByName(String name);

}
