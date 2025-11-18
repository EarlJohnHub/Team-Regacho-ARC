package com.appdevf1.team_regotchu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.appdevf1.team_regotchu.entity.FacultyCoursesEntity;
import com.appdevf1.team_regotchu.repository.FacultyCoursesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FacultyCoursesService {

    private final FacultyCoursesRepository repository;

    // Create or Update
    public FacultyCoursesEntity saveFacultyCourse(FacultyCoursesEntity facultyCourse) {
        return repository.save(facultyCourse);
    }

    // Read all
    public List<FacultyCoursesEntity> getAllFacultyCourses() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<FacultyCoursesEntity> getFacultyCourseById(int id) {
        return repository.findById(id);
    }

    // Delete
    public void deleteFacultyCourse(int id) {
        repository.deleteById(id);
    }
}

