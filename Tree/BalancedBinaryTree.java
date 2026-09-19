import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    public static int dfsHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int lh = dfsHeight(root.left);

        if (lh == -1) {
            return -1;
        }

        int rh = dfsHeight(root.right);

        if (rh == -1) {
            return -1;
        }

        if (Math.abs(lh - rh) > 1) {
            return -1;
        }

        return Math.max(lh, rh) + 1;
    }

    // Create tree using user input
    public static TreeNode createTree(Scanner sc) {

        System.out.print("Enter root value (-1 for no node): ");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        TreeNode root = new TreeNode(value);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            System.out.print("Enter left child of " + current.val + " (-1 for no node): ");
            int left = sc.nextInt();

            if (left != -1) {
                current.left = new TreeNode(left);
                queue.add(current.left);
            }

            System.out.print("Enter right child of " + current.val + " (-1 for no node): ");
            int right = sc.nextInt();

            if (right != -1) {
                current.right = new TreeNode(right);
                queue.add(current.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeNode root = createTree(sc);

        if (isBalanced(root)) {
            System.out.println("The binary tree is balanced.");
        } else {
            System.out.println("The binary tree is not balanced.");
        }

        sc.close();
    }
}