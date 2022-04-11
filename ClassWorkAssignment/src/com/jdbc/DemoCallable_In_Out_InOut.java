package com.jdbc;
/*Callable  function - use in stored procedure (name:addtion)*/
import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;



public class DemoCallable_In_Out_InOut {

	public static void main(String[] args) {

		try(Scanner sc= new Scanner(System.in);
				Connection con=DDBConnect.getConnection();	)
			{
				CallableStatement cst=con.prepareCall("{call addtion (?,?,?,?,?)}");
				cst.setInt(1, 10);
				cst.setInt(2, 20);
				cst.setInt(4, 30);
				cst.registerOutParameter(3, Types.INTEGER);
				cst.registerOutParameter(4, Types.INTEGER);
				cst.registerOutParameter(5, Types.VARCHAR);
				
				
		        cst.execute();
		        
		        System.out.println(cst.getInt(3));
		        System.out.println(cst.getInt(4));
		        System.out.println(cst.getString(5));
				
			
			}
		catch (SQLException e) 
		    {
				e.printStackTrace();
			}

	}

}
