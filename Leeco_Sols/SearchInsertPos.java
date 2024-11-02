package com.manas.leetco;

import java.util.Scanner;

public class SearchInsertPos {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements in sorted order:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input target value
        System.out.print("Enter the target value to search or insert: ");
        int target = scanner.nextInt();

        // Create an instance of Solution and call the searchInsert method
        SearchInsertPos solution = new SearchInsertPos();
        int result = solution.searchInsert(nums, target);

        // Output result
        System.out.println("Target should be at index: " + result);

        scanner.close();
    }
}

