package com.manas.leetco;

public class MaxConescutiveOnes {
    public int findMaxCons(int[] nums){

        int currCount = 0;
        int maxCount = 0;

        for(int num : nums){
            if(num == 1){
                currCount++;
                maxCount = Math.max(maxCount, currCount);
            } else{
                currCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        MaxConescutiveOnes solution = new MaxConescutiveOnes();

        // Test case 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println(solution.findMaxCons(nums1));

        // Test case 2
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println(solution.findMaxCons(nums2));
    }
}
