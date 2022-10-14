import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.CalculateMean;
import service.CalculateMedian;
import service.CalculateMode;

import java.util.Arrays;
import java.util.List;

public class NegativeCalculateTest {

    List<Integer> dataCalculate = Arrays.asList(null);

    @Test
    void negativeCalculateMeanTest() {
        CalculateMean mean = new CalculateMean();
        double hasilMean = mean.calculate(dataCalculate);
        Assertions.assertEquals(0, hasilMean);
    }

    @Test
    void negativeCalculateMedianTest() {
        CalculateMedian median = new CalculateMedian();
        double hasilMedian = median.calculate(dataCalculate);
        Assertions.assertEquals(0, hasilMedian);
    }

    @Test
    void negativeCalculateModeTest() {
        CalculateMode mode = new CalculateMode();
        double hasilMode = mode.calculate(dataCalculate);
        Assertions.assertEquals(0, hasilMode);
    }

}
