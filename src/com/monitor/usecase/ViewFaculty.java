package com.monitor.usecase;

import java.util.List;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.Faculty;

public class ViewFaculty {
	
	public void facultyView() {
		
		System.out.println();
		AdminDao dao = new AdminDaoImpl();
		try {
			List<Faculty> faculty = dao.viewFaculty();
			faculty.forEach(f -> System.out.println(f));
		} catch (AdminExceptions e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
	}

}
