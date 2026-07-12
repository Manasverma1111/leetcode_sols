1class Solution {
2    public int removeDuplicates(int[] nums) {
3        
4        if (nums.length == 0) {
5            return 0;
6        }
7
8        int i = 0;
9        for (int j = 1; j < nums.length; j++) {
10            if (nums[i] != nums[j]) {
11                i++;
12                nums[i] = nums[j];
13            }
14
15        }
16
17        return i + 1;
18    }
19}