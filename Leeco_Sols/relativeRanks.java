package com.manas.leetco;

import java.util.Arrays;
import java.util.HashMap;

public class relativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // Create a copy of the score array and sort it in descending order
        int[] sortedScores = score.clone();
        Arrays.sort(sortedScores);

        // Map the scores to their ranks
        HashMap<Integer, String> rankMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int rank = n - i;  // Rank based on sorted position
            if (rank == 1) {
                rankMap.put(sortedScores[i], "Gold Medal");
            } else if (rank == 2) {
                rankMap.put(sortedScores[i], "Silver Medal");
            } else if (rank == 3) {
                rankMap.put(sortedScores[i], "Bronze Medal");
            } else {
                rankMap.put(sortedScores[i], String.valueOf(rank));
            }
        }

        // Fill the result array with the appropriate ranks
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] score1 = {5, 4, 3, 2, 1};
        int[] score2 = {10, 3, 8, 9, 4};

        System.out.println(Arrays.toString(findRelativeRanks(score1))); // ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
        System.out.println(Arrays.toString(findRelativeRanks(score2))); // ["Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"]
    }
}

