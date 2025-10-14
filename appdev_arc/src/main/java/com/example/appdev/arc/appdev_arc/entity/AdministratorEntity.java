package com.example.appdev.arc.appdev_arc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Administrators")
public class AdministratorEntity extends UserEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int adminID;

    //Getter and Setters
    public int getAdminId() { return super.getUserID(); }
//    public void setAdminId(Integer adminId) {this.adminID = adminId; }
}
