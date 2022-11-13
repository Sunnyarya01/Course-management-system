package com.monitor.usecase;

import com.monitor.dao.FacultyDao;
import com.monitor.dao.FacultyDaoImpl;
import com.monitor.exceptions.FacultyExceptions;

public class UpdatePassword {
	
	public static void main(String[] args) {
		
		FacultyDao dao = new FacultyDaoImpl();
		try {
			String res = dao.updatePassword();
			System.out.println(res);
		} catch (FacultyExceptions e) {
			System.out.println(e.getMessage());
		}
		
	}

}
