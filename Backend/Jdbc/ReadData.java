package com.jdbcmaven.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class ReadData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FEB2026", "root","Mouli@3022");
		//prepare sql statement
		Statement st = con.createStatement();
		String readQuery = "select * from employee";
		//execute sql statement 
		ResultSet result = st.executeQuery(readQuery);
		//iterate result set connection 
		System.out.println("ID-----NAME");
		System.out.println("----------------");
		while(result.next()) {
			System.out.println(result.getInt("ID") + "--" + result.getString("NAME"));
			System.out.println("----------------------");
			

		}
		//close connection 
		st.close();
		con.close();
		result.close();
}
}
