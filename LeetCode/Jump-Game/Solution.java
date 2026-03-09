1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxReach = 0; 
4        int target = nums.length - 1; 
5        for (int i = 0; i <= maxReach; i++) {
6            maxReach = Math.max(maxReach, i + nums[i]);
7
8            if (maxReach >= target) {
9                return true;
10            }
11        }
12
13        return false;
14    }
15}