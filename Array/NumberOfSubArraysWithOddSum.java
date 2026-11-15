
import java.util.Scanner;

public class NumberOfSubArraysWithOddSum {

    public static int numOfSubarrays(int[] arr) {

        int mod = 1000000007;

        long even = 1;
        long odd = 0;
        long count = 0;

        int prefix = 0;

        for (int i = 0; i < arr.length; i++) {

            prefix = (prefix + arr[i]) % 2;

            if (prefix == 1) {

                count = (count + even) % mod;
                odd++;

            } else {

                count = (count + odd) % mod;
                even++;
            }
        }

        return (int) count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Number of odd-sum subarrays: "
                + numOfSubarrays(arr));

        sc.close();
    }
}
