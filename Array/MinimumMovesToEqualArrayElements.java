import java.util.Scanner;

public class MinimumMovesToEqualArrayElements {

    public static int minMoves(int[] nums) {
        int mn = Integer.MAX_VALUE;

        for (int x : nums) {
            if (x < mn) {
                mn = x;
            }
        }

        long moves = 0;

        for (int x : nums) {
            moves += x - mn;
        }

        return (int) moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(minMoves(nums));

        sc.close();
    }
}