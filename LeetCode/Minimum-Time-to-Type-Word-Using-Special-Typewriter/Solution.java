class Solution {
    public int minTimeToType(String word) {
        
        int totalTime = 0;
        int currPos = 0;

        for ( char ch : word.toCharArray()) {
            int targetPos = ch - 'a';

            int time = Math.min(Math.abs(targetPos - currPos), 26 - Math.abs(targetPos - currPos));

            totalTime += time + 1;
            currPos = targetPos;
        }

        return totalTime;
    }
}
