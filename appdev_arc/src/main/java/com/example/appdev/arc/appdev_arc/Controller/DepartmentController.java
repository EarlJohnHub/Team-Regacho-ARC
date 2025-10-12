package com.example.appdev.arc.appdev_arc.Controller;

import com.example.appdev.arc.appdev_arc.Entity.College;
import com.example.appdev.arc.appdev_arc.Entity.Department;
import com.example.appdev.arc.appdev_arc.Service.CollegeService;
import com.example.appdev.arc.appdev_arc.Service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    // CREATE
    @PostMapping
    public Department create(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    // READ ALL
    @GetMapping
    public List<Department> getAll() {
        return departmentService.getAllDepartment();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<Department> getOne(@PathVariable int id) {
        return departmentService.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Department update(@PathVariable int id, @RequestBody Department department) {
        departmentService.findById(id);
        return departmentService.saveDepartment(department);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        departmentService.deleteDeparment(id);
    }
}
