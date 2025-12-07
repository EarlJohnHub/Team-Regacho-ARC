package com.appdevf1.team_regotchu.controller;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import com.appdevf1.team_regotchu.entity.AdministratorEntity;
import com.appdevf1.team_regotchu.service.AdministratorService;

import java.util.List;

@RestController
@RequestMapping("/administrators")
@RequiredArgsConstructor
public class AdministratorController {

    
    private final AdministratorService administratorService;

    // READ ALL
    @GetMapping
    public List<AdministratorEntity> getAllAdministrators() {
        return administratorService.getAllAdministrators();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public AdministratorEntity getAdministratorById(@PathVariable int id) {
        return administratorService.getAdministratorById(id).orElse(null);
    }

    // CREATE
    @PostMapping
    public AdministratorEntity createAdministrator(@RequestBody AdministratorEntity admin) {
        return administratorService.createAdministrator(admin);
    }

    // UPDATE
    @PutMapping("/{id}")
    public AdministratorEntity updateAdministrator(@PathVariable int id, @RequestBody AdministratorEntity updatedAdmin) {
        return administratorService.updateAdministrator(id, updatedAdmin).orElse(null);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteAdministrator(@PathVariable Integer id) {
        boolean deleted = administratorService.deleteAdministrator(id);
        return deleted ? "Administrator deleted successfully." : "Administrator not found.";
    }
}
