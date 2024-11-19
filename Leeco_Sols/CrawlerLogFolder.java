package com.manas.leetco;

import java.util.Scanner;

public class CrawlerLogFolder {
    public static int minOperations(String[] logs) {

        int minOpr = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if(minOpr > 0) {
                    minOpr--;
                }
            } else if (log.equals("./")) {
                continue;
            } else {
                minOpr++;
            }
        }

        return minOpr;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of operations (logs): ");
        int n =input.nextInt();

        String[] logs = new String[n];

        System.out.println("Enter the logs: ");
        for (int i = 0; i<n ; i++) {
            logs[i] = input.next();
        }

        int result = minOperations(logs);
        System.out.println("Min number of operations: " + result);
        input.close();
    }
}
