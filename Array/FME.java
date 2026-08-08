import java.util.*;

public class FME {

    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            set.add(num);

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                l.add(i);
            }
        }

        return l;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        FME obj = new FME();

        List<Integer> result = obj.findMissingElements(nums);

        System.out.println("Missing elements: " + result);

        sc.close();
    }
}