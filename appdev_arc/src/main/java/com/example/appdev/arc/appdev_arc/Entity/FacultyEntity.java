package com.example.appdev.arc.appdev_arc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Faculty")
public class FacultyEntity extends UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facultyID;


    private int consultationID;
    private String department;

    // Getters and Setters
    public int getFacultyId() { return facultyID; }
    public void setFacultyId(Integer facultyId) { this.facultyID = facultyId; }

    public int getConsultationId() { return consultationID; }
    public void setConsultationId(int consultationId) { this.consultationID = consultationId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
