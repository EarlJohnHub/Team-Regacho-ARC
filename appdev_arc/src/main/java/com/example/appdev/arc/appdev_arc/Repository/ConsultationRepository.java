package com.example.appdev.arc.appdev_arc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.appdev.arc.appdev_arc.Entity.ConsultationEntity;

public interface ConsultationRepository extends JpaRepository<ConsultationEntity, Integer> {

}
