package com.config;

import java.sql.DriverManager;
import java.sql.Connection;

public class Connect {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/data_siswa";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    public static Connection connection() {
        try {
            Connection connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection: Gagal");
            return null;
        }
    }
}
