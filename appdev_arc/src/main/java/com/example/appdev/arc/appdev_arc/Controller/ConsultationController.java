package com.example.appdev.arc.appdev_arc.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import lombok.RequiredArgsConstructor;


import com.example.appdev.arc.appdev_arc.Entity.ConsultationEntity;
import com.example.appdev.arc.appdev_arc.Service.ConsultationService;

@RestController
@RequestMapping("/consulation-proposals")
@RequiredArgsConstructor


public class ConsultationController {

    private final ConsultationService service;

    // CREATE
    @PostMapping
    public ConsultationEntity create(@RequestBody ConsultationEntity consultation) {
        return service.saveConsultation(consultation);
    }

    // READ ALL
    @GetMapping
    public List<ConsultationEntity> getAll() {
        return service.getAllConsultations();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<ConsultationEntity> getOne(@PathVariable int id) {
        return service.getConsultationById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ConsultationEntity update(@PathVariable Long id, @RequestBody ConsultationEntity consultation) {
        consultation.setConsultation_id(id);
        return service.saveConsultation(consultation);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteConsultation(id);
    }
}
