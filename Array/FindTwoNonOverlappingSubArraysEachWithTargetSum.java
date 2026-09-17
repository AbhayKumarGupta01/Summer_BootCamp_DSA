import java.util.*;

public class FindTwoNonOverlappingSubArraysEachWithTargetSum {

    public static int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        ArrayList<int[]> subArrays = new ArrayList<>();

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {

                int len = right - left + 1;

                // Compare with previously found subarrays
                for (int[] prev : subArrays) {

                    // prev[1] < left means no overlap
                    if (prev[1] < left) {
                        ans = Math.min(ans, len + prev[2]);
                    }
                }

                // Store start, end, length
                subArrays.add(new int[]{left, right, len});
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 2, 4, 3};
        int target = 3;

        System.out.println(minSumOfLengths(arr, target));
    }
}