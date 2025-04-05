class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[]nums, int index, int currXOR) {
        if (index == nums.length){
            return currXOR;
        }

        int include = dfs(nums, index + 1, currXOR ^ nums[index]);
        int exclude = dfs(nums, index + 1, currXOR);

        return include + exclude;
    }
}
