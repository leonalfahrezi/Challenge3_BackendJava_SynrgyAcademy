package view;

import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Scanner;

@Getter
@Setter
public class AltMenu extends Menu {
    String message;

    @Override
    public void body() {
        System.out.println(getMessage());
    }

    @Override
    public void selectOption() {
        System.out.println("---------------------------------------------");
        System.out.print("Tekan enter untuk lanjut ke menu kedua <_____|");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("Silahkan pilih Menu : ");
        System.out.println("1. Kembali Ke Menu Awal");
        System.out.println("0. Tutup Aplikasi");


        Scanner input = new Scanner(System.in);
        System.out.print("---> ");
        try {
            int inputMenu = input.nextInt();
            if (inputMenu == 1) {
                Menu menu = new MainMenu();
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
