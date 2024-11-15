package com.manas.leetco;

import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
    public  int[] count(int n) {

        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i/2] + (i%2);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number between 0 to 100000: ");
        int n = input.nextInt();

        CountingBits res = new CountingBits();
        int[] result = res.count(n);
        System.out.println("Output: " + Arrays.toString(result));
        input.close();
    }
}
