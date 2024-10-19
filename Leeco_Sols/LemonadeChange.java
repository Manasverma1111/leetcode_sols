package com.manas.leetco;

import java.util.Scanner;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int fiveDollars = 0, tenDollars = 0;

        // Iterate through each bill
        for (int dollar : bills) {
            if (dollar == 5) {
                fiveDollars++;  // Increase the count of $5 bills
            } else if (dollar == 10) {
                // Try to give change using a $5 bill
                if (fiveDollars > 0) {
                    fiveDollars--;
                    tenDollars++;
                } else {
                    return false;  // Can't provide change
                }
            } else {
                // Try to give change using one $10 and one $5 bill
                if (fiveDollars > 0 && tenDollars > 0) {
                    fiveDollars--;
                    tenDollars--;
                }
                // Or try to give change using three $5 bills
                else if (fiveDollars > 2) {
                    fiveDollars -= 3;
                } else {
                    return false;  // Can't provide change
                }
            }
        }

        return true;  // Return true if all customers are served with correct change
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number of customers and their bills as input
        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();

        int[] bills = new int[n];
        System.out.println("Enter the bills (5, 10, or 20): ");
        for (int i = 0; i < n; i++) {
            bills[i] = scanner.nextInt();
        }

        // Creating an instance of the solution class and calling the method
        LemonadeChange solution = new LemonadeChange();
        boolean canGiveChange = solution.lemonadeChange(bills);

        // Outputting the result
        if (canGiveChange) {
            System.out.println("All customers received correct change.");
        } else {
            System.out.println("Cannot provide correct change to all customers.");
        }

        scanner.close();  // Closing the scanner
    }
}

