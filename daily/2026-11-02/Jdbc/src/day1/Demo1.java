// Learning JDBC (day 1) - practice file from Jdbc, pushed 2026-11-02
package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

    public static void main(String[] args) {

        try {

            // 1. Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver class registered and loaded");

            // 2. Database connection
            String url = "jdbc:mysql://localhost:3306/advance";
            String username = "root";
            String password = "<password>";

            Connection connection = DriverManager.getConnection(
                    url, username, password);

            System.out.println("DB advance connected");

            // 3. Define the SQL query
            String query = "insert into emp values(8,'pranit','IT',26000,3)";

            // 4. Create Statement
            Statement statement = connection.createStatement();

            // 5. Execute query
            int rowCount = statement.executeUpdate(query);
                
            System.out.println( " row inserted");
            
            if(rowCount ==1) {
            	System.out.println("record added sucessfully");
            	}
            else {
            	System.out.println("record not added ");
            	
            }
            // 6. Close connection
            connection.close();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}
