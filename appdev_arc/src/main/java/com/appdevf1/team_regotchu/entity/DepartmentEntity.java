package com.appdevf1.team_regotchu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "department")
public class DepartmentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentID;

    @Column(name = "department_name")
    private String departmentName;
    
    @Column(name = "department_code")
    private int departmentCode;

    @ManyToOne
    @JoinColumn(name = "college_id", referencedColumnName = "collegeID")
    @JsonBackReference
    private CollegeEntity college;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ProgramEntity> programEntities = new ArrayList<>();

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<UserEntity> userEntities = new ArrayList<>();
}
