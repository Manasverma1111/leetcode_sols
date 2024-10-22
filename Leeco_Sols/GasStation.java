package com.manas.leetco;

import java.util.Scanner;

public class GasStation {
    public int canComp(int[] gas, int[] cost) {
        int pos = -1;
        int curr = 0;
        int total = 0;

        for(int i = 0; i<gas.length; i++) {
            int diff = gas[i] - cost[i];

            curr += diff;
            total += diff;

            if(curr<0) {
                curr = 0;
                pos = i;
            }
        }

        if(total >= 0) {
            return pos + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of gas stations: ");
        int n = sc.nextInt();

        int[] gas = new int[n];
        int[] cost = new int[n];

        System.out.println("Enter the gas array: ");
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }

        System.out.println("Enter the cost array: ");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        GasStation sol = new GasStation();
        int result = sol.canComp(gas, cost);

        if (result == -1) {
            System.out.println("It's not possible to complete the circuit.");
        } else {
            System.out.println("You can start the circuit from station: " + result);
        }

        sc.close();
    }
}
