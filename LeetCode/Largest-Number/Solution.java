class Solution {
    public String largestNumber(int[] nums) {
        
        boolean allZero = true;
        for (int num : nums) {
            if (num != 0) {
                allZero = false;
                break;
            }
        }
        if (allZero) return "0";

        String[] numStr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder res = new StringBuilder();
        for (String num : numStr) {
            res.append(num);
        }

        return res.toString();
    }
}
