class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    
       if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
        return 0;
    }

    int[] dp = new int[n];
    dp[0] = 1;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[i][j] == 1) {
                dp[j] = 0;
            } else if (j > 0) {
                dp[j] += dp[j - 1];
            }
        }
    }

    return dp[n - 1];
    }
}