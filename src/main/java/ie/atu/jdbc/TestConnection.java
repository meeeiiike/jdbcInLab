package ie.atu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclab", "root", "password");
            System.out.println("connected");
        } catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        } finally {
            if (con != null){
                try{
                    con.close();
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
