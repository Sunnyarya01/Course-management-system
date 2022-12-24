package com.monitor.usecase;

import java.util.Scanner;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.Course;

public class CreateCourse {
	
	public String courseCreate() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Course Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Course Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter Fee: ");
		int fee = sc.nextInt();
		System.out.println("Enter Course Descreption: ");
		sc.nextLine();
		String cd = sc.nextLine();
		
		Course c = new Course(id, name, fee, cd);
		AdminDao dao = new AdminDaoImpl();
		String res = null;
		try {
			res = dao.createCourse(c);
		} catch (AdminExceptions e) {
			System.out.println(e.getMessage());
		}
		return res;
		
	}

}
