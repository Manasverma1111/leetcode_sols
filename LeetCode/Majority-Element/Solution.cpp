class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        Integer majority = null;
        for(int num : nums){
            if(count  == 0){
                majority = num;
            }

            count += (majority == num) ? 1 : -1;
        }
        
        return majority;
    }
}