class Solution {
    public int minOperations(int[] nums, int k) {
        
        Set<Integer> greater = new HashSet<>();

        for (int num : nums) {
            if (num < k) {
                return -1;
            } 
            if (num > k) {
                greater.add(num);
            }
        }

        return greater.size();
    }
}
