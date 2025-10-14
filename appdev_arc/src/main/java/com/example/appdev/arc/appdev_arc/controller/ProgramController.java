package com.example.appdev.arc.appdev_arc.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.example.appdev.arc.appdev_arc.entity.ProgramEntity;
import com.example.appdev.arc.appdev_arc.service.ProgramService;

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
    
    // delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteProgram(id);
    }



}

