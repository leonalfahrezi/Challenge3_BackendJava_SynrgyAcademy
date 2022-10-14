package view;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class MenuError extends Menu {
    String message;

    @Override
    public void header() {
        System.out.println("---------------------------------------------");
        System.out.println("====================ERROR====================\n");
    }

    @Override
    public void body() {
        System.out.println(getMessage());
        System.out.println("\n====================ERROR====================");
        System.out.println("---------------------------------------------");
    }

    @Override
    public void selectOption() {
        System.out.print("Tekan enter untuk balik ke menu utama <_____|");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        Menu menu = new MainMenu();
        menu.showMenu();
    }

}
