package com.appdevf1.team_regotchu.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.appdevf1.team_regotchu.entity.CourseEntity;
import com.appdevf1.team_regotchu.repository.CourseRepository;

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
