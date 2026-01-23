1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode searchBST(TreeNode root, int val) {
18        
19        while (root != null) {
20            if (root.val == val) {
21                return root;
22            } else if ( val < root.val) {
23                root = root.left;
24            } else {
25                root = root.right;
26            }
27        }
28
29        return null;
30    }
31}