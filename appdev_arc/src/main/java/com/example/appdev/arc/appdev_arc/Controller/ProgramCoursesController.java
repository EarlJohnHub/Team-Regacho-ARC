package com.example.appdev.arc.appdev_arc.Controller;

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

import com.example.appdev.arc.appdev_arc.Entity.ProgramCourses;
import com.example.appdev.arc.appdev_arc.Service.ProgramCoursesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/program-courses")
@RequiredArgsConstructor
public class ProgramCoursesController {

    private final ProgramCoursesService service;

    // CREATE
    @PostMapping
    public ProgramCourses create(@RequestBody ProgramCourses programCourse) {
        return service.saveProgramCourse(programCourse);
    }

    // READ ALL
    @GetMapping
    public List<ProgramCourses> getAll() {
        return service.getAllProgramCourses();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<ProgramCourses> getOne(@PathVariable int id) {
        return service.getProgramCourseById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ProgramCourses update(@PathVariable int id, @RequestBody ProgramCourses programCourse) {
        programCourse.setProgramCourseId(id);
        return service.saveProgramCourse(programCourse);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteProgramCourse(id);
    }
}
