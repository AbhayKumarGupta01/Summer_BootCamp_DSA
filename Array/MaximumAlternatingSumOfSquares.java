import java.util.*;

public class MaximumAlternatingSumOfSquares {
    public static long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Math.abs((long) nums[i]);
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        long ans = 0;

        while (left < right) {
            long large = arr[right];
            long small = arr[left];

            ans += large * large - small * small;

            left++;
            right--;
        }

        if (left == right) {
            ans += arr[left] * arr[left];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maxAlternatingSum(nums));

        sc.close();
    }
}