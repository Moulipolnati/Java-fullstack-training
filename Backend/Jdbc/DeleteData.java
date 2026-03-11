package com.jdbcmaven.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FEB2026", "root", "Mouli@3022");
		
		//prepare sql statement
		String delQuery ="delete from employee where id=?";
		PreparedStatement pst = con.prepareStatement(delQuery);
		// use scanner class to take input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id to remove:");
		int eID =sc.nextInt()
;
		pst.setInt(1,eID);
		//execute sql statement
		int rowsDeleted = pst.executeUpdate();
		System.out.println("Data deleted successfully! rows deleted: "+ rowsDeleted);
		
		//close connection
		 pst.close();
		 con.close();
		 sc.close();
		

	}

}
