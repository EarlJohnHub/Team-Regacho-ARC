package com.example.appdev.arc.appdev_arc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.appdev.arc.appdev_arc.entity.FacultyCourses;
import com.example.appdev.arc.appdev_arc.repository.FacultyCoursesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FacultyCoursesService {

    private final FacultyCoursesRepository repository;

    // Create or Update
    public FacultyCourses saveFacultyCourse(FacultyCourses facultyCourse) {
        return repository.save(facultyCourse);
    }

    // Read all
    public List<FacultyCourses> getAllFacultyCourses() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<FacultyCourses> getFacultyCourseById(int id) {
        return repository.findById(id);
    }

    // Delete
    public void deleteFacultyCourse(int id) {
        repository.deleteById(id);
    }
}

