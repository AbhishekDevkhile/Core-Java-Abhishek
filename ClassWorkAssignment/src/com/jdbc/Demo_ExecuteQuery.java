package com.jdbc;
/*Execute method*/
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo_ExecuteQuery {

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in);
				Connection con =DDBConnect.getConnection();
				Statement st=con.createStatement())
		{
			System.out.println("Enter query");
			String q=sc.nextLine();
			boolean b=st.execute(q);
			System.out.println(b);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
