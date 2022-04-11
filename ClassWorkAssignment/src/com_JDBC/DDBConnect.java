package com_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DDBConnect {
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/hr";
	public static final String USER_NAME="root";
	public static final String PASSWORD="root";
	
	
	public static Connection getConnection()
	{
		Connection con = null;
		
		try 
		{
			con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return con;
		
		
	}
					

}
