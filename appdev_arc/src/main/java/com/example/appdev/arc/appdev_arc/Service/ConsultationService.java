package com.example.appdev.arc.appdev_arc.Service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.appdev.arc.appdev_arc.Entity.ConsultationEntity;
import com.example.appdev.arc.appdev_arc.Repository.ConsultationRepository;

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
