package abc1.ch3;

import java.util.Arrays;

public interface Measurable {
    public double getMeasure();

    public static double avg(Measurable[] arr) {
        return Arrays.stream(arr).mapToDouble(Measurable::getMeasure).average().orElse(Double.NaN);
    }

    public static double largest(Measurable[] arr){
        return Arrays.stream(arr).mapToDouble(Measurable::getMeasure).max().orElse(Double.NaN);
    }
}
