package com.example.appdev.arc.appdev_arc.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "program_courses")
@Data
public class ProgramCoursesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int programCourseId;

//    @Column(name = "program_id")
    @ManyToOne
    @JoinColumn(name = "program_id", referencedColumnName = "programID")
    @JsonBackReference("program-programCourses")
    private ProgramEntity program; // TODO: replace with @ManyToOne Program program

//    @Column(name = "course_id")
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    @JsonBackReference("course-programCourses")
    private CourseEntity course; // TODO: replace with @ManyToOne Course course

    private int units;
    private int semesterOffered;
    private int yearLevel;
}
