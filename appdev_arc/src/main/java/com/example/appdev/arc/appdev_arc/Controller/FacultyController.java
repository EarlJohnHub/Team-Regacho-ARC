package com.example.appdev.arc.appdev_arc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appdev.arc.appdev_arc.entity.FacultyEntity;
import com.example.appdev.arc.appdev_arc.service.FacultyService;


@RestController
@RequestMapping("/faculties")
public class FacultyController {
    @Autowired
    private FacultyService faculty_service;

    @GetMapping
    public List<FacultyEntity> getAllFaculties() {
        return faculty_service.getAllFaculties();
    }

    @GetMapping("/{id}")
    public FacultyEntity getFacultyId(@PathVariable int id) {
        return faculty_service.getFacultyById(id).orElse(null);
    }

    @PostMapping
    public FacultyEntity createFaculty(@RequestBody FacultyEntity faculty) {
        return faculty_service.createFaculty(faculty);
    }

    // UPDATE
    @PutMapping("/{id}")
    public FacultyEntity updateFaculty(@PathVariable int id, @RequestBody FacultyEntity updatedFaculty) {
        return faculty_service.updateFaculty(id, updatedFaculty).orElse(null);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteFaculty(@PathVariable Integer id) {
        boolean deleted = faculty_service.deleteFaculty(id);
        return deleted ? "Faculty deleted successfully." : "Faculty not found.";
    }
}

