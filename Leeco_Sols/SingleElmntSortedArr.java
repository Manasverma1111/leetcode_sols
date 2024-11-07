package com.manas.leetco;

import java.util.Scanner;

public class SingleElmntSortedArr {
    public int singleElementSortedArray(int[] nums) {

        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int mid = left+(right-left)/2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid+1]) {
                left = mid+2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        if (n%2 == 0) {
            System.out.println("Enter the odd length array only");
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter the elements in sorted order: ");

        for (int i =0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        SingleElmntSortedArr sol = new SingleElmntSortedArr();
        int singleElmnt = sol.singleElementSortedArray(nums);

        System.out.print("Single element is: " + singleElmnt);
        input.close();
    }
}
