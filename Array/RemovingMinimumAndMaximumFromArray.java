public class RemovingMinimumAndMaximumFromArray {

    public static int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = -1;
        int maxIndex = -1;

        // Find minimum, maximum and their indices
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Remove both from the front
        int front = Math.max(minIndex, maxIndex) + 1;

        // Remove both from the back
        int back = nums.length - Math.min(minIndex, maxIndex);

        // Remove one from front and one from back
        int both = (Math.min(minIndex, maxIndex) + 1)
                 + (nums.length - Math.max(minIndex, maxIndex));

        return Math.min(front, Math.min(back, both));
    }

    public static void main(String[] args) {

        int[] nums = {2, 10, 7, 5, 4, 1, 8, 6};

        int result = minimumDeletions(nums);

        System.out.println("Minimum deletions: " + result);
    }
}