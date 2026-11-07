
import java.util.*;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        solve(list, new ArrayList<>(), ans);

        return ans;
    }

    public static void solve(List<Integer> nums,
                             List<Integer> temp,
                             List<List<Integer>> ans) {

        // Base case
        if (nums.isEmpty()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {

            // Choose
            int num = nums.remove(i);
            temp.add(num);

            // Recursive call
            solve(nums, temp, ans);

            // Backtracking
            temp.remove(temp.size() - 1);
            nums.add(i, num);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = permute(nums);

        System.out.println(result);
    }
}
