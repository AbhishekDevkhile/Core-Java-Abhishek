package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Demo_ExecuteQuery1 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);
				Connection con =DDBConnect.getConnection();
				Statement st=con.createStatement())
		{
			System.out.println("Enter query");
			String q=sc.nextLine();
			boolean b=st.execute(q);                  //q=query
			System.out.println(b);                    //if b=true or false
			
			
			if(b==true)
			{
				//se
				ResultSet rs=st.getResultSet();
				ResultSetMetaData rsmd=rs.getMetaData();
				int noOfcols=rsmd.getColumnCount();
				
				while(rs.next())
				{
					for(int i=1;i<=noOfcols;i++)
					{
						System.out.print(rs.getString(i)+"  ");
					}
					System.out.println();
				}
				
			}
			else
			{
				int count=st.getUpdateCount();                    //insert,
				System.out.println("Records affected"+count);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
