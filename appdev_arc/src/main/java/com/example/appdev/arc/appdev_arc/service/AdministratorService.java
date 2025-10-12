package com.example.appdev.arc.appdev_arc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.appdev.arc.appdev_arc.entity.Administrator;
import com.example.appdev.arc.appdev_arc.repository.AdministratorRepository;

public class AdministratorService {

    @Autowired
    private AdministratorRepository administrator_repository;

    public List<Administrator> getAllAdministrators() {
        return administrator_repository.findAll();
    }

    public Optional<Administrator> getAdministratorById(Integer id) {
        return administrator_repository.findById(id);
    }

    public Administrator createAdministrator(Administrator admin) {
        admin.setRole(Administrator.Role.Admin);
        return administrator_repository.save(admin);
    }

    public Optional<Administrator> updateAdministrator(Integer id, Administrator updatedAdmin) {
        return administrator_repository.findById(id).map(admin -> {
            admin.setName(updatedAdmin.getName());
            admin.setEmail(updatedAdmin.getEmail());
            admin.setPassword(updatedAdmin.getPassword());
            return administrator_repository.save(admin);
        });
    }

    public boolean deleteAdministrator(Integer id) {
        if (administrator_repository.existsById(id)) {
            administrator_repository.deleteById(id);
            return true;
        }
        return false;
    }
}
