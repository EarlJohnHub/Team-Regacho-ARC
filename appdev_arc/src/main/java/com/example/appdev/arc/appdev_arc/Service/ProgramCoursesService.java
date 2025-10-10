package com.example.appdev.arc.appdev_arc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.appdev.arc.appdev_arc.entity.ProgramCourses;
import com.example.appdev.arc.appdev_arc.repository.ProgramCoursesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProgramCoursesService {

    private final ProgramCoursesRepository repository;

    // Create or Update
    public ProgramCourses saveProgramCourse(ProgramCourses programCourse) {
        return repository.save(programCourse);
    }

    // Read all
    public List<ProgramCourses> getAllProgramCourses() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<ProgramCourses> getProgramCourseById(int id) {
        return repository.findById(id);
    }

    // Delete
    public void deleteProgramCourse(int id) {
        repository.deleteById(id);
    }
}