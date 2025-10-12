package com.example.appdev.arc.appdev_arc.Service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.appdev.arc.appdev_arc.Entity.ResearchProposalEntity;
import com.example.appdev.arc.appdev_arc.Repository.ResearchProposalRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ResearchProposalService {

    private final ResearchProposalRepository repository;

    // Create or Update
    public ResearchProposalEntity saveResearchProposal(ResearchProposalEntity proposal) {
        return repository.save(proposal);
    }

    // Read all
    public List<ResearchProposalEntity> getAllResearchProposals() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<ResearchProposalEntity> getResearchProposalById(int id) {
        return repository.findById(id); 
    }

    // Delete
    public void deleteResearchProposal(int id) {
        repository.deleteById(id);
    }   
}
