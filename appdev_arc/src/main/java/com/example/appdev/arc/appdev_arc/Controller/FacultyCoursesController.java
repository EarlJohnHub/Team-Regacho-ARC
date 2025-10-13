package com.example.appdev.arc.appdev_arc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appdev.arc.appdev_arc.entity.FacultyCoursesEntity;
import com.example.appdev.arc.appdev_arc.service.FacultyCoursesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/faculty-courses")
@RequiredArgsConstructor
public class FacultyCoursesController {

    private final FacultyCoursesService service;

    // CREATE
    @PostMapping
    public FacultyCoursesEntity create(@RequestBody FacultyCoursesEntity facultyCourse) {
        return service.saveFacultyCourse(facultyCourse);
    }

    // READ ALL
    @GetMapping
    public List<FacultyCoursesEntity> getAll() {
        return service.getAllFacultyCourses();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<FacultyCoursesEntity> getOne(@PathVariable int id) {
        return service.getFacultyCourseById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public FacultyCoursesEntity update(@PathVariable int id, @RequestBody FacultyCoursesEntity facultyCourse) {
        facultyCourse.setFacultyCourseId(id);
        return service.saveFacultyCourse(facultyCourse);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteFacultyCourse(id);
    }
}

