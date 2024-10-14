package com.manas.leetco;

public class ExcelColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int columnNumber = 0;

        // Process each character in the columnTitle
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            // Convert character to its corresponding number ('A' -> 1, 'B' -> 2, ..., 'Z' -> 26)
            int value = c - 'A' + 1;
            // Update the column number (simulating base-26 number)
            columnNumber = columnNumber * 26 + value;
        }

        return columnNumber;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(titleToNumber("A"));   // Output: 1
        System.out.println(titleToNumber("AB"));  // Output: 28
        System.out.println(titleToNumber("ZY"));  // Output: 701
    }
}
