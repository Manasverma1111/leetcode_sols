class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n = nums.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int[] res = new int[n];
        int smallerCount = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0 && pairs[i][0] != pairs[i - 1][0]) {
                smallerCount = i;
            }
            res[pairs[i][1]] = smallerCount;
        } 

        return res;
    }
}
