package com.manas.leetco;
import java.util.Scanner;

public class Power {
    public double myPow(double x, int n) {

        long N = n;

        if(n < 0) {
            N = -N;
            x = 1/x;
        }
        return res(x, N);
    }

    private double res(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double half = res(x, n/2);

        if(n%2 == 0) {
            return half*half;
        } else {
            return half*half*x;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base x: ");
        double x = input.nextInt();

        System.out.print("Enter the power n: ");
        int n = input.nextInt();

        Power solution = new Power();
        double res = solution.myPow(x, n);
        System.out.print(res);

        input.close();
    }
}
