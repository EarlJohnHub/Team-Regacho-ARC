package com.example.appdev.arc.appdev_arc.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "program_courses")
@Data
public class ProgramCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int programCourseId;

    @Column(name = "program_id")
    private int programId; // TODO: replace with @ManyToOne Program program

    @Column(name = "course_id")
    private int courseId; // TODO: replace with @ManyToOne Course course

    private int units;
    private int semesterOffered;
    private int yearLevel;
}
