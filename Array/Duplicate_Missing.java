import java.util.Scanner;

class Duplicate_Missing {

    public int[] findMissingRepeatingNumbers(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int num : nums) {
            freq[num]++;
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2)
                repeating = i;
            if (freq[i] == 0)
                missing = i;
        }

        return new int[]{repeating, missing};
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

        Duplicate_Missing obj = new Duplicate_Missing();

        int[] ans = obj.findMissingRepeatingNumbers(nums);

        System.out.println("Repeating Number: " + ans[0]);
        System.out.println("Missing Number: " + ans[1]);

        sc.close();
    }
}