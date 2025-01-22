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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> res = new ArrayList<>();

        if (root == null ){
            return res;
        }

        findPath(root, targetSum, new ArrayList<>(), res);            
        return res;
        
    }

    private void findPath(TreeNode node, int targetSum, List<Integer> currPath, List<List<Integer>> res) {

        if (node == null){
            return ;
        }

        currPath.add(node.val);

        if (node.left == null && node.right == null && targetSum == node.val) {
            res.add(new ArrayList<>(currPath));
        } else {
            findPath(node.left, targetSum - node.val, currPath, res);
            findPath(node.right, targetSum - node.val, currPath, res);
        }

        currPath.remove(currPath.size() - 1);
    } 
}
