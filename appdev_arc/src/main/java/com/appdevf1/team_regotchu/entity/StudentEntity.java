package com.appdevf1.team_regotchu.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class StudentEntity extends UserEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int studentID;

//    private int consultationID;

    // Getters and Setters
//    public int getStudentId() { return studentID; }
//    public void setStudentId(int studentId) { this.studentID = studentId; }

//    public int getConsultationId() { return consultationID; }
//    public void setConsultationId(int consultationId) { this.consultationID = consultationId; }

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("consultation-student")
    private List<ConsultationEntity> consultationEntities = new ArrayList<>();
}
