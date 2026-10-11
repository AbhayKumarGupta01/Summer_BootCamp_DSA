
import java.util.*;

public class SumOfSquaresOfSpecialElements {

    public static int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                sum += nums[i] * nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(sumOfSquares(nums));

        sc.close();
    }
}
