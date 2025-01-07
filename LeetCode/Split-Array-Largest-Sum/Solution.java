class Solution {
    public int splitArray(int[] nums, int k) {
        
        int left = 0;
        int right = 0;

        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {
            int mid = left+(right - left)/2;

            if(canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }

    public boolean canSplit(int[] nums, int k, int maxSum) {

        int subArrCount = 1;
        int currSum = 0;

        for (int num : nums) {
            if (currSum + num > maxSum) {
                subArrCount++;
                currSum = num;

                if (subArrCount > k) {
                    return false;
                }
            } else {
                currSum += num;
            }
        }

        return true;
    }
}
