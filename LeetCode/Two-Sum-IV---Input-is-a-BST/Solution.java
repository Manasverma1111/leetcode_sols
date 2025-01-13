/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        
        HashSet<Integer> visited = new HashSet<>();
        return dfs(root, k, visited);
    }

    private boolean dfs(TreeNode node, int k, HashSet<Integer> visited) {
        if (node == null) {
            return false;
        }

        if (visited.contains(k - node.val)) {
            return true;
        }

        visited.add(node.val);

        return dfs(node.left, k, visited) || dfs(node.right, k, visited);
    }
}
