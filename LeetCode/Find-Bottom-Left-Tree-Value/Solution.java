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
    public int findBottomLeftValue(TreeNode root) {
        
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int leftMost = root.val;

        while (!que.isEmpty()) {
            int levelSize = que.size();
            leftMost = que.peek().val;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = que.poll();

                if (node.left != null) {
                    que.offer(node.left);
                }
                if (node.right != null) {
                    que.offer(node.right);
                }
            }
        }

        return leftMost;
    }
}
