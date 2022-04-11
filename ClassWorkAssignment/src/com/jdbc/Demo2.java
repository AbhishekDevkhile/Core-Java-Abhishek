package com.jdbc;
/*Input from User */
/*Using statement interface*/


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);
				Connection con=DDBConnect.getConnection();
				Statement st=con.createStatement())
				
		{
			for(int j=0;j<=2;j++)
			{
				System.out.println("Enter Emp_id And Emp_last_name:");
				int i=sc.nextInt();
				String nm=sc.next();
				String query="insert into employees(employee_id,last_name) values("+i+",'"+nm+"')";			
				
				System.out.println(query);
				int c=st.executeUpdate(query);
				System.out.println("Record inserted ");
			}
			
			
		}
			
		 catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
