class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        Map<String, Integer> memo = new HashMap<>();
        return findWays(nums, 0, 0, target, memo);
    }

    public int findWays(int[] nums, int index, int currSum, int target, Map<String,Integer> memo) {
        if (index == nums.length) {
            return currSum == target ? 1 : 0;
        }

        String key = index + "," + currSum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int sum = findWays(nums, index + 1, currSum + nums[index], target, memo);
        int sub = findWays(nums, index + 1, currSum - nums[index], target, memo);

        int res = sum + sub;
        memo.put(key, res);
        return res;
    }
}
