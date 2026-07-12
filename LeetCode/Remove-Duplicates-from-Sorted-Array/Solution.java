1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int j= 1;
4        for (int i=1; i<nums.length; i++){
5            if(nums[i] != nums[i-1]){
6                nums[j] = nums[i];
7                j++;
8            }
9        }
10        return j;
11    }
12}