package com.mindtree.collegebranchmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.collegebranchmanagement.entity.College;

@Service
public interface CollegeService {
	public void addCollege(College college);
	public List<College> getColleges();

}
