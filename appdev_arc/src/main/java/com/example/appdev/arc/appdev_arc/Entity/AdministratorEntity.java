package com.example.appdev.arc.appdev_arc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Administrators")
public class AdministratorEntity extends UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminID;

    //Getter and Setters
    public int getAdminId() { return adminID; }
    //public void setAdminId(Integer adminId) {this.admin_id = adminId; }
}
