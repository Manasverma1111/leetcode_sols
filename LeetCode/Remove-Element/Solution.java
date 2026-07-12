1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int i = 0;
4
5        for (int j = 0; j < nums.length; j++) {
6            if (nums[j] != val) {
7                nums[i] = nums[j];
8                i++;
9            }
10        }
11
12        return i;
13    }
14}