package com.monitor.usecase;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose Option: ");
		System.out.println("Type Admin for Admin and Faculty for Faculty...");
		System.out.print("Type Here :  ");
		String s = sc.next();
		if(s.equals("Admin")) {
			System.out.println("Welcome to Admin Pannel !...");
			AdminLogin admin = new AdminLogin();
			String check = admin.loginAdmin();
			System.out.println(check);
			if(check.equals("Sign in Succesfull !..")) {
				CreateCourse cc = new CreateCourse();
				String courseCreated = cc.courseCreate();
				System.out.println(courseCreated);
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
