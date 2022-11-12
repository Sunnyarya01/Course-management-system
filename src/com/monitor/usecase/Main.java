package com.monitor.usecase;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============> Welcome to MONITOR <=============");
		System.out.println("Type Admin for Admin and Faculty for Faculty...");
		System.out.print("Type Here: ");
		String s = sc.next();
		if(s.equals("Admin")) {
			System.out.println("Welcome to Admin Pannel !...");
			AdminLogin admin = new AdminLogin();
			String check = admin.loginAdmin();
			System.out.println(check);
			if(check.equals("Sign in Succesfull !..")) {
				System.out.print("Type 1 for Course: ");
				int type = sc.nextInt();
				if(type==1) {
					System.out.print("Press 1 for Create new Course, 2 for Update Course and 3 for View Course: ");
					int press = sc.nextInt();
					if(press==1) {
						CreateCourse cc = new CreateCourse();
						String courseCreated = cc.courseCreate();
						System.out.println(courseCreated);
					}else if(press == 2) {
						UpdateCourse uc = new UpdateCourse();
						String courseUpdated = uc.courseUpadate();
						System.out.println(courseUpdated);
					}else if(press == 3) {
						ViewCourse vc = new ViewCourse();
						vc.courseView();
					}else {
						System.out.println("Please enter a valid keyword...");
					}
				}
			}
			System.out.println("Thank you for using MONITOR!..");
		}else if(s.equals("Faculty")) {
			System.out.println("Welcome to Faculty Pannel !...");
			System.out.print("Enter Username: ");
			String userid = sc.next(); 
			System.out.println("Enter Password: ");
			String password = sc.next();
		}else {
			System.out.println("Please Enter a Valid keyword !.......");
		}
		
	}

}
