package service;

import lombok.Getter;
import lombok.Setter;
import view.MenuError;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class FileHandle implements IFileHandle {
    private Integer menu;
    List<Integer> getList = new ArrayList();

    public void readFile() {
        File file = new File("src/main/resources/data_sekolah.csv");
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            String[] tempArr;


            while ((line = br.readLine()) != null) {
                tempArr = line.split(";");

                for (int i = 1; i < tempArr.length; i++) {
                    getList.add(Integer.valueOf(tempArr[i]));
                }
            }
            setGetList(getList);
            br.close();
        }catch (IOException ioe) {
            MenuError menu = new MenuError();
            menu.setMessage("\u001B[31m" + "===File tidak ditemukan! Mohon cek kembali!===" + "\u001B[0m");
            menu.showMenu();
        }
    }

    @Override
    public void generateFile() {
        if(menu == 1){
            showModus(getGetList());
        }else if(menu == 2){
            showMeanMedianModus(getGetList());
        }else{
            showModus(getGetList());
            showMeanMedianModus(getGetList());
        }
    }

    public void showModus(List<Integer> getList) {
        readFile();
        File file = new File("src/main/resources/data_sekolah_modus.txt");
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (Integer i : getList) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("Berikut Hasil Pengolahan Nilai:");
            bw.newLine();
            bw.write("Nilai     |     Frekuensi");
            bw.newLine();
            for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
                bw.write(val.getKey() + "         |       " + val.getValue());
                bw.newLine();
            }
            bw.flush();
            bw.close();

        } catch (IOException ioe) {
            MenuError menu = new MenuError();
            menu.setMessage("\u001B[31m" + "===Terdapat kesalahan! Mohon cek kembali!===" + "\u001B[0m");
            menu.showMenu();
        }
    }


    public void showMeanMedianModus(List<Integer> getList) {
        readFile();
        try {
            File file = new File("src/main/resources/data_sekolah_mean_median_modus.txt");
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Berikut Hasil Pengolahan Nilai : ");
            bw.newLine();
            bw.newLine();
            bw.write("Berikut Hasil sebaran data Nilai : ");
            bw.newLine();
            bw.write("Mean                 :           " + new CalculateMean().calculate(getList));
            bw.newLine();
            bw.write("Median               :           " + new CalculateMedian().calculate(getList));
            bw.newLine();
            bw.write("Mode                 :           " + new CalculateMode().calculate(getList));
            bw.newLine();
            bw.flush();
            bw.close();

        } catch (IOException ioe) {
            MenuError menu = new MenuError();
            menu.setMessage("\u001B[31m" + "===Terdapat kesalahan! Mohon cek kembali!===" + "\u001B[0m");
            menu.showMenu();
        }
    }

}
