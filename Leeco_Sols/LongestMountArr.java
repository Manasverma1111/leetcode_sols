package com.manas.leetco;

public class LongestMountArr {
    public static void main(String[] args) {

        int[] arr1 = {2, 1, 4, 7, 3, 2, 5};
        int res1 = longestMountArr(arr1);
        System.out.println(res1);

        int[] arr2 = {2 ,2, 2};
        int res2 = longestMountArr(arr2);
        System.out.println(res2);
    }
    static int longestMountArr(int[] arr) {
        int n = arr.length;
        int maxLength = 0;

        for(int i =1; i < n - 1; ) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){

                int left = i-1;
                while(left > 0 && arr[left-1] < arr[left]){
                    left--;
                }

                int right = i+1;
                while(right < n-1 && arr[right] > arr[right+1]){
                    right++;
                }

                int longestMount = right-left+1;
                maxLength = Math.max(maxLength, longestMount);
                i = right+1;
            } else {
                i++;
            }
        }

        return maxLength;
    }
}
