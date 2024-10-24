
import java.sql.*;

class First {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");

            if (conn.isClosed()) {
                System.out.println("connected!");
            }

            String q = "CREATE TABLE Test(id INT,name VARCHAR(15))";
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery(q);
            // if (set) {
            //     System.out.println("DONE");
            // }

        } catch (SQLException e) {
            System.out.println(e);

        }
    }
}
