package com.manas.leetco;

import java.util.Scanner;

public class ContMostWater {
    public static int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int currArea = 0;
        int i = 0, j = height.length - 1;

        // Using two pointers to calculate the maximum area
        while (i < j) {
            currArea = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(currArea, maxArea);

            // Move the pointer at the shorter line inward
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of heights
        System.out.print("Enter the number of heights: ");
        int n = scanner.nextInt();

        int[] height = new int[n];

        // Taking input for the heights array
        System.out.println("Enter the heights: ");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        // Creating an instance of the solution class and calling the method
        ContMostWater solution = new ContMostWater();
        int result = solution.maxArea(height);

        // Outputting the result
        System.out.println("The maximum area is: " + result);

        scanner.close();  // Closing the scanner
    }
}
