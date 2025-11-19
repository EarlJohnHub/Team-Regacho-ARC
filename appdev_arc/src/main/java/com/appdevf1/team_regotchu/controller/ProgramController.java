package com.appdevf1.team_regotchu.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.appdevf1.team_regotchu.entity.ProgramEntity;
import com.appdevf1.team_regotchu.service.ProgramService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/program")
@RequiredArgsConstructor
public class ProgramController {

    private final ProgramService service;

    // create
    @PostMapping
    public ProgramEntity create(@RequestBody ProgramEntity program) {
        return service.saveProgram(program);
    }

    // read all
    @GetMapping
    public List<ProgramEntity> getAll() {
        return service.getAllPrograms();
    }

    // read one
    @GetMapping("/{id}")
    public Optional<ProgramEntity> getOne(@PathVariable int id) {
        return service.getProgramById(id);
    }
    
    // update 
    @PutMapping("/{id}")
    public ProgramEntity updateProgram(@PathVariable Integer id, @RequestBody ProgramEntity updatedProgram) {
        return service.updateProgram(id, updatedProgram).orElse(null);
    }

    // delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteProgram(id);
    }



}

