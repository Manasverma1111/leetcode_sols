import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LargestValueInEachRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                maxVal = Math.max(maxVal, currentNode.val);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            result.add(maxVal);
        }

        return result;
    }

    // Helper method to build a tree from an array (for testing purposes)
    public TreeNode buildTree(Integer[] values) {
        if (values.length == 0 || values[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < values.length) {
            TreeNode currentNode = queue.poll();
            if (values[i] != null) {
                currentNode.left = new TreeNode(values[i]);
                queue.add(currentNode.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                currentNode.right = new TreeNode(values[i]);
                queue.add(currentNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        LargestValueInEachRow solution = new LargestValueInEachRow();
        Integer[] input = {1, 3, 2, 5, 3, null, 9};
        TreeNode root = solution.buildTree(input);
        List<Integer> result = solution.largestValues(root);
        System.out.println(result); // Output: [1, 3, 9]
    }
}
