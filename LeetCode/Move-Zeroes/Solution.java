1class Solution {
2    public void moveZeroes(int[] nums) {
3        
4        int n = nums.length;
5        int count = 0;
6        for (int i = 0; i < n; i++) {
7            if (nums[i] != 0) {
8                int temp = nums[i];
9                nums[i] = nums[count];
10                nums[count] = temp;
11                count++;
12            }
13        }
14
15    }
16}