
import java.util.*;

public class RecoverBinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        inorder(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        if (prev != null && prev.val > root.val) {

            if (first == null) {
                first = prev;
            }

            second = root;
        }

        prev = root;

        inorder(root.right);
    }

    // Build tree using level order input
    public static TreeNode buildTree(int[] arr) {

        if (arr.length == 0 || arr[0] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.length) {

            TreeNode current = q.poll();

            // Left child
            if (i < arr.length && arr[i] != -1) {
                current.left = new TreeNode(arr[i]);
                q.add(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && arr[i] != -1) {
                current.right = new TreeNode(arr[i]);
                q.add(current.right);
            }
            i++;
        }

        return root;
    }

    // Print inorder traversal
    public static void printInorder(TreeNode root) {

        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter level order elements (-1 for null):");

        // Input using for loop
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeNode root = buildTree(arr);

        RecoverBinarySearchTree obj = new RecoverBinarySearchTree();

        System.out.println("Before recovery:");
        printInorder(root);

        obj.recoverTree(root);

        System.out.println("\nAfter recovery:");
        printInorder(root);

        sc.close();
    }
}
