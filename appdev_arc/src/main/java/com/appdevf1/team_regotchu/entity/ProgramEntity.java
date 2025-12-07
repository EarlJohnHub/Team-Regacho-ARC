package com.appdevf1.team_regotchu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "program")
@Data
public class ProgramEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int programID;

    @Column(name = "programName")
    private String programName;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "departmentID")
    @JsonBackReference
    private DepartmentEntity department;

    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("program-programCourses")
    private List<ProgramCoursesEntity> programCoursesEntities = new ArrayList<>();

}
