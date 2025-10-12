package com.example.appdev.arc.appdev_arc.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "faculty_courses")
@Data                    
public class FacultyCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facultyCourseId;

    @Column(name = "faculty_id")
    private int facultyId; // TODO: replace with @ManyToOne Faculty faculty

    @Column(name = "course_id")
    private int courseId; // TODO: replace with @ManyToOne Course course

    private int units;
    private int semesterOffered;
    private int yearLevel;
    private String schedule;
}
