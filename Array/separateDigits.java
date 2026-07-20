import java.util.*;

public class separateDigits {

    public int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            String s = String.valueOf(num);

            for (char ch : s.toCharArray()) {
                list.add(ch - '0');
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        separateDigits obj = new separateDigits();
        int[] result = obj.separateDigits(nums);

        System.out.print("Separated Digits: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }

        sc.close();
    }
}