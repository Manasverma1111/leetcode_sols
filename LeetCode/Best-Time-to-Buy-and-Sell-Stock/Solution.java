1class Solution {
2    public int maxProfit(int[] prices) {
3        
4        int min = Integer.MAX_VALUE;
5        int max = 0;
6
7        for (int price : prices) {
8            if (price < min) {
9                min = price;
10            } else {
11                max = Math.max(max, price - min);
12            }
13        }
14
15        return max;
16    }
17}