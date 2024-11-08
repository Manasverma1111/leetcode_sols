package com.manas.leetco;

import java.util.Scanner;

public class StonesOnTheTable {
    public static int stonesToRemove(int n,String s) {

        int remStones = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                remStones++;
            }
        }

        return remStones;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of stones n: ");
        int n = input.nextInt();

        System.out.print("Enter The colors string R for red, G for green, B for blue: ");
        String s = input.next();

        int result = stonesToRemove(n, s);
        System.out.print("Number of Stones to remove are: " + result);
        input.close();
    }
}
