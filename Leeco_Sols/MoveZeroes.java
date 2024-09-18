package com.manas.leetco;


public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int nonZeroPos = 0;  // Keeps track of the position to place the next non-zero element

        // Step 1: Move all non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPos] = nums[i];
                nonZeroPos++;
            }
        }

        // Step 2: Fill the remaining positions with zeroes
        for (int i = nonZeroPos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(java.util.Arrays.toString(nums1));  // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(java.util.Arrays.toString(nums2));  // Output: [0]
    }
}
