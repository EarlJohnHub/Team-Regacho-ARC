package com.example.appdev.arc.appdev_arc.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;

    private Integer consultation_id;

     // Getters and Setters
    public Integer getStudentId() { return student_id; }
    public void setStudentId(Integer studentId) { this.student_id = studentId; }

    public Integer getConsultationId() { return consultation_id; }
    public void setConsultationId(Integer consultationId) { this.consultation_id = consultationId; }

}
