package com.manas.leetco;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = input.nextInt();
        System.out.print("Enter the kth place score: ");
        int k = input.nextInt();

        System.out.println("Enter the scores: ");
        int[] scores = new int[n];
        for(int i = 0; i<n; i++) {
            scores[i] = input.nextInt();
        }

        int kthPlace = scores[k-1];
        int count = 0;

        for(int i = 0; i<n; i++) {
            if(scores[i] >= kthPlace && scores[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
