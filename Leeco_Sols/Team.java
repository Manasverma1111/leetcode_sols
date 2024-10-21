package com.manas.leetco;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of questions: ");
        int n = input.nextInt();

        int[][] quesMatrix = new int[n][3];
        System.out.println("Enter 1 if YES else 0: ");
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<3; j++) {
                quesMatrix[i][j] = input.nextInt();
            }
        }

        int count = 0;

        for(int i = 0; i<n; i++) {
            int sum = 0;
            for(int j = 0; j<3; j++) {
                sum += quesMatrix[i][j];
            }

            if(sum >= 2) {
                count++;
            }
        }

        System.out.println(count);
        input.close();
    }
}
