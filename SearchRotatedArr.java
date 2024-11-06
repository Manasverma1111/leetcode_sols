package com.manas.leetco;

import java.util.Scanner;

public class SearchRotatedArr {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize array and take inputs
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (space-separated): ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Read target element
        System.out.print("Enter the target element to search: ");
        int target = scanner.nextInt();

        // Create an instance of Solution and call search
        SearchRotatedArr solution = new SearchRotatedArr();
        int result = solution.search(nums, target);

        // Display the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }
}
