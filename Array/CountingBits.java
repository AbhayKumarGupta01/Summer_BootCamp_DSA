import java.util.Scanner;
import java.util.Arrays;
public class CountingBits {
    public static int[] countBits(int n) {
        int arr[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count_ones = 0;
            int temp = i;
            while (temp > 0) {
                int result = temp % 2;
                if (result == 1) {
                    count_ones++;
                }
                temp = temp / 2;
            }
            arr[i] = count_ones;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[] = countBits(n);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}