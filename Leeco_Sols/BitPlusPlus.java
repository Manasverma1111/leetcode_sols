package com.manas.leetco;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = 0;
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String statement = scanner.nextLine();

            if (statement.contains("++")) {
                x++;
            } else if (statement.contains("--")) {
                x--;
            }
        }

        System.out.println(x);

        scanner.close();
    }
}

