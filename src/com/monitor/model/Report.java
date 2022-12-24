package com.monitor.model;

public class Report {
	
	private int batchid;
	private int facultyid;
	private String facultyname;
	private int numberOfStudents;
	private int courseid;
	private String coursename;
	private int fee;
	
	public Report() {
		// TODO Auto-generated constructor stub
	}

	public Report(int batchid, int facultyid, String facultyname, int numberOfStudents, int courseid, String coursename,
			int fee) {
		super();
		this.batchid = batchid;
		this.facultyid = facultyid;
		this.facultyname = facultyname;
		this.numberOfStudents = numberOfStudents;
		this.courseid = courseid;
		this.coursename = coursename;
		this.fee = fee;
	}

	public int getBatchid() {
		return batchid;
	}

	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}

	public int getFacultyid() {
		return facultyid;
	}

	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}

	public String getFacultyname() {
		return facultyname;
	}

	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Report [batchid=" + batchid + ", facultyid=" + facultyid + ", facultyname=" + facultyname
				+ ", numberOfStudents=" + numberOfStudents + ", courseid=" + courseid + ", coursename=" + coursename
				+ ", fee=" + fee + "]";
	}

}
