package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbInsert {
   static final String DB_URL = "jdbc:mysql://localhost/lab";
   static final String USER = "root";
   static final String PASS = "Mq.j@5g5r@0806";

   public static void main(String[] args) {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO emp VALUES (6, 'Sakura', 'Medic', 22)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO emp VALUES (9, 'Uraraka', 'Uravity', 20)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO emp VALUES (8, 'Bolma', 'Scientist', 27)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO emp VALUES(14, 'Mikasa', 'HackerMan Hunter', 28)";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
