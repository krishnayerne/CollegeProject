package com.sit.collegemanagement.model;

public class Batch {
	
	private int bid;
	private String bname;
	private String faculty;
	
	public Batch(int bid,String bname,String faculty) {
		
		this.bid = bid;
		this.bname = bname;
		this.faculty = faculty;
	}
	
	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + ", faculty=" + faculty + "]";
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	

}
