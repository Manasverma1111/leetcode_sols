class Solution {
    public int uniquePaths(int m, int n) {
        
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int j = 1; j < m; j++) {
            for (int k = 1; k < n; k++) {
                dp[k] += dp[k - 1];
            }
        }

        return dp[n - 1];
    }
}