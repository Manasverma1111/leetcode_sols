1class Solution {
2    public int hammingWeight(int n) {
3        
4        int count = 0;
5        while(n != 0) {
6            n = n & (n - 1);
7            count++;
8            n /= 2;
9        }
10
11        return count;
12    }
13}