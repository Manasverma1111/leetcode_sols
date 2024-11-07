package com.manas.leetco;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;

        if (n1 > n2)
            return findMedianSortedArrays(nums2, nums1);

        int n = n1 + n2;
        int left = (n1 + n2 + 1) / 2;
        int low = 0, high = n1;

        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE, r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if (mid1 < n1)
                r1 = nums1[mid1];
            if (mid2 < n2)
                r2 = nums2[mid2];
            if (mid1 - 1 >= 0)
                l1 = nums1[mid1 - 1];
            if (mid2 - 1 >= 0)
                l2 = nums2[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return ((double)(Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            }
            else if (l1 > r2) {
                high = mid1 - 1;
            }
            else {
                low = mid1 + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first sorted array
        System.out.print("Enter the number of elements in the first array: ");
        int m = scanner.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter elements of the first sorted array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Input for the second sorted array
        System.out.print("Enter the number of elements in the second array: ");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter elements of the second sorted array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        // Create an instance of the Solution class and find the median
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        double median = solution.findMedianSortedArrays(nums1, nums2);

        System.out.printf("The median of the two sorted arrays is: %.5f%n", median);

        scanner.close();
    }
}

