package com.manas.leetco;

import java.util.Scanner;

public class SoldierAndBananas {
    public static int borrowMoney(int k, int n, int w) {

        int totalCost = k * w *(w + 1)/2;

        int borrowAmount = Math.max(0, totalCost - n);

        return borrowAmount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cost of first banana k: ");
        int k = input .nextInt();

        System.out.print("Enter the total initial money n: ");
        int n = input .nextInt();

        System.out.print("Enter the number of bananas to buy w: ");
        int w = input .nextInt();

        System.out.print("Money needed to borrow: " + borrowMoney(k, n, w));
        input.close();
    }
}
