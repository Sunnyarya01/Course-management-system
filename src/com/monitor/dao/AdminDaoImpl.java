package com.monitor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
		String massage = "Course can't be Updated Please try again..";
				
		try(Connection conn = DBUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("update course set courseName = ?, fee = ?, courseDescription = ? where courseid = ?");
			ps.setString(1, c.getCoursename());
			ps.setInt(2, c.getFee());
			ps.setString(3, c.getCourseDescription());
			ps.setInt(4, c.getCourseid());
			
			int x = ps.executeUpdate();
			if(x>0) {
				massage = "Course Updated Succesfully !...";
			}
		} catch (SQLException e) {
			throw new AdminExceptions("Course can't be Updated Please try again..");
		}
		return massage;
	}

	@Override
	public List<Course> viewCourse() throws AdminExceptions {
		List<Course> course = new ArrayList<>();
		try (Connection conn = DBUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from course");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("courseid");
				String name = rs.getString("courseName");
				int fee = rs.getInt("fee");
				String cd = rs.getString("courseDescription");
				
				course.add(new Course(id, name, fee, cd));
			}
		} catch (SQLException e) {
			throw new AdminExceptions("You can't see the course Please try again..");
		}
		return course;
	}

}
