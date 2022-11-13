package com.monitor.usecase;

import java.util.Scanner;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.dao.FacultyDao;
import com.monitor.dao.FacultyDaoImpl;
import com.monitor.exceptions.AdminExceptions;
import com.monitor.exceptions.FacultyExceptions;

public class Main {
	
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		
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
				System.out.print("Type 1 for Course, 2 for Batch, 3 for Faculty, 4 for Course Plan, 5 for Allocated Teacher and 6 for Generate Batch Reoprt: ");
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
				}else if(type == 2) {
					System.out.print("Press 1 for Create new Batch, 2 for Update Batch and 3 for View Batch: ");
					int press = sc.nextInt();
					if(press==1) {
						CreateBatch cb = new CreateBatch();
						String batchCreated = cb.batchCreate();
						System.out.println(batchCreated);
					}else if(press == 2) {
						UpdateBatch ub = new UpdateBatch();
						String res = ub.batchUpdate();
						System.out.println(res);
					}else if(press == 3) {
						ViewBatch vb = new ViewBatch();
						vb.batchView();
					}else {
						System.out.println("Please enter a valid keyword...");
					}
				}else if(type == 3) {
					System.out.print("Press 1 for Create new Faculty, 2 for Update Faculty and 3 for View Faculty: ");
					int press = sc.nextInt();
					if(press==1) {
						CreateFaculty cf = new CreateFaculty();
						String facultyCreated = cf.facultyCreate();
						System.out.println(facultyCreated);
					}else if(press == 2) {
						UpdateFaculty uf = new UpdateFaculty();
						String res = uf.facultyUpdate();
						System.out.println(res);
					}else if(press == 3) {
						ViewFaculty vf = new ViewFaculty();
						vf.facultyView();
					}else {
						System.out.println("Please enter a valid keyword...");
					}
				}else if(type == 4) {
					System.out.print("Press 1 for Create new Course Plan, 2 for Update Course Plan and 3 for View Course Plan: ");
					int press = sc.nextInt();
					if(press==1) {
						CreatePlan cp = new CreatePlan();
						String planCreated = cp.planCreate();
						System.out.println(planCreated);
					}else if(press == 2) {
						UpdatePlan up = new UpdatePlan();
						String planUpdated = up.planUpdate();
						System.out.println(planUpdated);
					}else if(press == 3) {
						ViewPlan vp = new ViewPlan();
						vp.planView();
					}else {
						System.out.println("Please enter a valid keyword...");
					}
				}else if(type==5) {
					AdminDao dao = new AdminDaoImpl();
					try {
						dao.allocateFaculty();
					} catch (AdminExceptions e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				}else if(type==6) {
					AdminDao dao = new AdminDaoImpl();
					try {
						dao.reportBatch();
					} catch (AdminExceptions e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				}else {
					System.out.println("Please enter a valid keyword...");
				}
			}
			System.out.println("Thank you for using MONITOR!..");
			}else if(s.equals("Faculty")) {
				System.out.println("Welcome to Faculty Pannel !...");
				LoginFaculty lf = new LoginFaculty();
				boolean res = lf.facultyLogin();
				if(res) {
					System.out.println("Press 1 for View Course Plan and 2 for Update password: ");
					int press = sc.nextInt();
					if(press == 1) {
						ViewPlan vp = new ViewPlan();
						vp.planView();
					}else if(press == 2) {
						FacultyDao dao = new FacultyDaoImpl();
						try {
							String res1 = dao.updatePassword();
							System.out.println(res1);
						} catch (FacultyExceptions e) {
							System.out.println(e.getMessage());
						}
					}else {
						System.out.println("Please Enter a Valid keyword !.......");
					}
				}
			}else {
				System.out.println("Please Enter a Valid keyword !.......");
				run();
			}
		
	}

}
