package com.example.appdev.arc.appdev_arc.repository;

import com.example.appdev.arc.appdev_arc.entity.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeEntity, Integer> {
}
