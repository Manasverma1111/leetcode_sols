1class Solution {
2    public int majorityElement(int[] nums) {
3        
4        // Arrays.sort(nums);
5        // int n = nums.length;
6        // return nums[n/2];
7
8        int count = 0;
9        int max = 0;
10
11        for (int i = 0; i < nums.length; i++) {
12            if (count == 0) {
13                max = nums[i];
14            }
15
16            if (nums[i] == max) {
17                count++;
18            } else {
19                count--;
20            }
21        }
22
23        return max;
24    }
25}