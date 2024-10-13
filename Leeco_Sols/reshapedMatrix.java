package com.manas.leetco;

import java.util.ArrayList;
import java.util.List;

public class reshapedMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;
        }

        // Create the new reshaped matrix
        int[][] reshapedMatrix = new int[r][c];
        int row = 0, col = 0;

        // Traverse the original matrix and fill the reshaped matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshapedMatrix[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return reshapedMatrix;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int r1 = 1, c1 = 4;

        int[][] result1 = matrixReshape(mat1, r1, c1);
        printMatrix(result1);  // Output: [[1, 2, 3, 4]]

        int[][] mat2 = {{1, 2}, {3, 4}};
        int r2 = 2, c2 = 4;

        int[][] result2 = matrixReshape(mat2, r2, c2);
        printMatrix(result2);  // Output: [[1, 2], [3, 4]]
    }

    // Helper function to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

