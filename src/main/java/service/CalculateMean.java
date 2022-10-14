package service;

import java.util.List;

public class CalculateMean implements ICalculate {

    @Override
    public double calculate(List<Integer> getList) {

        double mean = (double) getList.stream().reduce(0, Integer::sum) / getList.size();
        return mean; //stream dari contoh hands on mas rizky, selebihnya saya bingung mas mau gimanain mas hehe
    }
}
