class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        
        int MOD = 1000000007;
        int[] dp = new int[high + 1];
        dp[0] = 1;

        for (int i = 0; i <= high; i++) {
            if (i >= zero) {
                dp[i] = (dp[i] + dp[i - zero]) % MOD;
            }
            if (i >= one) {
                dp[i] = (dp[i] + dp[i - one]) % MOD;
            }
        }

        int res = 0;
        for (int i = low; i <= high; i++) {
            res = (res + dp[i]) % MOD;
        }

        return res;
    }
}
