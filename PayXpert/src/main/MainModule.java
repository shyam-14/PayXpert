package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dao.EmployeeService;
import entity.Employee;
import exception.EmployeeNotFoundException;
import exception.InvalidInputException;

public class MainModule {

    public static void main(String[] args) throws InvalidInputException, EmployeeNotFoundException, SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
              

        while (true) {
            System.out.println("**********payXpert**********");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addEmployee(employeeService, scanner);
                    break;
                case 2:
                    viewAllEmployees(employeeService);
                    break;
                case 3:
                    System.out.println("Exiting the Employee Management System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            
        }
        
    }

    private static void addEmployee(EmployeeService employeeService, Scanner scanner) throws InvalidInputException {
        System.out.println("Enter employee details:");

        System.out.print("Enter Employee ID : ");
        String EmployeeID = scanner.nextLine();
        
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        
        
        System.out.print("Gender : ");
        String gender = scanner.nextLine();

        System.out.print("Email : ");
        String email = scanner.nextLine();

        

        // Create an Employee object and add it to the system
		Employee employee = new Employee(firstName);
		
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setGender(gender);
		employee.setEmail(email);

		employeeService.addEmployee(employee);
		System.out.println("Employee added successfully into the Database..!");
		
		
		try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payxpert_db", "root", "root")) {
                // Prepare the SQL statement for insertion
                String query = "INSERT INTO Employee (EmployeeID, FirstName, LastName, Gender, Email) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    // Set the parameter values
                    preparedStatement.setInt(1, employee.getEmployeeID());
                    preparedStatement.setString(2, employee.getFirstName());
                    preparedStatement.setString(3, employee.getLastName());
                    preparedStatement.setString(4, employee.getGender());
                    preparedStatement.setString(5, employee.getEmail());

                    // Execute the SQL statement
                    int rowsUpdated = preparedStatement.executeUpdate();

                    System.out.println(rowsUpdated + " row(s) inserted");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Handle the exception as needed
        }
			
    }


    private static void viewAllEmployees(EmployeeService employeeService) throws EmployeeNotFoundException, ClassNotFoundException, SQLException {
        System.out.println("********** All Employees **********");
        // Retrieve and display all employees
        
        //loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
      	//System.out.println("driver class loaded");
      	    
      	    
      	//get the connection 
      	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payxpert_db", "root", "root");
      	System.out.println("Connected To the Database..");
      	    
      	//create the object for Statement 
      	Statement st = con.createStatement();
      	
      	System.out.println("List of Employees..");
        String query = "select * from employee";
        ResultSet rs =  st.executeQuery(query);
      
        while(rs.next()){
    	
    	  System.out.println(rs.getInt(1) + " " + rs.getString(2)+" "+rs.getString(3) + " " + rs.getString(4));
    	}
        con.close();
		
    }
 
}
