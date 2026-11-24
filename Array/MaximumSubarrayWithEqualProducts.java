import java.util.*;

class MaximumSubarrayWithEqualProducts {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int product = 1;
            int g = 0;
            int l = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                if (product == g * l) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MaximumSubarrayWithEqualProducts obj = new MaximumSubarrayWithEqualProducts();
        System.out.println(obj.maxLength(nums));
        sc.close();
    }
}
