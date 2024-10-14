package com.manas.leetco;

public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();

        while (columnNumber > 0) {
            // Subtract 1 to make it 0-based (1 becomes 0, 2 becomes 1, and so on)
            columnNumber--;
            // Append the corresponding character to the result
            columnTitle.append((char) ('A' + columnNumber % 26));
            // Move to the next digit
            columnNumber /= 26;
        }

        // The result is in reverse order, so reverse it before returning
        return columnTitle.reverse().toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(convertToTitle(1));   // Output: "A"
        System.out.println(convertToTitle(28));  // Output: "AB"
        System.out.println(convertToTitle(701)); // Output: "ZY"
    }
}
