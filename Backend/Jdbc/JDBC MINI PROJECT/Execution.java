package com.emolpyee;

import java.sql.SQLException;
import java.util.Scanner;

public class Execution {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // DTO object to call database methods
        EmployeeDTO dto = new EmployeeDTO();

        int choice = 0;

        // Loop until user chooses Exit
        while (choice != 6) {

            System.out.println("\n");
            System.out.println("==== EMPLOYEE MENU ====");
            System.out.println("0. Create Employee Table");
            System.out.println("1. Insert data");
            System.out.println("2. Delete data");
            System.out.println("3. Read all the data present in employee table");
            System.out.println("4. Update the employee salary");
            System.out.println("5. Search by using Employee ID");
            System.out.println("6. Exit");

            System.out.println("Enter your choice : ");

            // Input validation
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 0:
                    // Create table
                    dto.createTable();
                    break;

                case 1:
                    // Insert employee data
                    EmployeeEntity emp = new EmployeeEntity();

                    System.out.println("Enter employee Id: ");
                    emp.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Enter employee name: ");
                    emp.setName(sc.nextLine());

                    System.out.println("Enter employee salary: ");
                    emp.setSalary(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Enter employee location: ");
                    emp.setLocation(sc.nextLine());

                    dto.insertData(emp);
                    break;

                case 2:
                    // Delete employee
                    System.out.println("Enter employee Id to delete: ");
                    int id = sc.nextInt();
                    dto.deleteData(id);
                    break;

                case 3:
                    // Read all employees
                    dto.readData();
                    break;

                case 4:
                    // Update salary
                    System.out.println("Enter employee Id to update:");
                    int id2 = sc.nextInt();

                    System.out.println("Enter employee salary:");
                    int sal = sc.nextInt();

                    dto.updateSalary(id2, sal);
                    break;

                case 5:
                    // Search employee by ID
                    System.out.println("Enter Employee ID to search: ");
                    int id3 = sc.nextInt();
                    dto.searchEmployee(id3);
                    break;

                case 6:
                    System.out.println("Exiting program.... Thank You!");
                    break;

                default:
                    System.out.println("Invalid choice! Try Again.");
            }
        }

        sc.close();
    }
}