package com.appdevf1.team_regotchu.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.appdevf1.team_regotchu.entity.ConsultationEntity;
import com.appdevf1.team_regotchu.repository.ConsultationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConsultationService {

    private final ConsultationRepository repository;

    // Create or Update
    public ConsultationEntity saveConsultation(ConsultationEntity consultation) {
        return repository.save(consultation);
    }

    // Read all
    public List<ConsultationEntity> getAllConsultations() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<ConsultationEntity> getConsultationById(int id) {
        return repository.findById(id);
    }

    // Delete
    public void deleteConsultation(int id) {
        repository.deleteById(id);
    }   

}
