import java.util.*;

public class SubarraysDistinctElementSumOfSquaresI {

    public static int sumCounts(List<Integer> nums) {
        int result = 0;

        for (int i = 0; i < nums.size(); i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));

                int count = set.size();
                result += count * count;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println(sumCounts(nums));

        sc.close();
    }
}