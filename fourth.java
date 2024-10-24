
import java.sql.*;
import java.util.Scanner;

class fourth {

    public static void main(String args[]) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");

            Scanner io = new Scanner(System.in);
            System.out.println("type your id here:");
            int data = io.nextInt();
            io.nextLine();
            System.out.println("type your name here:");
            String name = io.nextLine();

            String q = "INSERT INTO learn VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(q);

            ps.setInt(1, data);
            ps.setString(2, name);
            ps.executeUpdate();

            System.out.println("Registered");

conn.close();
io.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
