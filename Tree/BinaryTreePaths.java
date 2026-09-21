import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreePaths {

    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            list.add(String.valueOf(root.val));
            return list;
        }

        // Left subtree
        for (String path : binaryTreePaths(root.left)) {
            list.add(root.val + "->" + path);
        }

        // Right subtree
        for (String path : binaryTreePaths(root.right)) {
            list.add(root.val + "->" + path);
        }

        return list;
    }

    // Create tree using level-order input
    public static TreeNode createTree(String[] values) {

        if (values.length == 0 || values[0].equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (!queue.isEmpty() && i < values.length) {

            TreeNode current = queue.poll();

            // Left child
            if (!values[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(current.left);
            }

            i++;

            // Right child
            if (i < values.length && !values[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(current.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tree in level order:");
        System.out.println("Use 'null' for an empty node.");

        String input = sc.nextLine();

        String[] values = input.trim().split("\\s+");

        TreeNode root = createTree(values);

        List<String> result = binaryTreePaths(root);

        System.out.println("Root-to-leaf paths:");

        System.out.println(result);

        sc.close();
    }
}