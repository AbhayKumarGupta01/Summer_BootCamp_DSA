import java.util.*;

public class SearchinaBinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode current = q.poll();

            if (current == null) {
                System.out.print("null ");
                continue;
            }

            System.out.print(current.val + " ");

            q.add(current.left);
            q.add(current.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        TreeNode root = null;

        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.print("Enter value to search: ");
        int val = sc.nextInt();

        TreeNode result = searchBST(root, val);

        if (result == null) {
            System.out.println("Node not found");
        } else {
            System.out.println("Node found: " + result.val);
            System.out.print("Subtree: ");
            printTree(result);
        }

        sc.close();
    }
}