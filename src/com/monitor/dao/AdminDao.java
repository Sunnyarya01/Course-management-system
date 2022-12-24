package com.monitor.dao;

import java.util.List;

import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.Batch;
import com.monitor.model.Course;
import com.monitor.model.CoursePlan;
import com.monitor.model.Faculty;

public interface AdminDao {
	
	// Login Admin
	public String loginAdmin()throws AdminExceptions;
	// Course
	public String createCourse(Course c)throws AdminExceptions;
	public String updateCourse(Course c)throws AdminExceptions;
	public List<Course> viewCourse()throws AdminExceptions;
	// Batch
	public String createBatch(Batch b)throws AdminExceptions;
	public String updateBatch(Batch b)throws AdminExceptions;
	public List<Batch> viewBatch()throws AdminExceptions;
	// Faculty
	public String createFaculty(Faculty f)throws AdminExceptions;
	public String updateFaculty(Faculty f)throws AdminExceptions;
	public List<Faculty> viewFaculty()throws AdminExceptions;
	// Course Plan
	public String createPlan(CoursePlan p)throws AdminExceptions;
	public String updatePlan(CoursePlan p)throws AdminExceptions;
	public List<CoursePlan> viewPlan()throws AdminExceptions;
	// Allocate Faculty
	public void allocateFaculty()throws AdminExceptions;
	// Batch Wise Report
	public void reportBatch()throws AdminExceptions;
}
