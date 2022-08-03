package org.example.daoServisImple;

import org.example.daoImple.InstructorDaoServis;
import org.example.daoMethods.InstructorDao;
import org.example.example.Instructor;

import java.util.List;

public class InstructorServisImple implements InstructorDaoServis {
    InstructorDao instructorDao = new InstructorDao();
    @Override
    public void saveInstructor(Instructor instructor) {
        instructorDao.saveInstructor(instructor);
    }

    @Override
    public void updateInstructor(Long id, String firstName, String lastName, String email, String phoneNumber) {
        instructorDao.updateInstructor(id,firstName,lastName,email,phoneNumber);
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return instructorDao.getInstructorById(id);
    }

    @Override
    public List<Instructor> getInstructorByCourseId(Long id) {
        return getInstructorByCourseId(id);
    }

    @Override
    public void deleteInstructorById(Long id) {
        instructorDao.deleteInstructorById(id);
    }

    @Override
    public void assignInstructorToCourse(Long courseId, Long ins_id) {
        instructorDao.assignInstructorToCourse(courseId,ins_id);
    }
}
