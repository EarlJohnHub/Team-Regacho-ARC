package com.example.appdev.arc.appdev_arc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.appdev.arc.appdev_arc.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
