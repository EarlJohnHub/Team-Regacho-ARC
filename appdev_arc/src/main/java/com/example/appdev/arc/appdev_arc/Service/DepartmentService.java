package com.example.appdev.arc.appdev_arc.Service;

import com.example.appdev.arc.appdev_arc.Entity.Department;
import com.example.appdev.arc.appdev_arc.Repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {return departmentRepository.save(department);}

    public List<Department> getAllDepartment() {return departmentRepository.findAll();}

    public Optional<Department> findById(int id) {return departmentRepository.findById(id);}

    public void deleteDeparment(int id) {departmentRepository.deleteById(id);}
}
