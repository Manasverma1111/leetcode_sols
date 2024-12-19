class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        int maxChunk = 0;
        int currMax = 0;

        for (int i = 0; i < arr.length; i++) {
            currMax = Math.max(currMax, arr[i]);

            if (currMax == i) {
                maxChunk++;
            }
        }

        return maxChunk;
    }
}
