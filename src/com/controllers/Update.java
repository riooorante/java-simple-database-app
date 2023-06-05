package com.controllers;

import com.config.Connect;
import com.model.DataSiswa;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void updateData(String NIM, String prodi) throws SQLException {
        DataSiswa.setNIM(NIM);
        DataSiswa.setProdi(prodi);
        Connection connect = Connect.connection();
        try {
            Statement statement = connect.createStatement();
            statement.executeUpdate(String.format("UPDATE `main_data` SET `program_studi`='%s' WHERE `NIM`='%s'", DataSiswa.getProdi(),DataSiswa.getNIM()));
            System.out.println("Data berhasil di Update");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Data Tidak Ditemukan");
        }
        connect.close();
    }

}
