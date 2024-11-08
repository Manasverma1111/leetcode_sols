package com.manas.leetco;

import java.util.Scanner;

public class Elephant {
    public static int minSteps (int x) {
        int steps = x/5;

        if (x % 5 != 0) {
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance x: ");
        int x = input.nextInt();

        int result = minSteps(x);
        System.out.print("minimum number of steps are: " + result);
        input.close();
    }
}
