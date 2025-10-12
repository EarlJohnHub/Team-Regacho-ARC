package com.example.appdev.arc.appdev_arc.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Faculties")
public class Faculty extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer faculty_id;

    private Integer consultation_id;
    
    private String department;

    // Getters and Setters
    public Integer getFacultyId() { return faculty_id; }
    public void setFacultyId(Integer facultyId) { this.faculty_id = facultyId; }

    public Integer getConsultationId() { return consultation_id; }
    public void setConsultationId(Integer consultationId) { this.consultation_id = consultationId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
