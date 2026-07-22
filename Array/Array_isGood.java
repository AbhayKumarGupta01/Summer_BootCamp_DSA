import java.util.*;

public class Array_isGood {

    public boolean isGood(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n];

        for (int num : nums) {
            if (num >= n || num <= 0)
                return false;

            freq[num]++;
        }

        for (int i = 1; i < n - 1; i++) {
            if (freq[i] != 1)
                return false;
        }

        return freq[n - 1] == 2;
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

        Array_isGood obj = new Array_isGood();

        if (obj.isGood(nums)) {
            System.out.println("The array is Good.");
        } else {
            System.out.println("The array is Not Good.");
        }

        sc.close();
    }
}