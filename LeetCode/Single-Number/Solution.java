1class Solution {
2    public int singleNumber(int[] nums) {
3        
4        int n = nums.length;
5
6        int xor = 0;
7        for (int i = 0; i < n; i++) {
8            xor ^= nums[i];
9        }
10
11        return xor;
12    }
13}