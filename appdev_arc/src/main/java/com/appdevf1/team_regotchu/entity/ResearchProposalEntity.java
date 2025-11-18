package com.appdevf1.team_regotchu.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "research_proposals")
public class ResearchProposalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proposal_id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "abstract", columnDefinition = "TEXT")
    private String proposalAbstract;

    @Column(name = "document_path")
    private String documentPath;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "feedback", columnDefinition = "TEXT")
    private String feedback;

    public enum Status {
        PENDING,
        APPROVED,
        REJECTED
    }

    // foreign keys, uncomment onced other entities are created

    @OneToMany(mappedBy = "researchProposal", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("consultation-proposal")
    private List<ConsultationEntity> consultations = new ArrayList<>();

}
