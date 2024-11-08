package com.manas.leetco;

import java.util.Scanner;

public class NearlyLuckyNum {
    public static String checkLuckyNum (Long n) {
        String numStr = Long.toString(n);
        int luckyDigCount = 0;

        for (char digit : numStr.toCharArray()) {
            if (digit == '4' || digit == '7') {
                luckyDigCount++;
            }
        }

        if (luckyDigCount == 4 || luckyDigCount == 7) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number n: ");
        Long n = input.nextLong();

        System.out.print(checkLuckyNum(n));
        input.close();
    }
}
