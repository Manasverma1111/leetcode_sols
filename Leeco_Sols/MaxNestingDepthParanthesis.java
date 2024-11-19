package com.manas.leetco;

import java.util.Scanner;

public class MaxNestingDepthParanthesis {
    public static int maxNestingDepth(String s) {
        int currDepth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                currDepth++;
                maxDepth = Math.max(maxDepth, currDepth);
            } else if (ch == ')') {
                currDepth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a valid paranthesis string s: ");
        String s = input.next();

        int result = maxNestingDepth(s);
        System.out.print("Max depth is: " + result);

        input.close();
    }
}
