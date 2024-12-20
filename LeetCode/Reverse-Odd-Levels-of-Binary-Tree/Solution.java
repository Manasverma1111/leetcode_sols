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
    public TreeNode reverseOddLevels(TreeNode root) {
        
         if (root == null) return null;
        reverseOddLevelsDFS(root.left, root.right, 1);
        return root;
    }

    private void reverseOddLevelsDFS(TreeNode leftNode, TreeNode rightNode, int level) {
        if (leftNode == null || rightNode == null) return;

        if (level % 2 == 1) {
            int temp = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = temp;
        }

        reverseOddLevelsDFS(leftNode.left, rightNode.right, level + 1);
        reverseOddLevelsDFS(leftNode.right, rightNode.left, level + 1);
    }

    public void printLevelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.val + " ");

            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);
        }
        System.out.println();
    }
}
