package com.appdevf1.team_regotchu.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.appdevf1.team_regotchu.entity.ResearchProposalEntity;
import com.appdevf1.team_regotchu.repository.ResearchProposalRepository;

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
