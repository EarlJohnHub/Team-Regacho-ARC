package com.example.appdev.arc.appdev_arc.entity;
import java.time.*;
import java.util.*;
import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "consultations")
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
    
    @Column(name = "description")
    private String description;

    public enum Status {
        PENDING,
        ACCEPTED,
        COMPLETED
    }

    // foreign keys, uncomment onced other entities are created

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "student_id", referencedColumnName = "userID")
    //private StudentEntity student;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "faculty_id", referencedColumnName = "userID")
    //private FacultyEntity faculty;

    
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "proposal_id", referencedColumnName = "proposalID")
    //private ResearchProposalEntity researchProposal;
   
}
