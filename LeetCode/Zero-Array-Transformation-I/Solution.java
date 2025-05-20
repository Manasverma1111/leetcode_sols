class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        
        int n = nums.length;
        int[] diff = new int[n + 1];

        for (int[] q : queries) {
            int l = q[0], r = q[1];
            diff[l] += 1;
            if (r + 1 < n) diff[r + 1] -= 1;
        }

        int[] available = new int[n];
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            available[i] = curr;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > available[i]) return false;
        }

        return true;
    }
}