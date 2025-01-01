class Solution {
    public double trimMean(int[] arr) {
        
        Arrays.sort(arr);
        int n = arr.length;
        int trimSize = n / 20;

        double sum = 0;
        for (int i = trimSize; i < n - trimSize; i++) {
            sum += arr[i];
        }

        return sum / (n - 2 * trimSize);
    }
}
