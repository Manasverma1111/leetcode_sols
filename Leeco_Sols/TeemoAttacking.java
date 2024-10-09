package com.manas.leetco;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0; // No attacks means no poisoned duration
        }

        int totalPoisonedTime = 0; // To store the total poisoned duration
        for (int i = 0; i < timeSeries.length; i++) {
            // Calculate the start and end of the current poison effect
            int attackTime = timeSeries[i];
            int poisonEnd = attackTime + duration - 1;

            if (i > 0) {
                int previousPoisonEnd = timeSeries[i - 1] + duration - 1;
                // If current attack overlaps with the previous poison effect
                if (attackTime <= previousPoisonEnd) {
                    // Add only the non-overlapping part
                    totalPoisonedTime += poisonEnd - previousPoisonEnd;
                } else {
                    // No overlap, add the full duration
                    totalPoisonedTime += duration;
                }
            } else {
                // First attack, add the full duration
                totalPoisonedTime += duration;
            }
        }
        return totalPoisonedTime;
    }

    public static void main(String[] args) {
        TeemoAttacking teemo = new TeemoAttacking();

        // Example 1
        int[] timeSeries1 = {1, 4};
        int duration1 = 2;
        System.out.println(teemo.findPoisonedDuration(timeSeries1, duration1)); // Output: 4

        // Example 2
        int[] timeSeries2 = {1, 2};
        int duration2 = 2;
        System.out.println(teemo.findPoisonedDuration(timeSeries2, duration2)); // Output: 3
    }
}

