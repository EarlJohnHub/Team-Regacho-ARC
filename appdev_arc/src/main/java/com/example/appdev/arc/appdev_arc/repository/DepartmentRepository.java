package com.example.appdev.arc.appdev_arc.repository;

import com.example.appdev.arc.appdev_arc.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {
    
}
