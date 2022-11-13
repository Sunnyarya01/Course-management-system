package com.monitor.usecase;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;

public class ReportBatch {
	
	public static void main(String[] args) {
		
		AdminDao dao = new AdminDaoImpl();
		try {
			dao.reportBatch();
		} catch (AdminExceptions e) {
			System.out.println(e.getMessage());
		}
		
	}

}
