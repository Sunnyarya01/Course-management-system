package com.monitor.model;

import java.sql.Date;

public class Batch {
	
	private int batchid;
	private int courseid;
	private int facultyid;
	private int numberOfStudents;
	private Date date;
	private int duration;
	
	public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(int batchid, int courseid, int facultyid, int numberOfStudents, Date date, int duration) {
		super();
		this.batchid = batchid;
		this.courseid = courseid;
		this.facultyid = facultyid;
		this.numberOfStudents = numberOfStudents;
		this.date = date;
		this.duration = duration;
	}

	public int getBatchid() {
		return batchid;
	}

	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public int getFacultyid() {
		return facultyid;
	}

	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Batch [batchid=" + batchid + ", courseid=" + courseid + ", facultyid=" + facultyid
				+ ", numberOfStudents=" + numberOfStudents + ", date=" + date + ", duration=" + duration + "]";
	}

}
