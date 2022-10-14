package service;

import java.util.Collections;
import java.util.List;

public class CalculateMode implements ICalculate {

    @Override
    public double calculate(List<Integer> getList) {
        double modus = 0;
        int counter = 1;
        for (int i : getList) {
            int freq = Collections.frequency(getList, i);
            if (freq > counter) {
                modus = i;
                counter = freq;
            }
        }
        return modus;
    }
}
