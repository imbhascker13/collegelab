package com.mindtree.collegebranchmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collegeId;

	@Column(unique = true)
	private String collegeName;

	private String collegeLocation;
	private int numberOfBranch;

	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "collegeId")
	private List<Branch> branches;

	public College(int collegeId, String collegeName, String collegeLocation, int numberOfBranch,
			List<Branch> branches) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
		this.numberOfBranch = numberOfBranch;
		this.branches = branches;
	}

	public College() {
		super();
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeLocation() {
		return collegeLocation;
	}

	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}

	public int getNumberOfBranch() {
		return numberOfBranch;
	}

	public void setNumberOfBranch(int numberOfBranch) {
		this.numberOfBranch = numberOfBranch;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeLocation="
				+ collegeLocation + ", numberOfBranch=" + numberOfBranch + ", branches=" + branches + "]";
	}

}
