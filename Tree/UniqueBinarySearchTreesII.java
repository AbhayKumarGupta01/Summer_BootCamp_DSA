
import java.util.*;

public class UniqueBinarySearchTreesII {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<TreeNode> generateTrees(int n) {
        return generate(1, n);
    }

    public static List<TreeNode> generate(int start, int end) {

        List<TreeNode> result = new ArrayList<>();

        // Base case: Empty subtree
        if (start > end) {
            result.add(null);
            return result;
        }

        // Try every value as root
        for (int i = start; i <= end; i++) {

            List<TreeNode> leftTrees = generate(start, i - 1);
            List<TreeNode> rightTrees = generate(i + 1, end);

            // Combine all possible left and right subtrees
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {

                    TreeNode root = new TreeNode(i);

                    root.left = left;
                    root.right = right;

                    result.add(root);
                }
            }
        }

        return result;
    }

    // Print tree in preorder format
    public static void preorder(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }

        System.out.print(root.val + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        int n = 3;

        List<TreeNode> trees = generateTrees(n);

        System.out.println("Total Unique BSTs: " + trees.size());

        int count = 1;

        for (TreeNode root : trees) {
            System.out.print("Tree " + count + ": ");
            preorder(root);
            System.out.println();
            count++;
        }
    }
}
