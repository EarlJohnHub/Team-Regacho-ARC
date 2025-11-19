package com.appdevf1.team_regotchu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import com.appdevf1.team_regotchu.entity.ProgramEntity;
import com.appdevf1.team_regotchu.repository.ProgramRepository;

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

    // update one
    public Optional<ProgramEntity> updateProgram(int id, ProgramEntity updatedProgram) {
        return programRepository.findById(id).map(program -> {
            program.setProgramName(updatedProgram.getProgramName());
            return programRepository.save(program);
        });
    }

    // Delete
    public void deleteProgram(int id) {
        programRepository.deleteById(id);
    }

    
}
