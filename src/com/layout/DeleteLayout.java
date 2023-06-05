package com.layout;

import com.controllers.Delete;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteLayout {
    public static void layout() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NIM : ");
        String hapusnim = scanner.nextLine();
        Delete.deleteData(hapusnim);
    }
}
