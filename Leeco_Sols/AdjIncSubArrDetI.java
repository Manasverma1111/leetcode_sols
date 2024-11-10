package com.manas.leetco;

public class AdjIncSubArrDetI {
    public boolean hasAdjacentIncreasingSubarrays(int[] nums, int k) {
        int n = nums.length;

        // Loop through possible starting points for the first subarray
        for (int i = 0; i <= n - 2 * k; i++) {
            // Check if the subarray starting at i is strictly increasing
            if (isStrictlyIncreasing(nums, i, k) && isStrictlyIncreasing(nums, i + k, k)) {
                return true;
            }
        }

        return false;
    }
    private boolean isStrictlyIncreasing(int[] nums, int start, int k) {
        for (int i = start; i < start + k - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AdjIncSubArrDetI solution = new AdjIncSubArrDetI();

        int[] nums1 = {2, 5, 7, 8, 9, 2, 3, 4, 3, 1};
        int k1 = 3;
        System.out.println(solution.hasAdjacentIncreasingSubarrays(nums1, k1));

        int[] nums2 = {1, 2, 3, 4, 4, 4, 4, 5, 6, 7};
        int k2 = 5;
        System.out.println(solution.hasAdjacentIncreasingSubarrays(nums2, k2));
    }
}

