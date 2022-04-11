package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Date_Sql {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);
				Connection con=DDBConnect.getConnection();
				PreparedStatement pst=
				con.prepareStatement("insert into employees(employee_id,first_name,last_name)values(?,?,?)"))
				{
					System.out.println("Enter employee_id,first_name,last_name");
					int id=sc.nextInt();
					String fnm=sc.next();
					String lnm=sc.next();
					
					pst.setInt(1, id);
					pst.setString(2, fnm);
					pst.setString(3, lnm);
					
					int c=pst.executeUpdate();
					System.out.println("Record inserted successfully" +c);
					
				
				}
			catch (SQLException e) 
			    {
					e.printStackTrace();
				}

	}

}
