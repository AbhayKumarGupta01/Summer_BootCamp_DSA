import java.util.*;

class Frequency_Sort {

    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if (freq.get(a).equals(freq.get(b))) {
                return b - a;
            }
            return freq.get(a) - freq.get(b);
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        Frequency_Sort obj = new Frequency_Sort();

        int nums[] = {2, 3, 1, 3, 2};

        int result[] = obj.frequencySort(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}