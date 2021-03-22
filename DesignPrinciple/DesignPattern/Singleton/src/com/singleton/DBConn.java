package com.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	private static DBConn instance;
	private static Connection connection;
	
	private DBConn() {
		
	}
	
	public static DBConn getInstance() {
		if(instance==null){
	        instance= new DBConn();
	    }
	    return instance;
	}
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded");
			
			String url = "jdbc:mysql://localhost:3306/classicmodels";
			String username = "root";
			String password = "MySQL98$";
			connection = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	
}
