1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9
10            if (nums[mid] < target) {
11                left = mid + 1;
12            } else {
13                right = mid - 1;
14            }
15        }
16
17        return left;
18    }
19}