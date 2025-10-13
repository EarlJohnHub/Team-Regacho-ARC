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
@Table(name = "department")
public class DepartmentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentID;

    @Column(name = "department_name")
    private String departmentName;
    
    @Column(name = "department_code")
    private int departmentCode;
}
