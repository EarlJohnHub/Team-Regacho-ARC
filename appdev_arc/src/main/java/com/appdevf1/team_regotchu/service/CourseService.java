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

    // update by id
    public Optional<CourseEntity> updateCourse(int id, CourseEntity updatedCourse) {
        return courseRepository.findById(id).map(course -> {
            course.setCourseName(updatedCourse.getCourseName());
            return courseRepository.save(course);
        });
    }

    // // Delete
    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
    
}
