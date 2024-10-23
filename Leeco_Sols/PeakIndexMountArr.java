package com.manas.leetco;

import java.util.Scanner;

class PeakIndexMountArr {
    public int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        // Binary search to find the peak element in the mountain array
        while(left <= right){
            int mid = left + (right - left) / 2;

            // Compare mid with mid+1 to decide whether to move left or right
            if(arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // After the loop, left will point to the peak
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the mountain array
        System.out.print("Enter the number of elements in the mountain array:");
        int n = scanner.nextInt();  // Number of elements in the array
        int[] arr = new int[n];

        System.out.print("Enter the elements of the mountain array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Read each element
        }

        // Creating a Solution object and finding the peak index
        PeakIndexMountArr solution = new PeakIndexMountArr();
        int peakIndex = solution.peakIndexInMountainArray(arr);

        // Output the result
        System.out.print("The peak index in the mountain array is: " + peakIndex);

        // Close the scanner
        scanner.close();
    }
}
