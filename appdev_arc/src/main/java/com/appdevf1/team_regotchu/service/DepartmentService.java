package com.appdevf1.team_regotchu.service;

import com.appdevf1.team_regotchu.entity.DepartmentEntity;
import com.appdevf1.team_regotchu.repository.DepartmentRepository;

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
