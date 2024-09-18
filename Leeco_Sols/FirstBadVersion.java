package com.manas.leetco;

public class FirstBadVersion {

    // The isBadVersion API is provided and simulated here
    boolean isBadVersion(int version) {
        // This is just a placeholder. Actual implementation would be provided.
        // In a real scenario, this would connect to the API
        return version >= 4; // Example: let's assume version 4 is the first bad version
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;  // Prevents overflow

            if (isBadVersion(mid)) {
                right = mid; // Move the right pointer to mid, because mid could be the first bad version
            } else {
                left = mid + 1; // Move the left pointer to mid + 1, since mid is not a bad version
            }
        }

        // At the end, left == right and points to the first bad version
        return left;
    }

    public static void main(String[] args) {
        FirstBadVersion solution = new FirstBadVersion();
        int n = 5;
        System.out.println("First bad version: " + solution.firstBadVersion(n)); // Example: Output: 4
    }
}
