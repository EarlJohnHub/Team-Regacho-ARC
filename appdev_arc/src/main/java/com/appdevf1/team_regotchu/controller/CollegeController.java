package com.appdevf1.team_regotchu.controller;

import com.appdevf1.team_regotchu.entity.CollegeEntity;
import com.appdevf1.team_regotchu.service.CollegeService;
import lombok.RequiredArgsConstructor;
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
    public CollegeEntity create(@RequestBody CollegeEntity college) {
        return collegeService.saveCollege(college);
    }

    // READ ALL
    @GetMapping
    public List<CollegeEntity> getAll() {
        return collegeService.getAllColleges();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<CollegeEntity> getOne(@PathVariable int id) {
        return collegeService.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public CollegeEntity update(@PathVariable int id, @RequestBody CollegeEntity college) {
        collegeService.findById(id);
        return collegeService.saveCollege(college);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        collegeService.deleteCollege(id);
    }
}
