package com.example.appdev.arc.appdev_arc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Administrators")
public class Administrator extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer admin_id;

    //Getter and Setters
    public Integer getAdminId() { return admin_id; }
    public void setAdminId(Integer adminId) {this.admin_id = adminId; }
}
