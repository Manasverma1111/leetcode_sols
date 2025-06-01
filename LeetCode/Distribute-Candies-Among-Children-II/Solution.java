class Solution {
    public long distributeCandies(int n, int limit) {
        
        long totalWays = 0;

        for (int i = 0; i <= Math.min(n, limit); i++) {
            int min = Math.max(0, n - i - limit);
            int max = Math.min(limit, n - i);

            if (min <= max) {
                totalWays += (long)(max - min + 1);
            }
        }

        return totalWays;
    }
}