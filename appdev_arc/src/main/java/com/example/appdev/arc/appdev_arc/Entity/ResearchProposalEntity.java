package com.example.appdev.arc.appdev_arc.entity;

import lombok.Data;

import jakarta.persistence.*;

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

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "student_id", referencedColumnName = "userID")
    //private StudentEntity student;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "faculty_id", referencedColumnName = "userID")
    //private FacultyEntity faculty;

    //@OneToMany(mappedBy = "researchProposal", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<ConsultationEntity> consultations = new ArrayList<>();

}
