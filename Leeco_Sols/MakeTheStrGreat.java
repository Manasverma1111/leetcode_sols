package com.manas.leetco;

import java.util.Scanner;

public class MakeTheStrGreat {
    public static String greatString(String s) {

        StringBuilder stk = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (stk.length() > 0 && Math.abs(stk.charAt(stk.length() - 1) - ch) == 32) {
                stk.deleteCharAt(stk.length() - 1);
            } else {
                stk.append(ch);
            }
        }

        return stk.toString();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string s: ");
        String s = input.next();

        String result = greatString(s);
        System.out.println("Great String: " + result);

        input.close();
    }
}
