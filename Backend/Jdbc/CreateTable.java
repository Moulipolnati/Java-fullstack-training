package com.jdbcmaven.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish database connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FEB2026", "root","Mouli@3022");
		
		//prepare sql statement
		Statement st = con.createStatement();
		
		//execute sql statements
		st.executeUpdate("create table user(id int,name varchar(10))");
		System.out.println("table created sucessfully");
		
		//close the connection
		st.close();
		con.close();

	}

}
