
import java.util.*;

public class MinimumSwapsToSortByDigitSum {

    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        // Calculate digit sum
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            arr[i][0] = nums[i];
            arr[i][1] = sum;
        }

        // Sort by digit sum, then by number
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        // Create target sorted array
        int[] target = new int[n];

        for (int i = 0; i < n; i++) {
            target[i] = arr[i][0];
        }

        // Store current indices
        Map<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < n; i++) {
            index.put(nums[i], i);
        }

        int swaps = 0;

        // Perform minimum swaps
        for (int i = 0; i < n; i++) {
            if (nums[i] != target[i]) {
                int j = index.get(target[i]);

                index.put(nums[i], j);
                index.put(target[i], i);

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(minSwaps(nums));

        sc.close();
    }
}
