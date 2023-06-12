package MiniMaxSum;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long minSum = arr.get(0);
        long maxSum = arr.get(0);
        long totalSum = 0;

        for (int n : arr) {
            totalSum += n;
            if (n < minSum) minSum = n;
            if (n > maxSum) maxSum = n;
        }

        System.out.println((totalSum - maxSum)+ " "+(totalSum - minSum));
    }

    public static void main(String[] args) {

    }
}
