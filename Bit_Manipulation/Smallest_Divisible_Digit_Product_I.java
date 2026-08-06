import java.util.Scanner;

class Smallest_Divisible_Digit_Product_I {

    public int smallestNumber(int n, int t) {
        while (true) {
            int temp = n;
            int product = 1;

            while (temp > 0) {
                product *= (temp % 10);
                temp /= 10;
            }

            // Handle the case when n = 0
            if (n == 0) {
                product = 0;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int t = sc.nextInt();

        Smallest_Divisible_Digit_Product_I obj = new Smallest_Divisible_Digit_Product_I();
        int result = obj.smallestNumber(n, t);

        // Output
        System.out.println(result);

        sc.close();
    }
}