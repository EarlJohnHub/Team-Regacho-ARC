package com.appdevf1.team_regotchu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdevf1.team_regotchu.entity.AdministratorEntity;
import com.appdevf1.team_regotchu.repository.AdministratorRepository;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepository administrator_repository;

    public List<AdministratorEntity> getAllAdministrators() {
        return administrator_repository.findAll();
    }

    public Optional<AdministratorEntity> getAdministratorById(int id) {
        return administrator_repository.findById(id);
    }

    public AdministratorEntity createAdministrator(AdministratorEntity admin) {
        admin.setRole(AdministratorEntity.Role.Admin);
        return administrator_repository.save(admin);
    }

    public Optional<AdministratorEntity> updateAdministrator(int id, AdministratorEntity updatedAdmin) {
        return administrator_repository.findById(id).map(admin -> {
            admin.setName(updatedAdmin.getName());
            admin.setEmail(updatedAdmin.getEmail());            
            admin.setPassword(updatedAdmin.getPassword());         
            return administrator_repository.save(admin); 
        });
    }

    public boolean deleteAdministrator(int id) {
        if (administrator_repository.existsById(id)) {
            administrator_repository.deleteById(id);
            return true;
        }
        return false;
    }
}

