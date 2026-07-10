import java.util.*;

public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (left <= right) {

            // If the current subarray is already sorted
            if (nums[left] <= nums[right]) {
                min = Math.min(min, nums[left]);
                break;
            }

            int mid = left + (right - left) / 2;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                min = Math.min(min, nums[left]);
                left = mid + 1;
            }
            // Right half is sorted
            else {
                min = Math.min(min, nums[mid]);
                right = mid - 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Minimum element: " + findMin(nums));

        sc.close();
    }
}