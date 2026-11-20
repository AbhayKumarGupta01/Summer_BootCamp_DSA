import java.util.*;
public class MaximizeConsecutiveElementsInAnArrayAfterModification {
    public static int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int mid = 0;
        int right = 0;
        int prev = -1;
        int ans = 0;
        for (int x : nums) {
            if (x == prev + 1) {
                left = mid;
                mid = right;
                right = 0;

            } 
            else if (x == prev + 2) {
                left = right;
                mid = 0;
                right = 0;
            } 
            else if (x != prev) {
                left = 0;
                mid = 0;
                right = 0;
            }
            right = Math.max(right, mid + 1);
            mid = Math.max(mid, left + 1);
            ans = Math.max(ans, Math.max(mid, right));
            prev = x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSelectedElements(nums));
        sc.close();
    }
}
