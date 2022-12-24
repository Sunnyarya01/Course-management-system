package com.monitor.dao;

import com.monitor.exceptions.FacultyExceptions;

public interface FacultyDao {
	
	public String loginFaculty()throws FacultyExceptions;
	public String updatePassword()throws FacultyExceptions;

}
