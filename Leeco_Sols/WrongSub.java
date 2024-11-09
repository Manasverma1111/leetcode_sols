package com.manas.leetco;

import java.util.Scanner;

public class WrongSub {
    public static int tanyaSub (int n, int k) {

        for (int i = 0; i < k; i++) {
            if (n % 10 ==0) {
                n /= 10;
            } else {
                n -= 1;
            }
        }

        return n;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to subtract n: ");
        int n = input.nextInt();

        System.out.print("Enter the number of times to subtract k: ");
        int k = input.nextInt();

        System.out.println(tanyaSub(n, k));
        input.close();
    }
}
