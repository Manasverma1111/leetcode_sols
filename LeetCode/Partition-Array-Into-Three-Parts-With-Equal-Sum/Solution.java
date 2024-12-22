class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int totalSum = 0;

        for(int num : arr) {
            totalSum += num;
        }

        if (totalSum % 3 != 0) {
            return false;
        }

        int targetSum = totalSum / 3;
        int currSum = 0, partFound = 0;

        for (int num : arr) {
            currSum += num;
            if (currSum == targetSum) {
                partFound++;
                currSum = 0;
            } 
        }

        if (partFound >= 3) {
            return true;
        }

        return false;
    }
}
