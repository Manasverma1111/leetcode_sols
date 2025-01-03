class Solution {
    public boolean isGood(int[] nums) {
        
        int n = 0;
        for (int num : nums) {
            n = Math.max(n, num);
        }

        if (nums.length != n + 1) {
            return false;
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= n - 1; i++) {
            if (countMap.getOrDefault(i, 0) != 1) {
                return false;
            }
        }
        if (countMap.getOrDefault(n, 0) != 2) { 
            return false;
        }

        return true;
    }
}
