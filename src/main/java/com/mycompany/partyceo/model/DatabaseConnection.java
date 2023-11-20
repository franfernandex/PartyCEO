package com.mycompany.partyceo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://db4free.net:3306/testezeze";
            String user = "zeze123";
            String password = "Yz#ah6q*-V9B$Jv";

            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
