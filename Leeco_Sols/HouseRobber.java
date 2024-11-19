package com.manas.leetco;

import java.util.Scanner;

public class HouseRobber {
    public static int robHouse(int[] nums) {

        int n =nums.length;
        int[] dp = new int[n];

        if (nums == null || n == 0) {
            return 0;
        }

        if (n == 1) {
            return nums[0];
        }

        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        dp[0] = nums[0];
        dp[1] = Integer.max(nums[0], nums[1]);
        for (int i = 2; i<n; i++) {
        dp[i] = Integer.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of houses n: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the money in each house nums: ");
        for (int i = 0; i<n; i++) {
            nums[i] = input.nextInt();
        }

        int res = robHouse(nums);
        System.out.println("max money can be robbed is: " + res);

        input.close();
    }
}
