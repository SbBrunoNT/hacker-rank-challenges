package PlusMinus;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int countPos = 0;
        int countNeg = 0;
        int countZer = 0;


        for (Integer integer : arr) {
            if (integer > 0) {
                countPos += 1;
            } else if (integer < 0) {
                countNeg += 1;
            } else
                countZer += 1;
        }

        double positive = countPos / (double)arr.size();
        double negative = countNeg / (double)arr.size();
        double zero = countZer / (double)arr.size();

        System.out.printf("%.6f%n", positive);
        System.out.printf("%.6f%n", negative);
        System.out.printf("%.6f%n", zero);

    }

    public static void main(String[] args) {


    }
}
