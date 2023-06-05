package com.controllers;

import com.config.Connect;
import com.model.DataSiswa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void deleteData(String NIM) throws SQLException{
        DataSiswa.setNIM(NIM);
        Connection conn = Connect.connection();
        try {
            String querydel = "DELETE FROM main_data WHERE NIM = ?";
            PreparedStatement statement = conn.prepareStatement(querydel);
            statement.setString(1, DataSiswa.getNIM());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data berhasil dihapus.");
            } else {
                System.out.println("Data tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.close();
    }
}
