package com.controllers;

import com.config.Connect;
import com.model.DataSiswa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
    public static void getDatabase() throws SQLException{
        Connection conn = Connect.connection();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM main_data");
            if (resultset.next()) {
                while (resultset.next()) {
                    DataSiswa.setNIM(resultset.getString("NIM"));
                    DataSiswa.setNama(resultset.getString("nama"));
                    DataSiswa.setProdi(resultset.getString("program_studi"));
                    System.out.printf("%s %s (%s)%n", DataSiswa.getNama(), DataSiswa.getNIM(), DataSiswa.getProdi());
                }
            } else {
                System.out.println("Tidak Ada Data!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.close();
    }
}
