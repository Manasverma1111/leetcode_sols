class Solution {
    public int maxScore(String s) {
        
        int n = s.length();
        int maxScore = 0;
        int totalOnes = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                totalOnes++;
            }
        }

        int leftZeroes = 0;
        int rightOnes = totalOnes;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeroes++;
            } else {
                rightOnes--;
            }

        int currSum = leftZeroes + rightOnes;
        maxScore = Math.max(maxScore, currSum);
        }

        return maxScore;
    }
}
