package com.appdevf1.team_regotchu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.appdevf1.team_regotchu.entity.ProgramCoursesEntity;
import com.appdevf1.team_regotchu.repository.ProgramCoursesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProgramCoursesService {

    private final ProgramCoursesRepository repository;

    // Create or Update
    public ProgramCoursesEntity saveProgramCourse(ProgramCoursesEntity programCourse) {
        return repository.save(programCourse);
    }

    // Read all
    public List<ProgramCoursesEntity> getAllProgramCourses() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<ProgramCoursesEntity> getProgramCourseById(int id) {
        return repository.findById(id);
    }

    // Delete
    public void deleteProgramCourse(int id) {
        repository.deleteById(id);
    }
}