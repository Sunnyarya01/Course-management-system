package com.monitor.usecase;

import java.util.Scanner;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.CoursePlan;

public class UpdatePlan {
	
	public String planUpdate() {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Plan Id: ");
		int pid = sc.nextInt();
		System.out.println("Enter Batch Id: ");
		int bid = sc.nextInt();
		System.out.println("Enter DayNumber: ");
		int dan = sc.nextInt();
		System.out.println("Enter Topic: ");
		sc.nextLine();
		String topic = sc.nextLine();
		System.out.println("Enter Status: ");
		boolean st = sc.nextBoolean();
		
		AdminDao dao = new AdminDaoImpl();
		CoursePlan p = new CoursePlan(pid, bid, dan, topic, st);
		String res = null;
		try {
			res = dao.updatePlan(p);
		} catch (AdminExceptions e) {
			System.out.println(e.getMessage());
		}
		return res;
		
	}

}
