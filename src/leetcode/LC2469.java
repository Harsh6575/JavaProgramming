package leetcode;

import java.util.Arrays;

public class LC2469 {
    /*
        Leetcode 2469. Convert the Temperature
    */

    static double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        result[0] = celsius + 273.15; // Kelvin
        result[1] = celsius * 1.80000 + 32.00000; // Fahrenheit
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50))); // [309.65000, 97.70000]
        System.out.println(Arrays.toString(convertTemperature(122.11))); // [395.26000, 251.79800]
    }
}
