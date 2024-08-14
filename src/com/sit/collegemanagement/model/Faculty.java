package com.sit.collegemanagement.model;

public class Faculty {
	
	private int fid;
	private String fname;
	private String course;
	
	public Faculty(int fid,String fname,String course) {
		
		this.fid = fid;
		this.fname = fname;
		this.course = course;
		
	}
	
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", course=" + course + "]";
	}
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
