package com.manas.leetco;
import java.util.ArrayList;
import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int j = i+1;
            int k = nums.length - 1;

            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum > 0) {
                    k--;
                } else if(sum < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j-1] && j<k) {
                        j++;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums1)); // Output: [[-1, -1, 2], [-1, 0, 1]]

        int[] nums2 = {0, 1, 1};
        System.out.println(solution.threeSum(nums2)); // Output: []

        int[] nums3 = {0, 0, 0};
        System.out.println(solution.threeSum(nums3)); // Output: [[0, 0, 0]]
    }
}
