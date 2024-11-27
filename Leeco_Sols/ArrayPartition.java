package com.manas.leetco;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPartition {
    public static int arrPartition(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i<n; i += 2) {
            if (i%2 == 0) {
                sum += nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array m: ");
        int m = input.nextInt();

        System.out.println("Enter array elements nums: ");
        int[] nums = new int[m];

        for (int j = 0; j<m; j++) {
            nums[j] = input.nextInt();
        }

        int result = arrPartition(nums);
        System.out.println("max sum: " + result);
        input.close();
    }
}
