package com.monitor.usecase;

import com.monitor.dao.FacultyDao;
import com.monitor.dao.FacultyDaoImpl;
import com.monitor.exceptions.FacultyExceptions;

public class LoginFaculty {
	
	public boolean facultyLogin() {
		
		boolean c = false;
		FacultyDao dao = new FacultyDaoImpl();
		try {
			String res = dao.loginFaculty();
			System.out.println(res);
			c = true;
		} catch (FacultyExceptions e) {
			System.out.println(e.getMessage());
		}
		return c;
		
	}

}
