package com.jdbcmaven.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	//establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FEB2026","root","Mouli@3022");
	//prepare sql statement
		String updateQuery ="update employee set name=? where id =?";
		PreparedStatement pst = con.prepareStatement(updateQuery);
	// using scanner class taking inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee which one to be updated: ");
		int eID =sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter employee name to update: ");
		String eName = sc.nextLine();
		
		  pst.setInt(2,eID);
		  pst.setString(1, eName);
		  
		//execute sql statement
		  int rowsUpdated = pst.executeUpdate();
		  System.out.println("Data Updated Successfully!  rows updated: "+rowsUpdated);
		  
		  //close connection
		    pst.close();
		    con.close();
		    sc.close();
		  
		

	}

}

