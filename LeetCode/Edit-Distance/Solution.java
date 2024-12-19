class Solution {
    public int minDistance(String word1, String word2) {
        
         int m = word1.length();
        int n = word2.length();

        if (m > n) {
            String temp = word1;
            word1 = word2;
            word2 = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }

        int[] dp = new int[m + 1];

        for (int i = 0; i <= m; i++) {
            dp[i] = i;
        }

        for (int j = 1; j <= n; j++) {
            int prev = dp[0]; 
            dp[0] = j; 

            for (int i = 1; i <= m; i++) {
                int temp = dp[i]; 
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i] = prev; 
                } else {
                    dp[i] = 1 + Math.min(dp[i - 1], 
                                         Math.min(dp[i], 
                                                  prev)); 
                }
                prev = temp; 
            }
        }

        return dp[m];
    }
}
