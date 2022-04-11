package com.jdbc;
//resultset through insert value into table abhd Delete value in record
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultset_Types_insert_update_delete_InTable {

	public static void main(String[] args) {
	
		try(Connection con=DDBConnect.getConnection();
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE)	)
		
		{
			ResultSet rs=st.executeQuery("select * from employees ");          //ResultSet
			
			
			rs.next();                                           //display last record
			rs.absolute(3);                                      //display specific record
			rs.updateString(11, "Chaitanya");                   //display after two next record
			rs.previous();
			
			
			//Update Record
			
			rs.moveToInsertRow();
			rs.updateInt(1,5);
			rs.updateString(2, "Neel");
			rs.insertRow();
			System.out.println("SuccessFully upadate.");
			rs.beforeFirst();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2));
			}
		
			/*
			//Delete last record
			
			rs.absolute(3);
			rs.deleteRow();
			System.out.println("Delete record Successfully");
			
			rs.beforeFirst();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2));
			}
			*/
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
