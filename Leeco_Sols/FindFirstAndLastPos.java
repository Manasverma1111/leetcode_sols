package com.manas.leetco;

public class FindFirstAndLastPos {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};  // Default result if target is not found

        result[0] = findStartingPosition(nums, target);
        result[1] = findEndingPosition(nums, target);

        return result;
    }

    // Binary search to find the starting position of the target
    private int findStartingPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;  // Potential start position
                right = mid - 1;  // Continue searching in the left half
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }

    // Binary search to find the ending position of the target
    private int findEndingPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;  // Potential end position
                left = mid + 1;  // Continue searching in the right half
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        FindFirstAndLastPos solution = new FindFirstAndLastPos();

        // Example 1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = solution.searchRange(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");  // Output: [3, 4]

        // Example 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = solution.searchRange(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");  // Output: [-1, -1]

        // Example 3
        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = solution.searchRange(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");  // Output: [-1, -1]
    }
}

