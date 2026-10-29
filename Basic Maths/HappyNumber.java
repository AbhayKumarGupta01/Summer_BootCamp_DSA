import java.util.Scanner;

public class HappyNumber {

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(isHappy(n));

        sc.close();
    }
}