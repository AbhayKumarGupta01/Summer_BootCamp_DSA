import java.util.Scanner;

public class MaximizeSumOfSquaresOfDigits {

    public static String maxSumOfSquares(int num, int sum) {
        if (sum == 0 || sum > num * 9) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);
            result.append(digit);
            sum -= digit;
        }

        if (sum != 0) {
            return "";
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = sc.nextInt();

        System.out.println(maxSumOfSquares(num, sum));

        sc.close();
    }
}