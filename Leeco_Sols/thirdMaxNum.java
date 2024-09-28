package com.manas.leetco;

public class thirdMaxNum {

    public int thirdMax(int[] nums) {
        // Initialize three variables to track the top three distinct maximums
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        // Traverse the array to find the distinct maximums
        for (Integer num : nums) {
            // Skip the number if it is already a maximum
            if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }

            // Update the maximums if necessary
            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        // Return thirdMax if it exists, otherwise return firstMax
        return thirdMax == null ? firstMax : thirdMax;
    }

    public static void main(String[] args) {
        thirdMaxNum solution = new thirdMaxNum();

        int[] nums1 = {3, 2, 1};
        System.out.println(solution.thirdMax(nums1));  // Output: 1

        int[] nums2 = {1, 2};
        System.out.println(solution.thirdMax(nums2));  // Output: 2

        int[] nums3 = {2, 2, 3, 1};
        System.out.println(solution.thirdMax(nums3));  // Output: 1
    }
}
