package com.monitor.usecase;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;

public class AllocateFaculty {
	
	public static void main(String[] args) {
		
		AdminDao dao = new AdminDaoImpl();
		try {
			dao.allocateFaculty();
		} catch (AdminExceptions e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
