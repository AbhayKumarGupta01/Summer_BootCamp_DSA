import java.util.*;

public class FindTheDistanceValueBetweenTwoArrays {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {

            boolean valid = true;

            for (int j = 0; j < arr2.length; j++) {

                int diff = Math.abs(arr1[i] - arr2[j]);

                if (diff <= d) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        FindTheDistanceValueBetweenTwoArrays obj =
            new FindTheDistanceValueBetweenTwoArrays();

        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;

        System.out.println(
            obj.findTheDistanceValue(arr1, arr2, d)
        );
    }
}