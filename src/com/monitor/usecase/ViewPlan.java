package com.monitor.usecase;

import java.util.List;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.CoursePlan;

public class ViewPlan {
	
	public void planView() {
		
		System.out.println();
		AdminDao dao = new AdminDaoImpl();
		try {
			List<CoursePlan> plan = dao.viewPlan();
			plan.forEach(p -> System.out.println(p));
		} catch (AdminExceptions e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
	}

}
