
import java.util.Arrays;

public class MinimumSumOfSquaredDifference {

    public static long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;

        int[] diff = new int[n];
        int max = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            total += diff[i];
        }

        if (k >= total) {
            return 0;
        }

        int left = 0;
        int right = max;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long needed = 0;

            for (int d : diff) {
                if (d > mid) {
                    needed += d - mid;
                }
            }

            if (needed <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int level = left;
        long used = 0;
        long sum = 0;

        for (int d : diff) {
            if (d > level) {
                used += d - level;
                d = level;
            }

            sum += (long) d * d;
        }

        long remaining = k - used;

        for (int i = 0; i < n && remaining > 0; i++) {
            if (diff[i] >= level && level > 0) {
                sum -= (long) level * level;
                sum += (long) (level - 1) * (level - 1);
                remaining--;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 10, 20, 19};

        int k1 = 0;
        int k2 = 0;

        long result = minSumSquareDiff(nums1, nums2, k1, k2);

        System.out.println("Minimum Sum of Squared Difference: " + result);
    }
}
