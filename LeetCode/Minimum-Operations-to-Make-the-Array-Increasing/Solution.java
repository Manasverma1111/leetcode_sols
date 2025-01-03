class Solution {
    public int minOperations(int[] nums) {
        
        int oprs = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int incr = nums[i - 1] - nums[i] + 1;
                nums[i] += incr;
                oprs += incr;
            }
        }

        return oprs;
    }
}
