package com.manas.leetco;

import java.util.Scanner;

public class SmallestLetterGThn {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }

        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target >= letters[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[left];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmallestLetterGThn solution = new SmallestLetterGThn();

        // Take input for letters array
        System.out.print("Enter letters (as a single string without spaces, e.g., abcdefg): ");
        String lettersInput = scanner.nextLine();
        char[] letters = lettersInput.toCharArray();

        // Take input for target character
        System.out.print("Enter the target character: ");
        char target = scanner.next().charAt(0);

        // Find the next greatest letter
        char result = solution.nextGreatestLetter(letters, target);
        System.out.println("The next greatest letter is: " + result);

        scanner.close();
    }
}

