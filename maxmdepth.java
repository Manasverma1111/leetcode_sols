import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class TreesNode {
    int val;
    TreesNode left;
    TreesNode right;
    TreesNode(int x) { val = x; }
}

class Depth {
    public int maxDepth(TreesNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

public class maxmdepth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values of the tree nodes in level order, separated by spaces (use 'null' for empty nodes):");
        String input = scanner.nextLine();
        String[] values = input.split(" ");

        TreesNode root = createTree(values);
        Depth solution = new Depth();
        int result = solution.maxDepth(root);
        System.out.println("The maximum depth of the tree is: " + result);
    }

    private static TreesNode createTree(String[] values) {
        if (values.length == 0 || values[0].equals("null")) {
            return null;
        }

        TreesNode root = new TreesNode(Integer.parseInt(values[0]));
        Queue<TreesNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < values.length) {
            TreesNode current = queue.poll();

            if (!values[i].equals("null")) {
                current.left = new TreesNode(Integer.parseInt(values[i]));
                queue.add(current.left);
            }
            i++;

            if (i < values.length && !values[i].equals("null")) {
                current.right = new TreesNode(Integer.parseInt(values[i]));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }
}
