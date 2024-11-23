package com.manas.leetco;

import java.util.Map;
import java.util.Scanner;

public class MaxRepeatingSubStr {
    public static int countMaxK(String sequence, String word) {

        int n = sequence.length();
        int wLen = word.length();

        int[] dp = new int[n + 1];
        int maxK = 0;

        for (int i = wLen - 1; i< n; i++) {
            String currSeq = sequence.substring(i - wLen + 1, i + 1);

            if (currSeq.equals(word)) {
                dp[i + 1] = dp[i + 1 - wLen] + 1;
                maxK = Math.max(maxK, dp[i + 1]);
            }
        }

        return maxK;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sequence: ");
        String sequence = input.next();

        System.out.print("Enter a word to match: ");
        String word = input.next();

        int result = countMaxK(sequence, word);
        System.out.print("Output: " + result);
        input.close();
    }
}
