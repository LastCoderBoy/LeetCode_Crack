package InterviewQ;

import java.util.Arrays;

public class ConvertTemperature {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }

    private static double[] convertTemperature(double celsius) {
//        Input: celsius = 36.50
//        Output: [309.65000,97.70000]
//        Kelvin = Celsius + 273.15
//        Fahrenheit = Celsius * 1.80 + 32.00

        double[] result = new double[2];
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;

        result[0] = Kelvin;
        result[1] = Fahrenheit;
        return result;
    }
}
