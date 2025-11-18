package com.appdevf1.team_regotchu.controller;


import com.appdevf1.team_regotchu.entity.DepartmentEntity;
import com.appdevf1.team_regotchu.service.DepartmentService;
import com.appdevf1.team_regotchu.service.*;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    // CREATE
    @PostMapping
    public DepartmentEntity create(@RequestBody DepartmentEntity department) {
        return departmentService.saveDepartment(department);
    }

    // READ ALL
    @GetMapping
    public List<DepartmentEntity> getAll() {
        return departmentService.getAllDepartment();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<DepartmentEntity> getOne(@PathVariable int id) {
        return departmentService.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public DepartmentEntity update(@PathVariable int id, @RequestBody DepartmentEntity department) {
        departmentService.findById(id);
        return departmentService.saveDepartment(department);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        departmentService.deleteDeparment(id);
    }
}
