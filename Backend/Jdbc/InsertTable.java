package com.jdbcmaven.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//step:1 load class driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	//step2: establish connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FEB2026","root", "Mouli@3022");
		
    //prepate sql statement 
	 String insertQuery ="insert into employee(id,name)values(?,?)";
	 PreparedStatement pst = con.prepareStatement(insertQuery);
	 //using scanner class taking inputs
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter employee id: ");
	 int eID =sc.nextInt();
	 sc.nextLine();
	 System.out.println("Enter employee Name: ");
	 String eName =sc.nextLine();
	 pst.setInt(1,eID);
	 pst.setString(2, eName);
	 
	 // step 4 execute sql statement
	   int rowsInserted=pst.executeUpdate();
	   System.out.println("Data inserted successfully! total rows inserted: "+rowsInserted);
	   //step 5 close connection 
	   pst.close();
	   con.close();
	   sc.close();
	 
}

}

