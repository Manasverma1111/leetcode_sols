class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        int onesPicked = Math.min(numOnes, k);
        k -= onesPicked;

        int zerosPicked = Math.min(numZeros, k);
        k -= zerosPicked;

        int numNegPicked = Math.min(numNegOnes, k);
        return onesPicked - numNegPicked;
        
    }
}