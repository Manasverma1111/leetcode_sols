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
19        if (root == null || root.val == val) {
20            return root;
21        }
22
23        if (val < root.val) {
24            return searchBST(root.left, val);
25        }
26
27        return searchBST(root.right, val);
28    }
29
30    public void printTree(TreeNode root) {
31        if (root == null) {
32            System.out.println("[]");
33            return;
34        }
35
36        Queue<TreeNode> que = new LinkedList<>();
37        que.offer(root);
38        while (!que.isEmpty()) {
39            TreeNode node = que.poll();
40            if (node == null) {
41                System.out.print(node.val + " ");
42                que.offer(node.left);
43                que.offer(node.right);
44            } else {
45                System.out.print("null");
46            }
47        }
48    }
49}