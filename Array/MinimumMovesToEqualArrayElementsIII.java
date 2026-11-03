import java.util.*;

public class MinimumMovesToEqualArrayElementsIII {

    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;

        // Find maximum element
        for (int x : nums) {
            if (x > max) {
                max = x;
            }
        }

        int moves = 0;

        // Calculate total moves
        for (int x : nums) {
            moves += max - x;
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MinimumMovesToEqualArrayElementsIII obj =
            new MinimumMovesToEqualArrayElementsIII();

        System.out.println(obj.minMoves(nums));

        sc.close();
    }
}