package com.example.appdev.arc.appdev_arc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appdev.arc.appdev_arc.entity.StudentEntity;
import com.example.appdev.arc.appdev_arc.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //Read All
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

        // READ BY ID
    public Optional<StudentEntity> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    // CREATE
    public StudentEntity createStudent(StudentEntity student) {
        student.setRole(StudentEntity.Role.Student);
        return studentRepository.save(student);
    }

    // UPDATE
    public Optional<StudentEntity> updateStudent(int id, StudentEntity updatedStudent) {
        return studentRepository.findById(id).map(student -> {
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setPassword(updatedStudent.getPassword());
            student.setConsultationId(updatedStudent.getConsultationId());
            return studentRepository.save(student);
        });
    }

    // DELETE
    public boolean deleteStudent(Integer id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

}

