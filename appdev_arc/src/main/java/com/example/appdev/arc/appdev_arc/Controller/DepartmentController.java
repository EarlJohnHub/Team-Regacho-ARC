package com.example.appdev.arc.appdev_arc.controller;


import com.example.appdev.arc.appdev_arc.entity.DepartmentEntity;
import com.example.appdev.arc.appdev_arc.service.*;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    //added this because of error
    // public DepartmentController(DepartmentService departmentService) {
    //     this.departmentService = departmentService;
    // }

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
