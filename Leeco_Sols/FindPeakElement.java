package com.manas.leetco;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is less than mid + 1, peak must be on the right side
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                // Otherwise, the peak is on the left side (or mid itself)
                right = mid;
            }
        }

        // When left == right, we found a peak element
        return left;
    }

    public static void main(String[] args) {
        FindPeakElement solution = new FindPeakElement();

        // Example 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Output: " + solution.findPeakElement(nums1));  // Output: 2

        // Example 2
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Output: " + solution.findPeakElement(nums2));  // Output: 1 or 5
    }
}

