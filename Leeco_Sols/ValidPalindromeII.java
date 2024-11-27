package com.manas.leetco;

import java.util.Scanner;

public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {

        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string s: ");
        String s = input.next();

        boolean result = validPalindrome(s);
        System.out.print("The given string is a palindrome: " + result);
        input.close();
    }
}
