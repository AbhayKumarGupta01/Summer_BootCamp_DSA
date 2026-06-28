// Mirror (Invert) of a Binary Tree
import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Mirror_Invert {

    static TreeNode root = null;

    // Insert node in level order
    static TreeNode insert(TreeNode root, int data) {

        TreeNode newNode = new TreeNode(data);

        if (root == null) {
            return newNode;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode temp = q.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return root;
            } else {
                q.offer(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return root;
            } else {
                q.offer(temp.right);
            }
        }

        return root;
    }

    // Invert the binary tree
    static TreeNode invert(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;
    }

    // Level Order Traversal
    static void levelOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                q.offer(temp.left);
            }

            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        // Create Tree
        for (int x : arr) {
            root = insert(root, x);
        }

        System.out.print("Before Invert: ");
        levelOrder(root);

        // Invert Tree
        invert(root);

        System.out.print("\nAfter Invert: ");
        levelOrder(root);
    }
}