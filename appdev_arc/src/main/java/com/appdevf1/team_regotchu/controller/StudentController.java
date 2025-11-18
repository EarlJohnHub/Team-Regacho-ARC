package com.appdevf1.team_regotchu.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdevf1.team_regotchu.entity.StudentEntity;
import com.appdevf1.team_regotchu.service.StudentService;


@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id).orElse(null);
    }

    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public StudentEntity updateStudent(@PathVariable Integer id, @RequestBody StudentEntity updatedStudent) {
        return studentService.updateStudent(id, updatedStudent).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        boolean deleted = studentService.deleteStudent(id);
        return deleted ? "Student deleted successfully." : "Student not found.";
    }
}

