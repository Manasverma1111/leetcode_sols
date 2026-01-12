1class Solution {
2    public int missingNumber(int[] nums) {
3        
4        int n = nums.length;
5        int XOR = n;
6
7        for (int i = 0; i < n; i++) {
8            XOR ^= i;
9            XOR ^= nums[i];
10        }
11
12        return XOR;
13    }
14}