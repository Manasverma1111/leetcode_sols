package com.manas.leetco;

import java.util.Scanner;

public class Search2DArr {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;

        // Binary search to find the row
        while (top <= bottom) {
            int mid = (top + bottom) / 2;

            if (matrix[mid][0] <= target && matrix[mid][matrix[mid].length - 1] >= target) {
                top = mid;
                break;
            } else if (matrix[mid][0] > target) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }

        if (top > bottom) {
            return false;  // Target not in any row
        }

        int row = top;

        // Binary search within the row
        int left = 0;
        int right = matrix[row].length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Input target value
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        // Create an instance of Solution and call the searchMatrix method
        Search2DArr solution = new Search2DArr();
        boolean result = solution.searchMatrix(matrix, target);

        // Output result
        if (result) {
            System.out.println("Target found in the matrix.");
        } else {
            System.out.println("Target not found in the matrix.");
        }

        scanner.close();
    }
}

