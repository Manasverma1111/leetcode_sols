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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        boolean leftToRight = true;

        while(!que.isEmpty()) {
            int size = que.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode currNode = que.poll();

                if (leftToRight) {
                    level.addLast(currNode.val);
                } else {
                    level.addFirst(currNode.val);
                }

                if (currNode.left != null) {
                    que.offer(currNode.left);
                }
                if (currNode.right != null) {
                    que.offer(currNode.right);
                }
            }

            res.add(level);
            leftToRight = !leftToRight;
        }

        return res;

    }
}
