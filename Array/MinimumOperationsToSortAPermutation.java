import java.util.Arrays;

public class MinimumOperationsToSortAPermutation {

    public static int minOperations(int[] nums) {
        int n = nums.length;
        int zero = 0;

        // Find the index of 0
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }

        int ans = Integer.MAX_VALUE;

        // Check forward direction
        if (check(nums, zero, 1)) {
            ans = Math.min(ans, zero);
            ans = Math.min(ans, n - zero + 2);
        }

        // Check backward direction
        if (check(nums, zero, -1)) {
            ans = Math.min(ans, zero + 2);
            ans = Math.min(ans, n - zero);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private static boolean check(int[] nums, int zero, int step) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int prev = (zero + (i - 1) * step + n) % n;
            int curr = (zero + i * step + n) % n;

            if (nums[prev] > nums[curr]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1};

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Minimum operations: " + minOperations(nums));
    }
}