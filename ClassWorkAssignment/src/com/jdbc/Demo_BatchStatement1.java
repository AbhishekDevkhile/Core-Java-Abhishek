package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Demo_BatchStatement1
{

	public static void main(String[] args) 
	{
		
		try
		{
			Connection con =DDBConnect.getConnection();
			Statement st=con.createStatement();
			st.addBatch("insert into employees(employee_id,first_name,last_name)values(225,'pooja','kale')");
			
			st.addBatch("Delete from employees where first_name='p'");
			st.addBatch("Delete from employees where last_name='s'");
			
			int c[]=st.executeBatch();
			
			System.out.println("Successfully work");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
