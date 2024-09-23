package com.manas.leetco;


import java.util.*;

public class ArrayIntersectionII {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Create a HashMap to store the frequency of elements in nums1
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        // Count the occurrences of each element in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Iterate through nums2 and find intersections
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);  // Add the common element to the result list
                map.put(num, map.get(num) - 1);  // Decrease the count in the map
            }
        }

        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayIntersectionII solution = new ArrayIntersectionII();

        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));  // Output: [2, 2]

        // Example 2
        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));  // Output: [4, 9]
    }
}
