package com.jdbc;
/*Try with resources */
/*Using statement interface*/

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo1
{

	public static void main(String[] args) 
	{
		try(Connection con=DDBConnect.getConnection();Statement st=con.createStatement())                              //Try with resources(in round bracket)
		{
		//	String query="insert into employees(employee_id,first_name,last_name) values(207,'Abhishek','Devkhile')";
			String query="update employees set first_name='Chaitanya' where employee_id= 207";
			int count=st.executeUpdate(query);                                                                         //in count fu. display inserted record update count 
			System.out.println("Record inserted successfully "+"  "+count);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}
