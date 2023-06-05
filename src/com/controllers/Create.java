package com.controllers;

import com.config.Connect;
import com.model.DataSiswa;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void insertData(String NIM, String nama, String prodi) throws SQLException {
        DataSiswa.setNIM(NIM);
        DataSiswa.setNama(nama);
        DataSiswa.setProdi(prodi);
        Connection connect = Connect.connection();
        try {
            Statement statement = connect.createStatement();
            statement.executeUpdate("INSERT INTO `main_data` (`NIM`, `nama`, `program_studi`) VALUES ('" +  DataSiswa.getNIM()+ "', '" + DataSiswa.getNama() + "', '" + DataSiswa.getProdi() + "')");
            System.out.println(DataSiswa.getNama());
            System.out.println("Data berhasil di simpan");
        } catch (Exception e) {
            e.printStackTrace();
        }
        connect.close();
    }
}
