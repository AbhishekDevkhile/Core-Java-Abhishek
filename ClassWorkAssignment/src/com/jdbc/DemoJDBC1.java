package com.jdbc;
/*Demo*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DemoJDBC1 
{
	
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");                                                        //load the drivers
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");                //establish connection
			System.out.println("Connection Establish Successfully");
			
		    st=con.createStatement();
			rs=st.executeQuery("select employee_id,first_name from employees");                               //fire sql query
			
			while(rs.next())                                                                                  //display purpose
			{
				 System.out.println(rs.getInt("employee_id")+"  "+rs.getString("first_name"));
			}
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally                                                                                           //close all open sources
		{
			try {
				if(rs!=null)
				rs.close();
				
				if(st!=null)
					st.close();
				
				if(con!=null)
					con.close();
				
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}
