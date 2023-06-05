package com.layout;

import com.controllers.Update;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateLayout {
    public static void layout()throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        System.out.print("Prodi Baru: ");
        String prodibaru = scanner.nextLine();
        Update.updateData(nim,prodibaru);
    }
}
