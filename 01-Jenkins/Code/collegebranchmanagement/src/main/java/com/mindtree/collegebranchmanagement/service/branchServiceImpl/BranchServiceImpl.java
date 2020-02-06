package com.mindtree.collegebranchmanagement.service.branchServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegebranchmanagement.entity.Branch;
import com.mindtree.collegebranchmanagement.entity.College;
import com.mindtree.collegebranchmanagement.exception.CollegeBranchApplicationException;
import com.mindtree.collegebranchmanagement.repository.BranchRepository;
import com.mindtree.collegebranchmanagement.repository.CollegeRepository;
import com.mindtree.collegebranchmanagement.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	CollegeRepository collegeRepository;
	@Autowired
	BranchRepository branchRepository;

	@Override
	public void addBranches(int collegeId, Branch branch) throws CollegeBranchApplicationException {
		// TODO Auto-generated method stub
		College college = collegeRepository.getOne(collegeId);
		college.getBranches().add(branch);
		if (college.getBranches().size() <= college.getNumberOfBranch()) {
			collegeRepository.saveAndFlush(college);
		} else {
			throw new CollegeBranchApplicationException("Branch Limit Reached For This College:");
		}

	}

	@Override
	public List<Branch> getBranchByCollege(int collegeId) {
		// TODO Auto-generated method stub
		College college = collegeRepository.getOne(collegeId);
		return college.getBranches();
	}

	@Override
	public Branch getBranchById(int branchId) {
		// TODO Auto-generated method stub
		return branchRepository.getOne(branchId);
	}

	@Override
	public void updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		// branch.setBranchId(branchId);
		branchRepository.saveAndFlush(branch);

	}

}
