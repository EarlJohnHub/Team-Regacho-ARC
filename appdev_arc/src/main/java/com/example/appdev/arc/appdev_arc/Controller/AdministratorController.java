package com.example.appdev.arc.appdev_arc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.appdev.arc.appdev_arc.entity.Administrator;
import com.example.appdev.arc.appdev_arc.service.AdministratorService;

import java.util.List;

@RestController
@RequestMapping("/administrators")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    // READ ALL
    @GetMapping
    public List<Administrator> getAllAdministrators() {
        return administratorService.getAllAdministrators();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Administrator getAdministratorById(@PathVariable Integer id) {
        return administratorService.getAdministratorById(id).orElse(null);
    }

    // CREATE
    @PostMapping
    public Administrator createAdministrator(@RequestBody Administrator admin) {
        return administratorService.createAdministrator(admin);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Administrator updateAdministrator(@PathVariable Integer id, @RequestBody Administrator updatedAdmin) {
        return administratorService.updateAdministrator(id, updatedAdmin).orElse(null);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteAdministrator(@PathVariable Integer id) {
        boolean deleted = administratorService.deleteAdministrator(id);
        return deleted ? "Administrator deleted successfully." : "Administrator not found.";
    }
}
