import java.util.*;

public class FirstStableIndex {

    public static int firstStableIndex(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
            }

            if (max - min <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = firstStableIndex(nums, k);

        System.out.println(result);

        sc.close();
    }
}