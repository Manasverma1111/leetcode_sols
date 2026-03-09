1class Solution {
2    public boolean canJump(int[] nums) {
3        
4         int maxReach = 0; 
5
6        for (int i = 0; i < nums.length; i++) {
7            if (i > maxReach) {
8                return false;
9            }
10
11            maxReach = Math.max(maxReach, i + nums[i]);
12
13            if (maxReach >= nums.length - 1) {
14                return true;
15            }
16        }
17
18        return false; 
19    }
20}