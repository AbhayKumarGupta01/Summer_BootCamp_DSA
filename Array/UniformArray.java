public class UniformArray {

    public boolean uniformArray(int[] nums1) {
        return true;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 3, 4, 7};

        UniformArray obj = new UniformArray();

        boolean result = obj.uniformArray(nums1);

        System.out.println(result);
    }
}