// Check if Two Binary Trees are Identical
import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Identical_Tree {

    static TreeNode root1 = null;
    static TreeNode root2 = null;

    // Insert node in level order
    static TreeNode insert(TreeNode root, int data) {

        TreeNode newNode = new TreeNode(data);

        if (root == null)
            return newNode;

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

    // Level Order Traversal
    static void levelOrder(TreeNode root) {

        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null)
                q.offer(temp.left);

            if (temp.right != null)
                q.offer(temp.right);
        }
    }

    // Check if two trees are identical
    static boolean identical(TreeNode a, TreeNode b) {

        if (a == null && b == null)
            return true;

        if (a == null || b == null)
            return false;

        return a.data == b.data
                && identical(a.left, b.left)
                && identical(a.right, b.right);
    }

    public static void main(String[] args) {

        // Tree 1
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};

        // Tree 2
        int arr2[] = {1, 2, 3, 4, 5, 6, 7};

        // Create Tree 1
        for (int x : arr1)
            root1 = insert(root1, x);

        // Create Tree 2
        for (int x : arr2)
            root2 = insert(root2, x);

        System.out.print("Tree 1: ");
        levelOrder(root1);

        System.out.print("\nTree 2: ");
        levelOrder(root2);

        if (identical(root1, root2))
            System.out.println("\n\nBoth Trees are Identical.");
        else
            System.out.println("\n\nBoth Trees are Not Identical.");
    }
}