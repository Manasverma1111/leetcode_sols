1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        
4        int left = 0;
5        int right = nums.length - 1;;
6
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9            if (nums[mid] < target) {
10                left = mid + 1;
11            } else {
12                right = mid - 1;
13            }
14        }
15
16        return left;
17    }
18}