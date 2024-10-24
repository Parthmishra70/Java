import java.sql.*;

class Third{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","password");

            String q = "INSERT INTO learn VALUES(?,?)";
            PreparedStatement ps= conn.prepareStatement(q);

            ps.setInt(1, 1);
            ps.setString(2, "dim dabak dam dam");
             ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}