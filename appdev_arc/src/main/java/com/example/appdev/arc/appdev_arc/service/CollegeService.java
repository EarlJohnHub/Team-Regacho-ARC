package com.example.appdev.arc.appdev_arc.service;

import com.example.appdev.arc.appdev_arc.entity.CollegeEntity;
import com.example.appdev.arc.appdev_arc.repository.CollegeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CollegeService {

    private final CollegeRepository collegeRepository;

    public CollegeEntity saveCollege(CollegeEntity college) {return collegeRepository.save(college);}

    public List<CollegeEntity> getAllColleges() {return collegeRepository.findAll();}

    public Optional<CollegeEntity> findById(int id) {return collegeRepository.findById(id);}

    public void deleteCollege(int id) {collegeRepository.deleteById(id);}
}
