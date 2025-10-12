package com.example.appdev.arc.appdev_arc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appdev.arc.appdev_arc.entity.FacultyCourses;

public interface FacultyCoursesRepository extends JpaRepository<FacultyCourses, Integer> {
}