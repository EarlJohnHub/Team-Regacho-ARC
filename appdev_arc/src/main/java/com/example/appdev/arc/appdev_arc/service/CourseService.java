package com.example.appdev.arc.appdev_arc.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.appdev.arc.appdev_arc.entity.CourseEntity;
import com.example.appdev.arc.appdev_arc.repository.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    // // Create or Update
    public CourseEntity saveCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    // // Read all
    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    // // Read by ID
    public Optional<CourseEntity> getCourseById(int id) {
        return courseRepository.findById(id);
    }

    // // Delete
    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
    
}
