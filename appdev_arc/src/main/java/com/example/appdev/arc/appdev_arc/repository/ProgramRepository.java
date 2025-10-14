package com.example.appdev.arc.appdev_arc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.appdev.arc.appdev_arc.entity.ProgramEntity;


@Repository
public interface ProgramRepository extends JpaRepository<ProgramEntity, Integer> {

}
