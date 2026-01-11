1class Solution {
2    public void moveZeroes(int[] nums) {
3        
4        int nonZeroPos = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            if(nums[i] != 0){
8                nums[nonZeroPos] = nums[i];
9                nonZeroPos++;
10            }
11        }
12
13        for (int i = nonZeroPos; i < nums.length; i++) {
14            nums[i] = 0;
15        }
16    }
17}