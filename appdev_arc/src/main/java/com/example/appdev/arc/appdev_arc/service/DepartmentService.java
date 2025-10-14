package com.example.appdev.arc.appdev_arc.service;

import com.example.appdev.arc.appdev_arc.entity.DepartmentEntity;
import com.example.appdev.arc.appdev_arc.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentEntity saveDepartment(DepartmentEntity department) {return departmentRepository.save(department);}

    public List<DepartmentEntity> getAllDepartment() {return departmentRepository.findAll();}

    public Optional<DepartmentEntity> findById(int id) {return departmentRepository.findById(id);}

    public void deleteDeparment(int id) {departmentRepository.deleteById(id);}
}
