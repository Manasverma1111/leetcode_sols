class Solution {
    public void wiggleSort(int[] nums) {
        
        Arrays.sort(nums);

        int n = nums.length;
        int[] res = new int[n];

        int smallHalf = (n - 1) / 2;
        int largeHalf = (n -1);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                res[i] = nums[smallHalf--];
            } else {
                res[i] = nums[largeHalf--];
            }
        }

        System.arraycopy(res, 0, nums, 0, n);
    }
}
