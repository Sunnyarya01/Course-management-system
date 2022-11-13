package com.monitor.usecase;

import java.sql.Date;
import java.util.Scanner;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.Batch;

public class UpdateBatch {
	
	public String batchUpdate() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Batch Id: ");
			int bid = sc.nextInt();
			System.out.println("Enter Course Id: ");
			int cid = sc.nextInt();
			System.out.println("Enter Faculty Id: ");
			int fid = sc.nextInt();
			System.out.println("Enter No. of Students: ");
			int nos = sc.nextInt();
			System.out.println("Enter Course Start Date: ");
			Date date = Date.valueOf(sc.next());
			System.out.println("Enter Batch Duration: ");
			int duration = sc.nextInt();
			
			AdminDao dao = new AdminDaoImpl();
			Batch b = new Batch(bid, cid, fid, nos, date, duration);
			String res = null;
			try {
				res = dao.updateBatch(b);
			} catch (AdminExceptions e) {
				System.out.println(e.getMessage());
			}
			return res;
		
		
	}

}
