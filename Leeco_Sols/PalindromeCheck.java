package com.manas.leetco;

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        // Step 1: Remove non-alphanumeric characters and convert to lowercase
        StringBuilder filteredString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }
        // Step 2: Check if the filtered string is a palindrome
        String filtered = filteredString.toString();
        int left = 0, right = filtered.length() - 1;

        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(isPalindrome("race a car")); // Output: false
        System.out.println(isPalindrome(" ")); // Output: true
    }
}
