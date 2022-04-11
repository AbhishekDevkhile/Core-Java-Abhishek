package com.jdbc;
/*Callable statement use in function(name:Max) -sql*/
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Demo_Callable_FunctionProcedure {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in);
				Connection con=DDBConnect.getConnection();
				CallableStatement cst=con.prepareCall("{?=call Max1 (?,?)}");)
			{
				
				cst.setInt(2, 10);
				cst.setInt(3, 20);
				
				cst.registerOutParameter(1, Types.INTEGER);
				
				
		        cst.execute();
		        
		        
		        System.out.println("max number is:"+ cst.getInt(1));
				
			
			}
		catch (SQLException e) 
		    {
				e.printStackTrace();
			}

	}

}
