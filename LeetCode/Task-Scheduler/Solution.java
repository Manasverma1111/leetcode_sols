class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] tasksFreq = new int[26];
        for(char task : tasks){
            tasksFreq[task - 'A']++;
        }
        int maxFreq = 0;
        for(int freq : tasksFreq){
            maxFreq = Math.max(freq, maxFreq);
        }

        int maxCount = 0;
        for(int freq : tasksFreq){
            if(maxFreq == freq){
                maxCount++;
            }
        }
        return Math.max(tasks.length, (maxFreq - 1) * (n + 1) + maxCount);
    }
}
