1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int idx = 0;
4        for(int i=0; i<nums.length; i++){
5            if(nums[i] != val){
6                nums[idx] = nums[i];
7                idx++;
8            }
9        }
10        return idx;
11    }
12}