package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDelete {
    static final String DB_URL = "jdbc:mysql://localhost/lab";
    static final String USER = "root";
    static final String PASS = "Mq.j@5g5r@0806";
    static final String QUERY = "SELECT Eid, Ename, Edesig, Eage FROM emp";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            String sql = "DELETE FROM emp " + "WHERE Eid = 14";
            stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery(QUERY);
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("Eid"));
                System.out.print(", Age: " + rs.getInt("Eage"));
                System.out.print(", First: " + rs.getString("Ename"));
                System.out.println(", Last: " + rs.getString("Edesig"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
