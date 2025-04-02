public class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxValue = 0;
        int n = nums.length;
        
        for (int k = 2; k < n; k++) {
            long maxDiff = 0;
            int maxI = nums[0];
            
            for (int j = 1; j < k; j++) {
                maxDiff = Math.max(maxDiff, maxI - nums[j]);
                maxI = Math.max(maxI, nums[j]);
            }
            
            long currentValue = maxDiff * nums[k];
            maxValue = Math.max(maxValue, currentValue);
        }
        
        return maxValue;
    }
}
