import java.util.*;

public class FindTheLargestAlmostMissingInteger {

    public static int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        // Check every subarray of size k
        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count each number once per subarray
            for (int num : set) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1;

        for (int num : count.keySet()) {
            if (count.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 9, 2, 1, 7};
        int k = 3;

        int result = largestInteger(nums, k);

        System.out.println("Largest Almost Missing Integer: " + result);
    }
}