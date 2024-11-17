package com.manas.leetco;

import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreaterElmt(int[] nums1, int[] nums2) {

        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stk = new Stack<>();

        for (int num : nums2) {
            while (!stk.isEmpty() && stk.peek() < num) {
                nextGreaterMap.put(stk.pop(), num);
            }

            stk.push(num);
        }

        while ( !stk.isEmpty()) {
            nextGreaterMap.put(stk.pop(), -1);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nextGreaterMap.get(nums1[i]);
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of first Array nums1: ");
        int n = input.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter the elements of nums1: ");
        for (int i = 0; i<n; i++) {
            nums1[i] = input.nextInt();
        }

        System.out.print("Enter size of second Array nums2: ");
        int m = input.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter the elements of nums2: ");
        for (int i = 0; i<m; i++) {
            nums2[i] = input.nextInt();
        }

        int[] res = nextGreaterElmt(nums1, nums2);
        System.out.println("Output: " + Arrays.toString(res));
        input.close();
    }
}
