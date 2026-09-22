import java.util.*;

public class UnivaluedBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isUnivalTree(TreeNode root) {

        if (root == null) {
            return true;
        }

        if (root.left != null && root.left.val != root.val) {
            return false;
        }

        if (root.right != null && root.right.val != root.val) {
            return false;
        }

        return isUnivalTree(root.left) &&
               isUnivalTree(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter root value: ");
        int rootValue = sc.nextInt();

        TreeNode root = new TreeNode(rootValue);

        System.out.print("Enter left child of root (-1 for null): ");
        int leftValue = sc.nextInt();

        if (leftValue != -1) {
            root.left = new TreeNode(leftValue);
        }

        System.out.print("Enter right child of root (-1 for null): ");
        int rightValue = sc.nextInt();

        if (rightValue != -1) {
            root.right = new TreeNode(rightValue);
        }

        System.out.println("Is the tree univalued? " + isUnivalTree(root));

        sc.close();
    }
}