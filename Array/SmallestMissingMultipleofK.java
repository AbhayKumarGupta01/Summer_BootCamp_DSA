public class SmallestMissingMultipleofK {

    public static int missingMultiple(int[] nums, int k) {

        int multiple = k;

        while (true) {

            boolean found = false;

            for (int num : nums) {
                if (num == multiple) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return multiple;
            }

            multiple += k;
        }
    }

    public static void main(String[] args) {

        int[] nums = {8, 2, 3, 4, 6};
        int k = 2;

        int result = missingMultiple(nums, k);

        System.out.println(result);
    }
}