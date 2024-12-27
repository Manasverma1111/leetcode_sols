class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
        int maxScore = 0;
        int prevScore = values[0] + 0;

        for (int i = 1; i < values.length; i++) {
            maxScore = Math.max(maxScore, prevScore + values[i] - i);
            prevScore = Math.max(prevScore, values[i] + i);
        }

        return maxScore;
    }
}
