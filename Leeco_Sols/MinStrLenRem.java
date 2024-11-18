package com.manas.leetco;
import java.util.*;

public class MinStrLenRem {
    public static int minLength(String s) {

        StringBuilder stk = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int len = stk.length();

            if (len > 0 &&
                    ((stk.charAt(len - 1) == 'A' && ch == 'B') ||
                    (stk.charAt(len - 1) == 'C' && ch == 'D'))) {
                stk.deleteCharAt(len - 1);
            } else {
                stk.append(ch);
            }
        }

        return stk.length();
    }

    public static void main(String[] args) {

        System.out.print("Enter the string (UPPERCASE letters only): ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        // Validate input
        if (s.matches("[A-Z]+")) {
            // Process and output the result
            int result = minLength(s);
            System.out.println("Minimum possible length: " + result);
        } else {
            System.out.println("Invalid input! Please enter a string with uppercase English letters only.");
        }

        input.close();
    }
}
