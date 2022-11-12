package com.monitor.usecase;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;

public class AdminLogin {
	
	public String loginAdmin() {
		String res = "";
		AdminDao dao = new AdminDaoImpl();
		try {
			res = dao.loginAdmin();
		} catch (AdminExceptions e) {
			System.out.println(e.getMessage());
		}
		return res;		
	}

}
