package com.manas.leetco;

import java.util.List;

public class AdjIncSubArrDetII {
    public int maxLengthOfAdjacentIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();

        if (n < 2) {
            return 0;
        }

        // Step 1: Precompute the length of strictly increasing sequences starting at each index
        int[] increasingLengths = new int[n];
        increasingLengths[n - 1] = 1;  // Last element has increasing length of 1
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                increasingLengths[i] = increasingLengths[i + 1] + 1;
            } else {
                increasingLengths[i] = 1;
            }
        }
        // Step 2: Use binary search on k
        int left = 1, right = n / 2;
        int maxK = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (hasAdjacentIncreasingSubarrays(increasingLengths, mid)) {
                maxK = mid;  // mid is a valid length, so try for a longer length
                left = mid + 1;
            } else {
                right = mid - 1;  // mid is too long, reduce length
            }
        }

        return maxK;
    }

    private boolean hasAdjacentIncreasingSubarrays(int[] increasingLengths, int k) {
        for (int i = 0; i <= increasingLengths.length - 2 * k; i++) {
            // Check if both subarrays of length k are strictly increasing
            if (increasingLengths[i] >= k && increasingLengths[i + k] >= k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AdjIncSubArrDetII solution = new AdjIncSubArrDetII();

        List<Integer> nums1 = List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        System.out.println(solution.maxLengthOfAdjacentIncreasingSubarrays(nums1));

        List<Integer> nums2 = List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7);
        System.out.println(solution.maxLengthOfAdjacentIncreasingSubarrays(nums2));

        List<Integer> nums3 = List.of(-15, 19);
        System.out.println(solution.maxLengthOfAdjacentIncreasingSubarrays(nums3)); 
    }
}

