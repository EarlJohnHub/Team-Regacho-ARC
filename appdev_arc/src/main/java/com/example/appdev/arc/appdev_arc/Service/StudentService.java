package com.example.appdev.arc.appdev_arc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appdev.arc.appdev_arc.entity.Student;
import com.example.appdev.arc.appdev_arc.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //Read All
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

        // READ BY ID
    public Optional<Student> getStudentById(Integer id) {
        return studentRepository.findById(id);
    }

    // CREATE
    public Student createStudent(Student student) {
        student.setRole(Student.Role.Student);
        return studentRepository.save(student);
    }

    // UPDATE
    public Optional<Student> updateStudent(Integer id, Student updatedStudent) {
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
