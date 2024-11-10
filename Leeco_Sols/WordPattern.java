package com.manas.leetco;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        // Split the string s into words
        String[] words = s.split(" ");

        // If the number of words does not match the length of the pattern, return false
        if (words.length != pattern.length()) {
            return false;
        }

        // Maps to store the letter to word and word to letter mappings
        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();

        // Iterate over the pattern and the corresponding words in s
        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            // Check the mapping from pattern to word
            if (patternToWord.containsKey(currentChar)) {
                if (!patternToWord.get(currentChar).equals(currentWord)) {
                    return false;  // Mismatch in pattern-to-word mapping
                }
            } else {
                patternToWord.put(currentChar, currentWord);  // Add the mapping
            }

            // Check the reverse mapping from word to pattern
            if (wordToPattern.containsKey(currentWord)) {
                if (wordToPattern.get(currentWord) != currentChar) {
                    return false;  // Mismatch in word-to-pattern mapping
                }
            } else {
                wordToPattern.put(currentWord, currentChar);  // Add the reverse mapping
            }
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern solution = new WordPattern();

        // Test case 1: pattern = "abba", s = "dog cat cat dog"
        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));  // Output: true

        // Test case 2: pattern = "abba", s = "dog cat cat fish"
        System.out.println(solution.wordPattern("abba", "dog cat cat fish"));  // Output: false

        // Test case 3: pattern = "aaaa", s = "dog cat cat dog"
        System.out.println(solution.wordPattern("aaaa", "dog cat cat dog"));  // Output: false
    }
}

