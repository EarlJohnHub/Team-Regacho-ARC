package com.example.appdev.arc.appdev_arc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "program")
@Data
public class ProgramEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int programID;

    @Column(name = "programName")
    private String programName;

    
}
