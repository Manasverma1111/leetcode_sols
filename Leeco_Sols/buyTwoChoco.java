package com.manas.leetco;
import java.util.Scanner;

public class buyTwoChoco {
    public static int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (prices[i] < min1) {
                min2 = min1;
                min1 = prices[i];
            } else if (prices[i] < min2) {
                min2 = prices[i];
            }
        }

        if (min1 + min2 <= money) {
            return money - (min1 + min2);
        } else {
            return money;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter the prices of chocolates: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        System.out.print("Enter the amount of money you have: ");
        int money = scanner.nextInt();

        buyTwoChoco solution = new buyTwoChoco();
        int leftoverMoney = solution.buyChoco(prices, money);

        System.out.println("Leftover money: " + leftoverMoney);

        scanner.close();
    }
}

