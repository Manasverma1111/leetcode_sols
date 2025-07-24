class Solution {

    public void reverseArr(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        if (k > n) {
            k = k % n;
        }

        reverseArr(nums, 0, n - 1);
        reverseArr(nums, 0, k - 1);
        reverseArr(nums, k, n - 1);

    }
}