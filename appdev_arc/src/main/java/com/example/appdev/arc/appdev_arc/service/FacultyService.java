package com.example.appdev.arc.appdev_arc.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.appdev.arc.appdev_arc.entity.FacultyEntity;
import com.example.appdev.arc.appdev_arc.repository.FacultyRepository;


@Service
public class FacultyService {
    @Autowired
    private FacultyRepository faculty_repository;


    public List<FacultyEntity> getAllFaculties() {
        return faculty_repository.findAll();
    }


    public Optional<FacultyEntity> getFacultyById(int id) {
        return faculty_repository.findById(id);
    }


    public FacultyEntity createFaculty(FacultyEntity faculty) {
        faculty.setRole(FacultyEntity.Role.Faculty);
        return faculty_repository.save(faculty);
    }


    public Optional<FacultyEntity> updateFaculty(int id, FacultyEntity updatedFaculty) {
        return faculty_repository.findById(id).map(faculty -> {
            faculty.setName(updatedFaculty.getName());
            faculty.setEmail(updatedFaculty.getEmail());
            faculty.setPassword(updatedFaculty.getPassword());
            faculty.setDepartment(updatedFaculty.getDepartment());
//            faculty.setConsultationId(updatedFaculty.getConsultationId());
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

