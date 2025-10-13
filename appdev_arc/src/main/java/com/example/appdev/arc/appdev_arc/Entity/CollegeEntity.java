package com.example.appdev.arc.appdev_arc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "college")
public class CollegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collegeID;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "course_code")
    private int collegeCode;
}
