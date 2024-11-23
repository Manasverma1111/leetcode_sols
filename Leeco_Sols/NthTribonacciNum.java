package com.manas.leetco;

import java.util.Scanner;

public class NthTribonacciNum {
    public static int tribonacciNum(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number b/w 1 to 37 n: ");
        int n = input.nextInt();

        int result = tribonacciNum(n);
        System.out.println("Nth Tribonacci number is: " + result);
        input.close();

    }
}
