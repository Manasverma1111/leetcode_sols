package com.manas.leetco;

import java.util.Scanner;

public class RevPrefixOfWord {
    public static String revString(String word, char ch) {

        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        StringBuilder reversed = new StringBuilder(word.substring(0, index + 1));
        reversed.reverse();

        return reversed.toString() + word.substring(index + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter word in lowercase only: ");
        String word = input.next();

        System.out.print("Enter Character char: ");
        char ch = input.next().charAt(0);

        String res = revString(word, ch);
        System.out.println("Reversed String: " + res);
        input.close();
    }
}
