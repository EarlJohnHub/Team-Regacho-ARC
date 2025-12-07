package com.appdevf1.team_regotchu.controller;

import java.util.*;


import org.springframework.web.bind.annotation.*;

import com.appdevf1.team_regotchu.entity.CourseEntity;
import com.appdevf1.team_regotchu.service.CourseService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;

    // create
    @PostMapping
    public CourseEntity create(@RequestBody CourseEntity course) {
        return service.saveCourse(course);
    }

    @GetMapping
    public List<CourseEntity> getAll() {
        return service.getAllCourses();
    }

    @GetMapping("/{id}")
    public Optional<CourseEntity> getOne(@PathVariable int id) {
        return service.getCourseById(id);
    }
    
    @PutMapping("/{id}")
    public CourseEntity updateCourse(@PathVariable Integer id, @RequestBody CourseEntity updatedCourse) {
        return service.updateCourse(id, updatedCourse).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteCourse(id);
    }
}