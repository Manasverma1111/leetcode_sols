class Solution {
    public int minimumCost(int[] nums) {
        
       int n = nums.length;
        int[][] dp = new int[n + 1][4];
        
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= 3; k++) {
                dp[i][k] = Integer.MAX_VALUE / 2;
            }
        }

        dp[0][0] = 0;

        for (int k = 1; k <= 3; k++) {
            for (int i = k; i <= n; i++) {
                for (int j = k; j <= i; j++) {
                    dp[i][k] = Math.min(dp[i][k], dp[j - 1][k - 1] + nums[j - 1]);
                }
            }
        }

        return dp[n][3];
    }
}
