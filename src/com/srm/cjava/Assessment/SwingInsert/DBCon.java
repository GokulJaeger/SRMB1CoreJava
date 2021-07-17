package Assessment.SwingInsert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {
    static final String DB_URL = "jdbc:mysql://localhost:3306/lab";
   static final String USER = "root";
   static final String PASS = "Mq.j@5g5r@0806";
   static final String QUERY = "SELECT cid, cname, cmodel FROM car";

   void  insertdata(String str1, String str2,String str3) {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            System.out.print("Car ID: " + rs.getInt("cid"));
            System.out.print(", Care Name: " + rs.getInt("cname"));
            System.out.print(", Car Model: " + rs.getString("cmodel"));
         }
         int cidno = Integer.parseInt(str1);
         String sql = "INSERT INTO car VALUES (" + cidno + ", " + str2 + ", " + str3 + ");";
         stmt.executeUpdate(sql);
         System.out.println("1 row inserted!.");
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   } 
}   
