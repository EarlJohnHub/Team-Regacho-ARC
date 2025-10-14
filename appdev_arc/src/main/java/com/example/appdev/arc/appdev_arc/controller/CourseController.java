package com.example.appdev.arc.appdev_arc.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.appdev.arc.appdev_arc.entity.CourseEntity;
import com.example.appdev.arc.appdev_arc.service.CourseService;

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

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteCourse(id);
    }
}