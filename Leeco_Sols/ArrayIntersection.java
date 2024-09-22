package com.manas.leetco;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Use a HashSet to store the unique elements from nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Use another HashSet to store the intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nums1
        System.out.print("Enter the number of elements in nums1: ");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter the elements of nums1: ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Input nums2
        System.out.print("Enter the number of elements in nums2: ");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter the elements of nums2: ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        // Get intersection
        int[] result = intersection(nums1, nums2);

        // Print the result
        System.out.println("Intersection: " + Arrays.toString(result));

        scanner.close();
    }
}

