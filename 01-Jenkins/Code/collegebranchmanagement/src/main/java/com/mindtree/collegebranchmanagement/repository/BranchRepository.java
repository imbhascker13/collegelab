package com.mindtree.collegebranchmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegebranchmanagement.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{

}
