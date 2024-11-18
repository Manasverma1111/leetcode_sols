package com.manas.leetco;

import java.util.Scanner;

public class ClearDigits {
    public static String removeDigits(String s) {

        StringBuilder stk = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                stk.deleteCharAt(stk.length() - 1);
            } else {
                stk.append(ch);
            }
        }

        return stk.toString();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = input.next();

        String res = removeDigits(s);
        System.out.print("resulting string: " + res);

        input.close();
    }
}
