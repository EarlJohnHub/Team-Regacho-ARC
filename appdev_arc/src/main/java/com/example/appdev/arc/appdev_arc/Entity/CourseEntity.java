package com.example.appdev.arc.appdev_arc.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "course")
@Data
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "course_name")
    private String courseName;
}
