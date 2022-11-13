package com.monitor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.monitor.exceptions.FacultyExceptions;
import com.monitor.utility.DBUtil;

public class FacultyDaoImpl implements FacultyDao{

	@Override
	public String loginFaculty() throws FacultyExceptions {
		String massage = "Invalid User name of Password! ...";
		try (Connection conn = DBUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("select facultyName, username, password from faculty");
			ResultSet rs = ps.executeQuery();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Username: ");
			String userid = sc.next();
			System.out.print("Enter Password: ");
			String password = sc.next();
			while(rs.next()) {
				String name = rs.getString("facultyName");
				String user = rs.getString("username");
				String pass = rs.getString("password");
				if(user.equals(userid) && pass.equals(password)) {
					massage = "Signin Succesfull Welcome to MONITOR "+ name;
					break;
				}
			}
		} catch (SQLException e) {
			throw new FacultyExceptions("Invalid User name of Password! ...");
		}
		return massage;
	}

	@Override
	public String updatePassword() throws FacultyExceptions {
		String massage = "Unable to Update Password";
		try (Connection conn = DBUtil.getConnection()){
			PreparedStatement ps = conn.prepareStatement("update faculty set password = ? where facultyid = ?");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Faculty id: ");
			int id = sc.nextInt();
			System.out.print("Enter Password: ");
			String password = sc.next();
			ps.setString(1, password);
			ps.setInt(2, id);
			
			int x = ps.executeUpdate();
			if(x>0) {
				massage = "Your Password Updated Succesfully ! ...";
			}
		} catch (SQLException e) {
			throw new FacultyExceptions("Unable to Update Password");
		}
		return massage;
	}
	
	

}
