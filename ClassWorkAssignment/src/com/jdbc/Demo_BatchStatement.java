package com.jdbc;
/*ExecuteBatch method */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo_BatchStatement {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in);
			Connection con =DDBConnect.getConnection();
			PreparedStatement pst=
			con.prepareStatement("insert into employees(employee_id,first_name,last_name)values(?,?,?)"))
		{
			for(int i=0;i<3;i++)
			{
					System.out.println("Enter employee_id,first_name,last_name");
					int id=sc.nextInt();
					String fnm=sc.next();
					String lnm=sc.next();
							
					pst.setInt(1, id);
					pst.setString(2, fnm);
					pst.setString(3, lnm);
					pst.addBatch();
			}
					int c[]=pst.executeBatch();
				//	System.out.println("Record inserted successfully");
							
				
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}	
		

	}

}
