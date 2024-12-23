class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
        Arrays.sort(nums);
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        List<Integer> subSeq = new ArrayList<>() ;
        int subSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            subSum += nums[i];
            subSeq.add(nums[i]);

            if (subSum > totalSum - subSum) {
                break;
            }
        }

        return subSeq;
    }
}
