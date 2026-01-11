1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int n = nums.length;
5        int[] res = new int[n];
6
7        res[0] = 1;
8        for (int i = 1; i < n; i++) {
9            res[i] = res[i - 1] * nums[i -1];
10        }
11
12        int right = 1;
13        for (int i = n - 1; i >= 0; i--) {
14            res[i] *= right;
15            right *= nums[i];
16        }
17
18        return res;
19    }
20}