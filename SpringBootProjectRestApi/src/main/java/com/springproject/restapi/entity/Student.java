package com.springproject.restapi.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int RollNo;
	
	@Column
	private String fname;
	
	@Column
	private String lname;
	
	@Column
	private String branch;
	
	@Column
	private float percentage;
	

	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String fname, String lname, String branch, float percentage) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.branch = branch;
		this.percentage = percentage;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fnam) {
		fname = fnam;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lnam) {
		lname = lnam;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Fname=" + fname + ", Lname=" + lname + ", branch=" + branch
				+ ", percentage=" + percentage + "]";
	}
	
	
}
