1class Solution {
2    public int minOperations(int[] nums, int k) {
3        
4        int sum = 0;
5        for (int num : nums) {
6            sum += num;
7        }
8
9        return sum % k;
10    }
11}