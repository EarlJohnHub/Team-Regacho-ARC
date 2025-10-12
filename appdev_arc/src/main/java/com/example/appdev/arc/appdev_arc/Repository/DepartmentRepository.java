package com.example.appdev.arc.appdev_arc.Repository;

import com.example.appdev.arc.appdev_arc.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
