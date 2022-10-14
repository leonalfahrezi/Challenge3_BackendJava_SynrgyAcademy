package view;

import lombok.Getter;
import lombok.Setter;
import service.FileHandle;

import java.util.InputMismatchException;
import java.util.Scanner;
@Getter
@Setter
public class MainMenu extends Menu {

    @Override
    public void body() {
        System.out.println("Silahkan pilih menu : ");
        System.out.println("1. Generate file untuk menampilkan modus (frekuensi)");
        System.out.println("2. Generate file untuk menampilkan mean, median dan modus");
        System.out.println("3. Generate kedua file");
        System.out.println("0. Exit");
    }

    @Override
    public void selectOption() {

        FileHandle fileHandle = new FileHandle();
        Scanner input = new Scanner(System.in);
        System.out.print("---> ");

        try {
            int inputMenu = input.nextInt();
            if (inputMenu >= 1 && inputMenu <= 3) {
                fileHandle.setMenu(inputMenu);
                fileHandle.generateFile();
                AltMenu menu = new AltMenu();
                menu.setMessage("\u001B[32m" + "===File telah di generate! Silahkan cek di direktori src/main/resources===" + "\u001B[0m");
                menu.showMenu();
            } else if (inputMenu == 0) {
                System.out.println("\u001B[32m" + "===Anda keluar dari aplikasi, terimakasih===" + "\u001B[0m");
                System.exit(0);
            } else {
                MenuError menu = new MenuError();
                menu.setMessage("\u001B[31m" + "===Pilihan yang anda input tidak tersedia===" + "\u001B[0m");
                menu.showMenu();
            }
        } catch (InputMismatchException ime) {
            MenuError menu = new MenuError();
            menu.setMessage("\u001B[31m" + "===Pilihan yang anda input bukan angka===" + "\u001B[0m");
            menu.showMenu();
        }
    }
}