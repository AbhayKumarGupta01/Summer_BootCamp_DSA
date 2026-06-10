// Max Product SubArray

import java.util.*;

class Array_23 {

    static int Max_Product(int arr[]) {
        int minproduct = arr[0];
        int maxproduct = arr[0];

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxproduct;
                maxproduct = minproduct;
                minproduct = temp;
            }
            maxproduct = Math.max(arr[i], maxproduct * arr[i]);
            minproduct = Math.min(arr[i], minproduct * arr[i]);
            ans = Math.max(ans, maxproduct);

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = Max_Product(arr);
        System.out.println("Maximum product is: " + result);
    }
}
