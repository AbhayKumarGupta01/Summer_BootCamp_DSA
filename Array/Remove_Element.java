import java.util.*;

public class Remove_Element {

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] temp = new int[n];
        int k = 0;

        // Store elements other than val
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                temp[k] = nums[i];
                k++;
            }
        }

        // Copy back to original array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        int k = removeElement(nums, val);

        System.out.println("Number of remaining elements: " + k);

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}