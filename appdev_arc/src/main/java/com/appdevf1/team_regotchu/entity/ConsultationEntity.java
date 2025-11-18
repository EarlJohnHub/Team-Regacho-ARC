package com.appdevf1.team_regotchu.entity;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "consultations")
// this is the consultationLog Entity | will keep the name as is for now
public class ConsultationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long consultation_id;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private LocalDateTime time;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;
    
    @Column(name = "remarks")
    private String remarks;

    public enum Status {
        PENDING,
        ACCEPTED,
        COMPLETED
    }

    // foreign keys, uncomment onced other entities are created

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "userID")
    @JsonBackReference("consultation-student")
    private StudentEntity student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id", referencedColumnName = "userID")
    @JsonBackReference("consultation-faculty")
    private FacultyEntity faculty;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proposal_id", referencedColumnName = "proposal_id")
    @JsonBackReference("consultation-proposal")
    private ResearchProposalEntity researchProposal;
   
}
