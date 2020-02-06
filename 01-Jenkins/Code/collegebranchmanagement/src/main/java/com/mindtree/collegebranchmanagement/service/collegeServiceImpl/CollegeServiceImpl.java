package com.mindtree.collegebranchmanagement.service.collegeServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegebranchmanagement.entity.College;
import com.mindtree.collegebranchmanagement.repository.CollegeRepository;
import com.mindtree.collegebranchmanagement.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public void addCollege(College college) {
		collegeRepository.save(college);

	}

	@Override
	public List<College> getColleges() {
		return collegeRepository.findAll();
	}

}
