//package util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class DatabaseContext {
//    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver"; // Change this based on your database
//    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/payxpert_db"; // Change this
//    private static final String USERNAME = "root"; // Change this
//    private static final String PASSWORD = "root"; // Change this
//
//    // Load the JDBC driver
//    static {
//        try {
//            Class.forName(DRIVER_CLASS);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            // Handle the exception as needed
//        }
//    }
//
//    // Establish a database connection
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
//    }
//
//    // Close the database connection
//    public static void closeConnection(Connection connection) {
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//                // Handle the exception as needed
//            }
//        }
//    }
//
//    // Close PreparedStatement
//    public static void closePreparedStatement(PreparedStatement preparedStatement) {
//        if (preparedStatement != null) {
//            try {
//                preparedStatement.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//                // Handle the exception as needed
//            }
//        }
//    }
//
//    // Close ResultSet
//    public static void closeResultSet(ResultSet resultSet) {
//        if (resultSet != null) {
//            try {
//                resultSet.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//                // Handle the exception as needed
//            }
//        }
//    }
//}


//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class DatabaseContext {
//    private static final String SERVER_NAME = "localhost";
//    private static final String DATABASE_NAME = "payxpert_db";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "root";
//
////    private static final String CONNECTION_STRING =
////            "jdbc:sqlserver://" + SERVER_NAME + ":1433;databaseName=" + DATABASE_NAME +
////            ";user=" + USERNAME + ";password=" + PASSWORD + ";";
//
//    
//    private static final String CONNECTION_STRING =
//            "jdbc:mysql://" + SERVER_NAME + ":3306/" + DATABASE_NAME +
//            "?user=" + USERNAME + "&password=" + PASSWORD;
//
//    
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(CONNECTION_STRING);
//    }
//
//    public static void closeConnection(Connection connection) {
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//                // Handle the exception as needed
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Connection connection = null;
//        try {
//            // Establish connection
//            connection = getConnection();
//
//            // Example query
//            String query = "SELECT * FROM Employee";
//            
//            // Execute query
//            try (PreparedStatement statement = connection.prepareStatement(query);
//                 ResultSet resultSet = statement.executeQuery()) {
//
//                // Process the result set
//                while (resultSet.next()) {
//                    int employeeID = resultSet.getInt("EmployeeID");
//                    String firstName = resultSet.getString("FirstName");
//                    String lastName = resultSet.getString("LastName");
//
//                    System.out.println("EmployeeID: " + employeeID + ", FirstName: " + firstName + ", LastName: " + lastName);
//                }
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // Close connection in the finally block to ensure it gets closed even if an exception occurs
//            closeConnection(connection);
//        }
//    }
//}



//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class DatabaseContext {
//    private static final String SERVER_NAME = "localhost";
//    private static final String DATABASE_NAME = "payxpert_db";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "root";
//
//    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
//    private static final String DATABASE_URL = "jdbc:mysql://" + SERVER_NAME + ":3306/" + DATABASE_NAME;
//
//    public static Connection getConnection() throws SQLException {
//        try {
//            // Load the JDBC driver
//            Class.forName(DRIVER_CLASS);
//            // Establish the connection
//            return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
//        } catch (ClassNotFoundException e) {
//            throw new SQLException("MySQL JDBC Driver not found", e);
//        }
//    }
//
//    public static void closeConnection(Connection connection) {
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//                // Handle the exception as needed
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//    	
//        Connection connection = null;
//        try {
//            // Establish connection
//            connection = getConnection();
//
//            // Example query
//            String query = "SELECT * FROM Employee";
//
//            // Execute query
//            try (PreparedStatement statement = connection.prepareStatement(query);
//                 ResultSet resultSet = statement.executeQuery()) {
//
//                // Process the result set
//                while (resultSet.next()) {
//                    int employeeID = resultSet.getInt("EmployeeID");
//                    String firstName = resultSet.getString("FirstName");
//                    String lastName = resultSet.getString("LastName");
//
//                    System.out.println("EmployeeID: " + employeeID + ", FirstName: " + firstName + ", LastName: " + lastName);
//                }
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // Close connection in the finally block to ensure it gets closed even if an exception occurs
//            closeConnection(connection);
//        }
//    }
//}


package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseContext {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//loading the driver class
	
	Class.forName("com.mysql.cj.jdbc.Driver");
    //System.out.println("driver class loaded");
    
    
    //get the connection 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payxpert_db", "root", "root");
    System.out.println("Connected To the Database..");
    
    //create the object for Statement 
    Statement st = con.createStatement();
    
    String query = "select * from employee";
    ResultSet rs =  st.executeQuery(query);
  
    while(rs.next()){
	
	  System.out.println(rs.getInt(1) + " " + rs.getString(2));
	}
    
    //close the connection 
    con.close();
}
}


