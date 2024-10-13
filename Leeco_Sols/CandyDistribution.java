package com.manas.leetco;

import java.util.HashSet;

public class CandyDistribution {
    public static int distributeCandies(int[] candyType) {
        // Create a set to store unique types of candies
        HashSet<Integer> uniqueCandies = new HashSet<>();

        // Add each candy type to the set (only unique types are kept)
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        // The maximum number of candies Alice can eat is n / 2
        int maxCandies = candyType.length / 2;

        // The result is the minimum of the number of unique types and maxCandies
        return Math.min(uniqueCandies.size(), maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType1 = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(candyType1)); // Output: 3

        int[] candyType2 = {1, 1, 2, 3};
        System.out.println(distributeCandies(candyType2)); // Output: 2

        int[] candyType3 = {6, 6, 6, 6};
        System.out.println(distributeCandies(candyType3)); // Output: 1
    }
}
