package my_project.capitulo8;
import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args) {
        IAverage mean = (values) -> Arrays.stream(values).average().orElse(0);
        IAverage median = (values) -> {
            Arrays.sort(values);
            int mid = values.length / 2;
            return (values.length % 2 == 0) ? (values[mid - 1] + values[mid]) / 2.0 : values[mid];
        };

        double[] nums = {1.0, 2.0, 3.0, 4.0};
        System.out.println("Mean: " + mean.compute(nums));
        System.out.println("Median: " + median.compute(nums));
    }
}
