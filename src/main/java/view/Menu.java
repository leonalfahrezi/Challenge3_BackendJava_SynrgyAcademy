package view;

public abstract class Menu {

    public void header() {
        System.out.println("---------------------------------------------");
        System.out.println("========Aplikasi Pengolah Nilai Siswa========");
        System.out.println("---------------------------------------------");
    }

    public abstract void body();

    public abstract void selectOption();

    public void showMenu() {
        header();
        body();
        selectOption();
    }
}
