package com.sit.collegemanagement.model;

public class Student {
	
	private int sid;
	private String sname;
	private String batch;
	
	public Student(int sid,String sname,String batch) {
		
		this.sid = sid;
		this.sname = sname;
		this.batch = batch;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", batch=" + batch + "]";
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	

}
