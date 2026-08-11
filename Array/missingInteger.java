import java.util.*;

public class missingInteger {

    public static int missingInteger(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        int sum = nums[0];

        // Find sum of longest sequential prefix
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Find smallest missing integer >= sum
        while (hs.contains(sum)) {
            sum++;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = missingInteger(nums);

        System.out.println("Answer: " + result);

        sc.close();
    }
}