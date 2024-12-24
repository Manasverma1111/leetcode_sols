class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int maxUnits = 0;

        for (int[] box : boxTypes) {
            int numberOfBoxes = box[0];
            int numberOfUnitsPerBox = box[1];

            int boxToTake = Math.min(truckSize, numberOfBoxes);

            maxUnits += boxToTake * numberOfUnitsPerBox;

            truckSize -= boxToTake;
            if (truckSize == 0) {
                break;
            }
        }

        return maxUnits;
    }
}
