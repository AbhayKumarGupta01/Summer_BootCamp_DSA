import java.util.*;

public class LongestSubsequence {

    public static int longestSubsequence(int[] nums) {
        int xor = 0;
        int nonZero = 0;

        for (int num : nums) {
            xor ^= num;

            if (num != 0) {
                nonZero++;
            }
        }

        if (xor != 0) {
            return nums.length;
        }

        if (nonZero > 0) {
            return nums.length - 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        int result = longestSubsequence(nums);

        System.out.println("Longest Subsequence Length: " + result);
    }
}