package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBasePage {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;

	public String getDataFromDB(String columnName) { 								// method that gets data from DB

		try {
//			setting properties for mySQL
			Class.forName("com.mysql.cj.jdbc.Driver"); 								// the Driver which connects to the MYSQL

			String sqlUrl = "jdbc:mysql://localhost:3306/new_selenium_24"; 			// "jcbc:"is for all here is for "mysql" can be "Oracle", "12.0.0.1" is the host name we can call it 
																					// "localhost" too. "3306" is port number and "/new_selenium_24" is the DB name.
			String sqlUsername = "root";
			String sqlPassword = "root";
			String sqlQuery = "Select * from add_new_customer;"; 						// this is the inquiry we want to perform

//			create connection to the local database
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword); 	// using "connection" interface to connect

//			empowering connection reference variable to execute queries
			statement = connection.createStatement(); 						// statement is an interface

//			delivering query
			resultSet = statement.executeQuery(sqlQuery); 					// resultSet is an interface

			while (resultSet.next()) { 										// using "while Loop" to read all columns
				columnValue = resultSet.getString(columnName);
				return columnValue;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 				// and using "finally" to close the Loop, condition is if it is not "null" for "connection" and "resultSet"
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return columnValue;

	}
}
