class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;
        int jumpCount = 0;
        int end = 0;
        int farthest = 0;

        if (n == 0) {
            return 0;
        }

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == end) {
                jumpCount++;
                end = farthest;
            }
        }

        return jumpCount;
    }
}
