import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;
        int digits = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            digits++;
            number /= 10;
        }

        System.out.println("\nNumber: " + original);
        System.out.println("Number of digits: " + digits);
        System.out.println("Sum of digits: " + sum);

        if (sum % 2 == 0) {
            System.out.println("Digit sum is EVEN.");
        } else {
            System.out.println("Digit sum is ODD.");
        }

        sc.close();
    }
}