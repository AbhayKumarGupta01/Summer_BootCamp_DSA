import java.util.Arrays;
import java.util.Scanner;

public class MinimumMovesToEqualArrayElementsII {

    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int median = nums[nums.length / 2];
        int count = 0;

        for (int num : nums) {
            count += Math.abs(num - median);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(minMoves2(nums));

        sc.close();
    }
}