package com.appdevf1.team_regotchu.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "college")
public class CollegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collegeID;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "college_code")
    private int collegeCode;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<DepartmentEntity> departmentEntities = new ArrayList<>();

}
