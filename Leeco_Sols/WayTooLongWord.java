package com.manas.leetco;
import java.util.Scanner;

public class WayTooLongWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        // Reading the number of words
        int n = scanner.nextInt();
        scanner.nextLine();  // To consume the leftover newline character

        // Processing each word
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();

            // If the word length is more than 10, abbreviate it
            if (word.length() > 10) {
                int abbreviationLength = word.length() - 2;
                System.out.println(word.charAt(0) + "" + abbreviationLength + word.charAt(word.length() - 1));
            } else {
                // If the word is not too long, just print it as is
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
