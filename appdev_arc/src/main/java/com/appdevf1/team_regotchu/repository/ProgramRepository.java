package com.appdevf1.team_regotchu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdevf1.team_regotchu.entity.ProgramEntity;


@Repository
public interface ProgramRepository extends JpaRepository<ProgramEntity, Integer> {

}
