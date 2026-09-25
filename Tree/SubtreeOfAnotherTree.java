import java.util.*;

class SubtreeOfAnotherTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode buildTree(Scanner sc, int n) {

        if (n == 0) {
            return null;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (!queue.isEmpty() && i < n) {

            TreeNode current = queue.poll();

            if (i < n) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
                i++;
            }

            if (i < n) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
                i++;
            }
        }

        return root;
    }

    static boolean isSameTree(TreeNode root, TreeNode subRoot) {

        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.val != subRoot.val) {
            return false;
        }

        return isSameTree(root.left, subRoot.left)
                && isSameTree(root.right, subRoot.right);
    }

    static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeNode root = buildTree(sc, n);

        int m = sc.nextInt();
        TreeNode subRoot = buildTree(sc, m);

        System.out.println(isSubtree(root, subRoot));

        sc.close();
    }
}