package com.example.appdev.arc.appdev_arc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import com.example.appdev.arc.appdev_arc.entity.ProgramEntity;
import com.example.appdev.arc.appdev_arc.repository.ProgramRepository;

@Service
@RequiredArgsConstructor
public class ProgramService {

    private final ProgramRepository programRepository;

    // Create or Update
    public ProgramEntity saveProgram(ProgramEntity program) {
        return programRepository.save(program);
    }

    // Read all
    public List<ProgramEntity> getAllPrograms() {
        return programRepository.findAll();
    }

    // Read by ID
    public Optional<ProgramEntity> getProgramById(int id) {
        return programRepository.findById(id);
    }

    // Delete
    public void deleteProgram(int id) {
        programRepository.deleteById(id);
    }

    
}
