class Solution {
    public int maxProduct(int[] nums) {
        
        int maxProd = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempMax = currMax;

            currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            currMin = Math.min(nums[i], Math.min(tempMax * nums[i], currMin * nums[i]));

            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }
}
