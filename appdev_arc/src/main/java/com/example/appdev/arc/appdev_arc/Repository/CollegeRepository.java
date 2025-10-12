package com.example.appdev.arc.appdev_arc.Repository;

import com.example.appdev.arc.appdev_arc.Entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {
}
