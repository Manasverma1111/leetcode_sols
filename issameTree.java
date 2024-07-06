import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class issametree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, trees are the same
        if (p == null && q == null) {
            return true;
        }

        // If one of the nodes is null or their values are different, trees are not the same
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

public class issameTree {
    public static void main(String[] args) {
        // Example trees
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        issametree solution = new issametree();
        boolean result = solution.isSameTree(p, q);
        System.out.println(result); // Output: true

        // Example of different trees
        TreeNode r = new TreeNode(1);
        r.left = new TreeNode(2);

        TreeNode s = new TreeNode(1);
        s.right = new TreeNode(2);

        boolean result2 = solution.isSameTree(r, s);
        System.out.println(result2); // Output: false
    }
}
