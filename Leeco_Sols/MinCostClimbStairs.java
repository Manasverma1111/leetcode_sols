package com.manas.leetco;

import java.util.Scanner;

public class MinCostClimbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of steps: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.print("Number of steps should be at least 2. ");
            return;
        }

        int[] cost = new int[n];
        System.out.print("Enter the cost for each step: ");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        System.out.print("Minimum cost to reach the top: " + minCostClimbingStairs(cost));

        sc.close();
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if (n == 2) {
            return Math.min(cost[0], cost[1]);
        }

        int[] dp = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }
}

