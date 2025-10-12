package com.example.appdev.arc.appdev_arc.Controller;

import com.example.appdev.arc.appdev_arc.Entity.College;
import com.example.appdev.arc.appdev_arc.Service.CollegeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/college")
@RequiredArgsConstructor
public class CollegeController {

    private final CollegeService collegeService;

    // CREATE
    @PostMapping
    public College create(@RequestBody College college) {
        return collegeService.saveCollege(college);
    }

    // READ ALL
    @GetMapping
    public List<College> getAll() {
        return collegeService.getAllColleges();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<College> getOne(@PathVariable int id) {
        return collegeService.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public College update(@PathVariable int id, @RequestBody College college) {
        collegeService.findById(id);
        return collegeService.saveCollege(college);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        collegeService.deleteCollege(id);
    }
}
