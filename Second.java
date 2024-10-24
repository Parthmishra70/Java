import java.sql.*;

class Second {
    public static void main(String args[]) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");

            // Create a SQL query to create a table
            String q = "CREATE TABLE learn(Id INT, Name VARCHAR(20))";

            // Create a Statement object to execute the query
            Statement st = conn.createStatement();

            // Execute the query (use executeUpdate for queries that modify the database)
            int result = st.executeUpdate(q);

            // Output a success message
            System.out.println("Table created successfully");

            // Close the resources
            st.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            // Handle the exception if the JDBC driver is not found
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            // Handle SQL-related exceptions
            e.printStackTrace();
        }
    }
}
