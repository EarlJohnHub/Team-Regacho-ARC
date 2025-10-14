package com.example.appdev.arc.appdev_arc.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(nullable = false, unique = true)
    private String email;


    @Column(nullable = false)
    private String password;

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        Student, Faculty, Admin
    }

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "departmentID")
    @JsonBackReference
    private DepartmentEntity department;
}
