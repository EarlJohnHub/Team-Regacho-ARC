package com.example.appdev.arc.appdev_arc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class StudentEntity extends UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentID;

    private int consultationID;

    // Getters and Setters
    public int getStudentId() { return studentID; }
    public void setStudentId(int studentId) { this.studentID = studentId; } 

    public int getConsultationId() { return consultationID; }
    public void setConsultationId(int consultationId) { this.consultationID = consultationId; }

}
