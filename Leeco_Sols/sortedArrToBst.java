package com.manas.leetco;

import com.manas.leetco.*;
import java.util.Scanner;


public class sortedArrToBst {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        } else {
            return sortedArrayToBST(nums, 0, nums.length - 1);
        }
    }

    private TreeNode sortedArrayToBST(int[] nums, int beg, int end) {
        if (beg > end) {
            return null;
        }

        int mid = (beg + end) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, beg, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }

    // Method to print the tree in-order for verification
    private void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        sortedArrToBst solution = new sortedArrToBst();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array (sorted in ascending order):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        TreeNode root = solution.sortedArrayToBST(nums);

        System.out.println("In-order traversal of the BST:");
        solution.printTree(root);
        scanner.close();
    }
}
