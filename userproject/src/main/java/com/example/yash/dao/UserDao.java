package com.example.yash.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class UserDao {
	
	public static Connection getDatabaseConnection() {
		Connection con = null;
		Properties properties = new Properties();
		
		try {
			
			FileReader reader = new FileReader("c://yashwanth/db.properties");
			properties.load(reader);
			Class.forName(properties.getProperty("database.driver"));
			String url = properties.getProperty("database.url");
			String uid= properties.getProperty("database.username");
			String pwd=properties.getProperty("database.password");
			con = DriverManager.getConnection(url,uid,pwd);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}


}
