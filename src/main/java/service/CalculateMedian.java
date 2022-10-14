package service;

import java.util.List;

public class CalculateMedian implements ICalculate {

    @Override
    public double calculate(List<Integer> getList) {

        double median = 0;
        if (getList.size() % 2 == 0) {
            double i = getList.get(getList.size() / 2);
            double j = getList.get(getList.size() / 2 - 1);
            median = (i + j) / 2;
        } else {
            median = getList.get(getList.size() / 2);
        }
        return median;
    }
}