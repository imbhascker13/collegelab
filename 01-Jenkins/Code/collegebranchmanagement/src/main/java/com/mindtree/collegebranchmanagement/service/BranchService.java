package com.mindtree.collegebranchmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.collegebranchmanagement.entity.Branch;
import com.mindtree.collegebranchmanagement.exception.CollegeBranchApplicationException;

@Service
public interface BranchService {
	public void addBranches(int collegeId, Branch branch) throws CollegeBranchApplicationException;

	public List<Branch> getBranchByCollege(int collegeId);

  	public Branch getBranchById(int branchId);

  	public void updateBranch(Branch branch);

}
