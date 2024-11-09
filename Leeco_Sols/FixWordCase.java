package com.manas.leetco;

import java.util.Scanner;

public class FixWordCase {
    public static String fixCase(String s) {

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for(char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else {
                lowerCaseCount++;
            }
        }

        if (upperCaseCount > lowerCaseCount) {
            return s.toUpperCase();
        } else  {
            return s.toLowerCase();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String of latin letters in mix case s: ");
        String s = input.nextLine();

        System.out.print("new string is: " + fixCase(s));
        input.close();
    }
}
