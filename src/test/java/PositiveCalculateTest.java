import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.CalculateMean;
import service.CalculateMedian;
import service.CalculateMode;

import java.util.Arrays;
import java.util.List;

public class PositiveCalculateTest {

    List<Integer> dataCalculate = Arrays.asList(2,1,4,6,2,3,4,6,2,5,2,8,1,2,9);

    @Test
    void positiveCalculateMeanTest() {
        CalculateMean mean = new CalculateMean();
        double hasilMean = mean.calculate(dataCalculate);
        Assertions.assertEquals(3.8, hasilMean);
    }

    @Test
    void positiveCalculateMedianTest() {
        CalculateMedian median = new CalculateMedian();
        double hasilMedian = median.calculate(dataCalculate);
        Assertions.assertEquals(6, hasilMedian);
    }

    @Test
    void positiveCalculateModeTest() {
        CalculateMode mode = new CalculateMode();
        double hasilMode = mode.calculate(dataCalculate);
        Assertions.assertEquals(2, hasilMode);
    }

}
