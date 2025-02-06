class Solution {
    public int tupleSameProduct(int[] nums) {
       Map<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                int freq = productCount.getOrDefault(product, 0);
                count += 8 * freq;
                
                productCount.put(product, freq + 1);
            }
        }

        return count;
    }
}
