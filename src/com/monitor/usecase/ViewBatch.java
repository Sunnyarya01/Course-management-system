package com.monitor.usecase;

import java.util.List;

import com.monitor.dao.AdminDao;
import com.monitor.dao.AdminDaoImpl;
import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.Batch;

public class ViewBatch {
	
	public void batchView() {
		
		System.out.println();
		AdminDao dao = new AdminDaoImpl();
		try {
			List<Batch> batch = dao.viewBatch();
			batch.forEach(b -> System.out.println(b));
		} catch (AdminExceptions e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
	}

}
