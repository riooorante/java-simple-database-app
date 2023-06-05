package com.layout;

import com.controllers.Create;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateLayout {
    public static void layout() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NIM : ");
        String NIM = scanner.next();
        scanner.nextLine();
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Prodi : ");
        String prodi = scanner.nextLine();
        Create.insertData(NIM,nama,prodi);
    }

}
