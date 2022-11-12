package com.monitor.usecase;

import java.util.List;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.Course;

public class ViewCourse {
	
	public void courseView() {
		
		System.out.println();
		AdminDao dao = new AdminDaoImpl();
		try {
			List<Course> course = dao.viewCourse();
			course.forEach(C -> System.out.println(C));
		} catch (AdminExceptions e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
	}

}
