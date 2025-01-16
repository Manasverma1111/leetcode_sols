class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = Integer.MIN_VALUE;
        for (int[] num1 : accounts) {
            int sum = 0;
            for (int num2 : num1) {
                sum += num2;
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
