package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoPreparedStatementDelete {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in);
			Connection con=DDBConnect.getConnection();
			PreparedStatement pst=
				con.prepareStatement("DELETE FROM employees WHERE first_name = ?")	)
		{
			System.out.println("Enter first_name");
			String nm=sc.next();
			
			
			pst.setString(1, nm);
			
			
			int c=pst.executeUpdate();
			System.out.println("Record inserted successfully" +c);
			
		
		}
	catch (SQLException e) 
	    {
			e.printStackTrace();
		}

  }
}


