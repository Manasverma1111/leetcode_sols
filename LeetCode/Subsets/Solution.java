class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        genSubSets(0, nums, new ArrayList<>(), res);
        return res;
    }

    private void genSubSets(int indx, int[] nums, List<Integer> curr,List<List<Integer>> res) {

        if (indx == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[indx]);
        genSubSets(indx + 1, nums, curr, res);

        curr.remove(curr.size() - 1);
        genSubSets(indx + 1, nums, curr, res);
    }
}