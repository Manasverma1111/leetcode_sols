class Solution {
    public long countBadPairs(int[] nums) {
        
        Map<Integer, Integer> count = new HashMap<>();
        long totalPairs = (long) nums.length * (nums.length - 1)/2;
        long goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            goodPairs += count.getOrDefault(key, 0);
            count.put(key, count.getOrDefault(key, 0) + 1);
        }

        return totalPairs - goodPairs;
    }
}
