package com.example.appdev.arc.appdev_arc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appdev.arc.appdev_arc.entity.Faculty;
import com.example.appdev.arc.appdev_arc.repository.FacultyRepository;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository faculty_repository;

    public List<Faculty> getAllFaculties() {
        return faculty_repository.findAll();
    }

    public Optional<Faculty> getFacultyById(Integer id) {
        return faculty_repository.findById(id);
    }

    public Faculty createFaculty(Faculty faculty) {
        faculty.setRole(Faculty.Role.Faculty);
        return faculty_repository.save(faculty);
    }

    public Optional<Faculty> updateFaculty(Integer id, Faculty updatedFaculty) {
        return faculty_repository.findById(id).map(faculty -> {
            faculty.setName(updatedFaculty.getName());
            faculty.setEmail(updatedFaculty.getEmail());
            faculty.setPassword(updatedFaculty.getPassword());
            faculty.setDepartment(updatedFaculty.getDepartment());
            faculty.setConsultationId(updatedFaculty.getConsultationId());
            return faculty_repository.save(faculty);
        });
    }

    public boolean deleteFaculty(Integer id) {
        if (faculty_repository.existsById(id)) {
            faculty_repository.deleteById(id);
            return true;
        }
        return false;
    }
}
