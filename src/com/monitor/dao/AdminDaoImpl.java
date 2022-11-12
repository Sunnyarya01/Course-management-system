package com.monitor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.monitor.exceptions.AdminExceptions;
import com.monitor.model.Admin;
import com.monitor.model.Course;
import com.monitor.utility.DBUtil;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String loginAdmin() throws AdminExceptions{
		String massage = "Invalid Username or Password";
		try(Connection conn = DBUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from admin");
			ResultSet rs = ps.executeQuery();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Username: ");
			String userid = sc.next();
			System.out.print("Enter Password: ");
			String password = sc.next();
			Admin ad = null;
			while(rs.next()) {
				String user = rs.getString("username");
				String pass = rs.getString("password");
				ad = new Admin(user, pass);
			}
			if(ad.getUsername().equals(userid) && ad.getPassword().equals(password)) {
				massage = "Sign in Succesfull !..";
			}else {
				massage = "Invalid Username of Password";
			}
		} catch (SQLException e) {
			throw new AdminExceptions("Invalid Username or Password");
		}
		return massage;
	}

	public String createCourse(Course c)throws AdminExceptions {
		String massage = "Course can't be Created Please try again..";
		try(Connection conn = DBUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into course values(?, ?, ?, ?)");
			ps.setInt(1, c.getCourseid());
			ps.setString(2, c.getCoursename());
			ps.setInt(3, c.getFee());
			ps.setString(4, c.getCourseDescription());
			
			int x = ps.executeUpdate();
			if(x>0) {
				massage = "Course Added Succesfully !...";
			}
		} catch (SQLException e) {
			throw new AdminExceptions("Course can't be Created Please try again..");
		}
		return massage;
	}
	
	public String updateCourse(Course c)throws AdminExceptions {
		String massage = "Course can't be Created Please try again..";
		try(Connection conn = DBUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("update into course values(?, ?, ?, ?)");
			ps.setInt(1, c.getCourseid());
			ps.setString(2, c.getCoursename());
			ps.setInt(3, c.getFee());
			ps.setString(4, c.getCourseDescription());
			
			int x = ps.executeUpdate();
			if(x>0) {
				massage = "Course Added Succesfully !...";
			}
		} catch (SQLException e) {
			throw new AdminExceptions("Course can't be Created Please try again..");
		}
		return massage;
	}

}
