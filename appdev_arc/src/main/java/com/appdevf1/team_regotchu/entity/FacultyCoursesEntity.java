package com.appdevf1.team_regotchu.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "faculty_courses")
@Data                    
public class FacultyCoursesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facultyCourseId;

//    @Column(name = "faculty_id")
    @ManyToOne
    @JoinColumn(name="faculty_id", referencedColumnName = "userID")
    @JsonBackReference("facultyCourse-faculty")
    private FacultyEntity faculty; // TODO: replace with @ManyToOne Faculty faculty

//    @Column(name = "course_id")
    @ManyToOne
    @JoinColumn(name="course_id", referencedColumnName = "course_id")
    @JsonBackReference("facultyCourse-course")
    private CourseEntity course; // TODO: replace with @ManyToOne Course course

    private int units;
    private int semesterOffered;
    private int yearLevel;
    private String schedule;
}
