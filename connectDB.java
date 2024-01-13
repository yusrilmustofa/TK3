package TK3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class connectDB {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/eco_tracker_db";
    private static final String DB_USER = "username";
    private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        try {
            // Membuat koneksi ke database
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Menutup koneksi
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
