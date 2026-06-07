
import java.util.Scanner;

class Max_Sum_Of_Row {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxSum = 0;
        int maxRow = -1;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " : " + sum);

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println("Maximum sum row is: " + (maxRow + 1));
        System.out.println("Maximum sum is: " + maxSum);

        System.out.println("After Discarding Maximum Sum Row");
        System.out.println("Array is: ");
        for (int i = 0; i < n; i++) {
            if (i == maxRow) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                System.err.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
