package com.appdevf1.team_regotchu.entity;

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
