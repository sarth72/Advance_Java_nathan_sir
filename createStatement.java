package advance_Java;
import java.sql.*;

public class createStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/dac",
                "root",
                "saMI72"
        );

        Statement smt=con.createStatement();
        String query="select * from  employee";
        ResultSet rs=smt.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
    }
}
