//  Kadane's Algorithm

import java.util.*;

class Array_22 {

    static int Kadane(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        int start = 0;
        int ansstart = 0;
        int ansend = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];
            if (sum > max) {
                max = sum;
                ansstart = start;
                ansend = i;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("result Maximum sum is: " + Kadane(arr));
    }
}
