package com.appdevf1.team_regotchu.controller;

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

import com.appdevf1.team_regotchu.entity.ProgramCoursesEntity;
import com.appdevf1.team_regotchu.service.ProgramCoursesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/program-courses")
@RequiredArgsConstructor
public class ProgramCoursesController {

    private final ProgramCoursesService service;

    // CREATE
    @PostMapping
    public ProgramCoursesEntity create(@RequestBody ProgramCoursesEntity programCourse) {
        return service.saveProgramCourse(programCourse);
    }

    // READ ALL
    @GetMapping
    public List<ProgramCoursesEntity> getAll() {
        return service.getAllProgramCourses();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<ProgramCoursesEntity> getOne(@PathVariable int id) {
        return service.getProgramCourseById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ProgramCoursesEntity update(@PathVariable int id, @RequestBody ProgramCoursesEntity programCourse) {
        programCourse.setProgramCourseId(id);
        return service.saveProgramCourse(programCourse);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteProgramCourse(id);
    }
}
