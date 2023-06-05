package App;

import com.layout.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            MainLayout.layout();
            int Pilihan = scanner.nextInt();
            System.out.println("==".repeat(20));
            switch (Pilihan){
                case 1:
                    ReadLayout.layout();
                    break;
                case 2:
                    CreateLayout.layout();
                    break;
                case 3:
                    UpdateLayout.layout();
                    break;
                case 4:
                    DeleteLayout.layout();
                case 5:
                    System.out.println("Sampai Jumpa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak Ada Dalam Pilihan!");
                    break;
            }
        }
    }
}