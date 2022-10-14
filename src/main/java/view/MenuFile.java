package view;

import java.io.File;
import java.util.Scanner;

public class MenuFile extends Menu {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void body() {
        System.out.println("Sebelum lanjut, yuk pastikan apakah file data_sekolah.csv sudah berada di direktori berikut :" + "\u001B[32m" + "\nsrc/main/resources/data_sekolah.csv" + "\u001B[0m");
        System.out.println("Jika sudah yakin, silahkan tekan enter yaa untuk memeverifikasi :) <_____|");
        scanner.nextLine();
    }

    @Override
    public void selectOption() {
        File file = new File("src/main/resources/data_sekolah.csv");
        if (file.exists()) {
            System.out.println("\u001B[32m" + "===File anda ada dan telah diverifikasi, silahkan lanjut!===" + "\u001B[0m");
            System.out.print("Silahkan tekan enter untuk menuju ke menu utama");
            scanner.nextLine();

            MainMenu menu = new MainMenu();
            menu.showMenu();

        } else {
            MenuError menu = new MenuError();
            menu.setMessage("\u001B[31m" + "File anda tidak ada! Mohon dicek dan pastikan\nkembali bahwa file anda berada di drektori yang sesuai!\nAnda tidak akan bisa melakukan generate file!" + "\u001B[0m");
            menu.showMenu();
        }

    }
}