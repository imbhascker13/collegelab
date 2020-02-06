package com.mindtree.collegebranchmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegebranchmanagement.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}
