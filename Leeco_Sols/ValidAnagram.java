package com.manas.leetco;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // If the lengths of the strings are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isAnagram("anagram", "nagaram")); // Output: true
        System.out.println(isAnagram("rat", "car"));         // Output: false
    }
}
