package com.manas.leetco;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Array to count the frequency of each character in magazine
        int[] charCount = new int[26];

        // Count the frequency of characters in magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Check if ransomNote can be constructed from magazine
        for (char c : ransomNote.toCharArray()) {
            // If there are no characters left to use in magazine, return false
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            // Use one occurrence of the character from magazine
            charCount[c - 'a']--;
        }

        return true;  // All characters in ransomNote have been matched
    }

    public static void main(String[] args) {
        RansomNote solution = new RansomNote();

        System.out.println(solution.canConstruct("a", "b"));

        System.out.println(solution.canConstruct("aa", "ab"));

        System.out.println(solution.canConstruct("aa", "aab"));
    }
}

