import java.util.*;
public class checkDivisibility {

    public static boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int original = n;

        while (n > 0) {
            int digit = n % 10;

            sum += digit;
            product *= digit;

            n = n / 10;
        }

        int total = sum + product;

        return original % total == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkDivisibility(n));
    }
}