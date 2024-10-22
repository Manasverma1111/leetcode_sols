package com.manas.leetco;

import java.util.Scanner;

public class SepBlacknWhite {
    public long minSwaps(String s) {
        int blackCount = 0;
        int minSwaps = 0;

        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '0') {
                minSwaps += (long) blackCount;
            } else {
                blackCount++;
            }
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string (only '0's and '1's): ");
        String input = scanner.nextLine();

        SepBlacknWhite solution = new SepBlacknWhite();
        long result = solution.minSwaps(input);

        System.out.println("Minimum swaps needed: " + result);
    }
}
