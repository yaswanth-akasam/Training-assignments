package com.example.yash.service;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.yash.dao.UserDao;
import com.example.yash.model.User;

public class UserServiceImpl implements UserService{

	@Override
	public boolean validateUser(User user) {
		
		
		Statement st = null;
		Connection con = null;
		ResultSet rs = null;
	    boolean isFound=false;
		System.out.println(user.getUsername()+" "+user.getPassword());
		try {
			con = UserDao.getDatabaseConnection();
			st= con.createStatement();
			rs = st.executeQuery("select * from users");
			while (rs.next()) {
				if (rs.getString(1).equals(user.getUsername()) && rs.getString(2).equals(user.getPassword())) {
					isFound = true;
					System.out.println(rs.getString(1)+" "+rs.getString(2));
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(isFound);
		return isFound;
	}

	@Override
	public boolean registerUser(User user) {
		
		Connection con = null;
		PreparedStatement pst = null;
		int rs = 0;
		
		String query = "insert into users values (?,?)";
		try {
			con = UserDao.getDatabaseConnection();
			pst = con.prepareStatement(query);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			rs = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rs == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
