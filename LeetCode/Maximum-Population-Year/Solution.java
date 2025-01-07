class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int[] years = new int[2051];

        for (int[] log : logs) {
            years[log[0]]++;
            years[log[1]]--;
        }

        int maxPop = 0;
        int maxYear = 1950;
        int currPop = 0;

        for (int i = 1950; i < 2051; i++) {
            currPop += years[i];

            if (currPop > maxPop) {
                maxPop = currPop;
                maxYear = i;
            }
        }

        return maxYear;
    }
}
