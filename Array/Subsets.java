import java.util.*;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        int total = 1 << n;

        for (int mask = 0; mask < total; mask++) {

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }

            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {

        Subsets obj = new Subsets();

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = obj.subsets(nums);

        System.out.println(result);
    }
}