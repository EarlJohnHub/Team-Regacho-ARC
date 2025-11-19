package com.appdevf1.team_regotchu.entity;

// Inside your UserEntity or DTO
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message = "Email is required and cannot be empty.")
    @Email(message = "Email should be a valid email address.")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Password is required and cannot be empty.")
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
