package com.example.appdev.arc.appdev_arc.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import lombok.RequiredArgsConstructor;


import com.example.appdev.arc.appdev_arc.Entity.ResearchProposalEntity;
import com.example.appdev.arc.appdev_arc.Service.ResearchProposalService;

@RestController
@RequestMapping("/research-proposals")
@RequiredArgsConstructor
public class ResearchProposalController {

    private final ResearchProposalService service;

    // CREATE
    @PostMapping
    public ResearchProposalEntity create(@RequestBody ResearchProposalEntity proposal) {
        return service.saveResearchProposal(proposal);
    }

    // READ ALL
    @GetMapping
    public List<ResearchProposalEntity> getAll() {
        return service.getAllResearchProposals();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<ResearchProposalEntity> getOne(@PathVariable int id) {
        return service.getResearchProposalById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResearchProposalEntity update(@PathVariable Long id, @RequestBody ResearchProposalEntity proposal) {
        proposal.setProposal_id(id);
        return service.saveResearchProposal(proposal);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteResearchProposal(id);
    }
}
