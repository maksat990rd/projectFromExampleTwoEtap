package org.example.dao;

import org.example.example.Course;
import org.example.example.Instructor;

import java.util.List;

public interface IntstDao {
    //* 4) Instructor:
    //         * 4.1) Инструктордо saveInstructor(), updateInstructor(), getInstructorById(), getInstructorByCourseId()(тиешелуу курстун инструкторлорун чыгарып беруу),
    //         deleteInstructorById()(инструктор очкондо, инструкторго тиешелуу курс очпошу керек),
    //         assignInstructorToCourse()(инструкторду курска кошуп коюу(назначить)).
    //
    void saveInstructor(Instructor instructor);
    void updateInstructor(Long id, String firstName, String lastName
    ,String email, String phoneNumber);
    Instructor getInstructorById(Long id);
    List<Instructor> getInstructorByCourseId(Long id);
    void deleteInstructorById(Long id);
    void assignInstructorToCourse(Long courseId,Long ins_id);

}
