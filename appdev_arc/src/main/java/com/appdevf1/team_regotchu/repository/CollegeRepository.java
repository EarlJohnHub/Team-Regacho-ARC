package com.appdevf1.team_regotchu.repository;

import com.appdevf1.team_regotchu.entity.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeEntity, Integer> {
}
