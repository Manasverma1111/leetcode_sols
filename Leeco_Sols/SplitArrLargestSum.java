package com.manas.leetco;

import java.util.Scanner;

public class SplitArrLargestSum {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);  // max element in nums
            right += num;                // sum of all elements
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrayCount = 1;  // start with one subarray
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSum) {
                subarrayCount++;    // start a new subarray
                currentSum = num;   // reset the current sum to the current element
                if (subarrayCount > k) {
                    return false;   // too many subarrays
                }
            } else {
                currentSum += num;
            }
        }

        return true;  // feasible with `k` subarrays
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array and take input values
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (space-separated): ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Read the number of subarrays
        System.out.print("Enter the number of subarrays to split into (k): ");
        int k = scanner.nextInt();

        // Create an instance of Solution and call splitArray
        SplitArrLargestSum solution = new SplitArrLargestSum();
        int result = solution.splitArray(nums, k);

        // Display the result
        System.out.println("The minimized largest sum of the split is: " + result);

        scanner.close();
    }
}

