package com.test;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Connect {
	
	Connection conn = null;
	
	public Connection getConnection(){
		return getConnection("myURL");
	}
	public Connection getConnection(String URL){
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public void closeConnection(Connection conn) throws SQLException{
		if( conn!= null){
			conn.close();
		}
	}
}
