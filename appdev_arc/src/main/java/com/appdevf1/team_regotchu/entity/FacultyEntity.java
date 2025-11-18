package com.appdevf1.team_regotchu.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Faculty")
@Getter
@Setter
public class FacultyEntity extends UserEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int facultyID;


//    private int consultationID;
//    private String department;

    // Getters and Setters
//    public int getFacultyId() { return facultyID; }
//    public void setFacultyId(Integer facultyId) { this.facultyID = facultyId; }

//    public int getConsultationId() { return consultationID; }
//    public void setConsultationId(int consultationId) { this.consultationID = consultationId; }

//    public String getDepartment() { return department; }
//    public void setDepartment(String department) { this.department = department; }

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("facultyCourse-faculty")
    private List<FacultyCoursesEntity> facultyCoursesEntities = new ArrayList<>();

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("consultation-faculty")
    private List<ConsultationEntity> consultationEntities = new ArrayList<>();
}
