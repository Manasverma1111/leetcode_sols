package com.manas.leetco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
    public List<String> findWords(String[] words) {
        // Define sets for each keyboard row
        Set<Character> row1 = new HashSet<>(); // qwertyuiop
        Set<Character> row2 = new HashSet<>(); // asdfghjkl
        Set<Character> row3 = new HashSet<>(); // zxcvbnm

        for (char c : "qwertyuiop".toCharArray()) {
            row1.add(c);
        }
        for (char c : "asdfghjkl".toCharArray()) {
            row2.add(c);
        }
        for (char c : "zxcvbnm".toCharArray()) {
            row3.add(c);
        }

        List<String> result = new ArrayList<>();

        // Check each word
        for (String word : words) {
            String lowerWord = word.toLowerCase(); // Convert to lowercase for uniformity
            char firstChar = lowerWord.charAt(0);
            Set<Character> currentRow = null;

            // Determine which row the first character belongs to
            if (row1.contains(firstChar)) {
                currentRow = row1;
            } else if (row2.contains(firstChar)) {
                currentRow = row2;
            } else if (row3.contains(firstChar)) {
                currentRow = row3;
            }

            // Check if all characters belong to the same row
            if (currentRow != null) {
                boolean valid = true;
                for (int i = 1; i < lowerWord.length(); i++) {
                    if (!currentRow.contains(lowerWord.charAt(i))) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    result.add(word);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        KeyboardRow keyboardRow = new KeyboardRow();

        // Example 1
        String[] words1 = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(keyboardRow.findWords(words1)); // Output: ["Alaska", "Dad"]

        // Example 2
        String[] words2 = {"omk"};
        System.out.println(keyboardRow.findWords(words2)); // Output: []

        // Example 3
        String[] words3 = {"adsdf", "sfd"};
        System.out.println(keyboardRow.findWords(words3)); // Output: ["adsdf", "sfd"]
    }
}
