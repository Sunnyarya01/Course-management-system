package com.monitor.dao;

import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.Course;

public interface AdminDao {
	
	public String loginAdmin()throws AdminExceptions;
	public String createCourse(Course c)throws AdminExceptions;
	public String updateCourse(Course c)throws AdminExceptions;
}
