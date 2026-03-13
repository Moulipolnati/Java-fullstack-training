package com.emolpyee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDTO {

	// final static variables for all methods
	public final static String database_URL = "jdbc:mysql://localhost:3306/FEB2026";
	public final static String userName = "root";
	public final static String password = "Mouli@3022";
	// method for create table
		public void createTable() throws ClassNotFoundException, SQLException {
			// step 1: load class driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2: establish connection
			Connection con = DriverManager.getConnection(database_URL, userName, password);

			// step 3: prepare SQL statements
			Statement st = con.createStatement();

			// step 4: execute SQL statements
			String createTable = "CREATE TABLE EMPLOYEEE (ID INT, NAME VARCHAR(10), SALARY INT, LOCATION VARCHAR(10) )";
			int rowsEffected = st.executeUpdate(createTable);
			System.out.println("Table create successfully! Total rows effected" + rowsEffected);

			// step 5: close connections
			st.close();
			con.close();
		}
		// method for inserting data
		public void insertData(EmployeeEntity emp) throws ClassNotFoundException, SQLException {
			// step 1: load class driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2: establish connection
			Connection con = DriverManager.getConnection(database_URL, userName, password);

			// step 3: prepare SQL statement
			String insertQuery = "INSERT INTO EMPLOYEEE (ID, NAME, SALARY, LOCATION) VALUES (?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(insertQuery);
			pst.setInt(1, emp.getId());
			pst.setString(2, emp.getName());
			pst.setInt(3, emp.getSalary());
			pst.setString(4, emp.getLocation());

			// step 4: execute SQL statement
			int rowsInserted = pst.executeUpdate();
			System.out.println("Data inserted successfully! total rows inserted: " + rowsInserted);

			// step 5: close connection
			pst.close();
			con.close();
		}
		// method for deleting employee data
		public void deleteData(int id) throws ClassNotFoundException, SQLException {
			// step 1: load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2: establish connection
			Connection con = DriverManager.getConnection(database_URL, userName, password);

			// step 3: prepare SQL statement
			String deleteQuery = "DELETE FROM EMPLOYEEE WHERE ID = ?";
			PreparedStatement pst = con.prepareStatement(deleteQuery);
			pst.setInt(1, id);

			// step 4: execute SQL statement
			int rows = pst.executeUpdate();

			if (rows > 0) {
				System.out.println("Employee deleted successfully!");
			} else {
				System.out.println("No employee found with given ID.");
			}

			// step 5: close connection
			pst.close();
			con.close();
		}
		// method to read all the data present in employee table
		public void readData() throws ClassNotFoundException, SQLException {
			// step 1: load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2: establish connection
			Connection con = DriverManager.getConnection(database_URL, userName, password);

			// step 3: prepare SQL statement
			String readQuery = "SELECT * FROM EMPLOYEEE";
			Statement st = con.createStatement();

			// step 4: execute SQL statement
			ResultSet rst = st.executeQuery(readQuery);
			System.out.println("ID -- NAME -- SALARY -- LOCATION");
			System.out.println("--------------------------------");

			while (rst.next()) {
				System.out.println(rst.getInt("ID") + " -- " + rst.getString("NAME") + " -- " + rst.getInt("SALARY")
						+ " -- " + rst.getString("LOCATION"));
				System.out.println("--------------------------------");
			}

			// step 5: close connection
			rst.close();
			st.close();
			con.close();
		}
		// method to update employee salary
		public void updateSalary(int id2, int sal) throws ClassNotFoundException, SQLException {
			// step 1: load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2: establish connection
			Connection con = DriverManager.getConnection(database_URL, userName, password);

			// step 3: prepare SQL statement
			String updateQuery = "UPDATE EMPLOYEEE SET SALARY = ? WHERE ID = ?";
			PreparedStatement pst = con.prepareStatement(updateQuery);

			pst.setInt(2, id2);
			pst.setInt(1, sal);
			
			// step 4: execute SQL statement
			int row = pst.executeUpdate();

			if (row > 0) {
				System.out.println("Employee salary updated successfully!");
			} else {
				System.out.println("Employee not found");
			}

			// step 5: close connection
			pst.close();
			con.close();
		}
		//method to search employee data by using ID
		public void searchEmployee(int id3) throws ClassNotFoundException, SQLException {
			//step 1: load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2: establish connection
			Connection con = DriverManager.getConnection(database_URL, userName, password);
			
			//step 3: prepare SQL statement
			String searchEmp = "SELECT * FROM EMPLOYEEE WHERE ID = ?";
			PreparedStatement pst = con.prepareStatement(searchEmp);
			pst.setInt(1, id3);
			
			//step 4: execute SQL statement
			ResultSet rst = pst.executeQuery();
			
			if (rst.next()) {
				System.out.println("Employee found");
				System.out.println("------------------------------");
				System.out.println("Employee ID: " + rst.getInt("ID"));
				System.out.println("Employee Name: " + rst.getString("NAME"));
				System.out.println("Employee Salary: " + rst.getInt("SALARY"));
				System.out.println("Employee Location: " + rst.getString("LOCATION"));
			}
			else {
				System.out.println("Employee not fount!");
			}
			//step 5: close connection
			rst.close();
			pst.close();
			con.close();
		}
	}




