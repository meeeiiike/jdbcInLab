package ie.atu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclab", "root", "password");
        try{
            PreparedStatement stmt = con.prepareStatement("INSERT INTO student (name) VALUES(?)");
            stmt.setString(1, "meike");
            stmt.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException e){
            System.out.println("Failed to Insert");
            e.printStackTrace();
        }
        con.close();

    }
}
