class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        Arrays.sort(arr2);
        int dist = 0;

        for (int num1 : arr1) {
            if (isValid(num1, arr2, d)) {
                dist++;
            }
        }

        return dist;
    }

    private static boolean isValid(int num1, int[] arr2, int d) {
        int left = 0, right = arr2.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (Math.abs(num1 - arr2[mid]) <= d) {
                return false;
            } else if (arr2[mid] < num1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return true;
    }
}
