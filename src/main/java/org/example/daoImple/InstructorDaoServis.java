package org.example.daoImple;

import org.example.example.Instructor;

import java.util.List;

public interface InstructorDaoServis {

    void saveInstructor(Instructor instructor);

    void updateInstructor(Long id, String firstName, String lastName
            ,String email, String phoneNumber);

    Instructor getInstructorById(Long id);

    List<Instructor> getInstructorByCourseId(Long id);

    void deleteInstructorById(Long id);

    void assignInstructorToCourse(Long courseId,Long ins_id);

}
