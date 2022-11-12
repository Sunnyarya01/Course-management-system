package com.monitor.usecase;

import java.util.Scanner;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.Course;

public class UpdateCourse {
	
	public String courseUpadate() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Course Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Fee: ");
		int fee = sc.nextInt();
		System.out.println("Enter Course Description: ");
		sc.nextLine();
		String cd = sc.nextLine();
		System.out.println("Enter Course Id: ");
		int id = sc.nextInt();
	
		Course c = new Course(id, name, fee, cd);
		AdminDao dao = new AdminDaoImpl();
		String res = null;
		try {
			res = dao.updateCourse(c);
		} catch (AdminExceptions e) {
			System.out.println(e.getMessage());
		}
		return res;
		
	}

}
