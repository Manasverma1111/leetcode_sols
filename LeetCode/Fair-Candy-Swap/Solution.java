class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();

        int diff = (aliceSum - bobSum) / 2;

        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int i = 0, j = 0;
        while (i < aliceSizes.length && j < bobSizes.length) {
            int currDiff = aliceSizes[i] - bobSizes[j];
            if (currDiff == diff) {
                return new int[]{aliceSizes[i], bobSizes[j]};
            } else if (currDiff < diff) {
                i++;
            } else {
                j++;
            }
        }

        return new int[0];
    }
}
