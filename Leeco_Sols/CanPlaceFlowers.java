package com.manas.leetco;

import java.util.Scanner;

public class CanPlaceFlowers {
    public static boolean canPlace(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len && n > 0; i++) {
            if(flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

                if(leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                    i++;
                }
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of flowerbed m: ");
        int m = input.nextInt();

        System.out.print("Enter the values of flowerbed '0' as not planted and '1' as planted: ");
        int[] flowerbed = new int[m];

        for (int j = 0; j<m; j++) {
            flowerbed[j] = input.nextInt();
        }

        System.out.print("Enter the new flowers to be planted n: ");
        int n = input.nextInt();

        boolean result = canPlace(flowerbed, n);
        System.out.print("Can we plant new flowers: " + result);
        input.close();
    }
}
