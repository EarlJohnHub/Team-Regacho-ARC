package com.example.appdev.arc.appdev_arc.Service;

import com.example.appdev.arc.appdev_arc.Entity.College;
import com.example.appdev.arc.appdev_arc.Repository.CollegeRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CollegeService {

    private final CollegeRepository collegeRepository;

    public College saveCollege(College college) {return collegeRepository.save(college);}

    public List<College> getAllColleges() {return collegeRepository.findAll();}

    public Optional<College> findById(int id) {return collegeRepository.findById(id);}

    public void deleteCollege(int id) {collegeRepository.deleteById(id);}
}
