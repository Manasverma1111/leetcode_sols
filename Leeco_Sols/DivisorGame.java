package com.manas.leetco;

public class DivisorGame {
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[n + 1];

        dp[1] = false;

        for (int i = 2; i <= n; i++) {
            // Check divisors of i
            for (int x = 1; x < i; x++) {
                if (i % x == 0 && !dp[i - x]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        DivisorGame game = new DivisorGame();

        System.out.println(game.divisorGame(2));  // Output: true

        System.out.println(game.divisorGame(3));  // Output: false
    }
}

