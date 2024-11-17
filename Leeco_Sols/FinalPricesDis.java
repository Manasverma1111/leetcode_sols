package com.manas.leetco;

import java.util.Scanner;
import java.util.*;

public class FinalPricesDis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the prices array:");
        int n = scanner.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int[] result = finalPrices(prices);

        System.out.println("Final prices after discount: " + Arrays.toString(result));
        scanner.close();
    }

    public static int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && prices[stack[top]] >= prices[i]) {
                prices[stack[top]] -= prices[i];
                top--;
            }
            stack[++top] = i;
        }

        return prices;
    }
}
