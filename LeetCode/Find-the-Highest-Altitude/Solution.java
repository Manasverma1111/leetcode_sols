class Solution {
    public int largestAltitude(int[] gain) {
        
        int maxAlt = 0;
        int currAlt = 0;

        for (int num : gain) {
            currAlt += num;
            maxAlt = Math.max(currAlt, maxAlt);
        }

        return maxAlt;
    }
}
