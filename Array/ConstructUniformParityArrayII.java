import java.util.*;

public class ConstructUniformParityArrayII {

    public static boolean uniformArray(int[] nums1) {

        int smallestOdd = Integer.MAX_VALUE;

        // Find the smallest odd number
        for (int x : nums1) {
            if (x % 2 != 0) {
                smallestOdd = Math.min(smallestOdd, x);
            }
        }

        // All numbers are even
        if (smallestOdd == Integer.MAX_VALUE) {
            return true;
        }

        // Check every even number
        for (int x : nums1) {
            if (x % 2 == 0) {

                // Subtract an odd number to make it odd
                int value = x - smallestOdd;

                if (value < 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 4, 7};

        System.out.println(uniformArray(nums1));
    }
}