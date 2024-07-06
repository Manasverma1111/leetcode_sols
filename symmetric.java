import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;
    TreeNodes(int x) { val = x; }
}

class Solution {
    public boolean isTreeSymmetric(TreeNodes leftRoot, TreeNodes rightRoot) {
        if(leftRoot == null && rightRoot == null) {
            return true;
        }
        if((leftRoot == null && rightRoot != null) || (rightRoot == null && leftRoot != null)) {
            return false;
        }
        if(leftRoot.val != rightRoot.val) {
            return false;
        }
        return isTreeSymmetric(leftRoot.left, rightRoot.right) && isTreeSymmetric(leftRoot.right, rightRoot.left);
    }

    public boolean isSymmetric(TreeNodes root) {
        if(root == null) {
            return true;
        }
        return isTreeSymmetric(root.left, root.right);
    }
}

public class symmetric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values of the tree nodes in level order, separated by spaces (use 'null' for empty nodes):");
        String input = scanner.nextLine();
        String[] values = input.split(" ");

        TreeNodes root = createTree(values);
        Solution solution = new Solution();
        boolean result = solution.isSymmetric(root);
        System.out.println("The tree is symmetric: " + result);
    }

    private static TreeNodes createTree(String[] values) {
        if (values.length == 0 || values[0].equals("null")) {
            return null;
        }

        TreeNodes root = new TreeNodes(Integer.parseInt(values[0]));
        Queue<TreeNodes> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < values.length) {
            TreeNodes current = queue.poll();

            if (!values[i].equals("null")) {
                current.left = new TreeNodes(Integer.parseInt(values[i]));
                queue.add(current.left);
            }
            i++;

            if (i < values.length && !values[i].equals("null")) {
                current.right = new TreeNodes(Integer.parseInt(values[i]));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }
}
