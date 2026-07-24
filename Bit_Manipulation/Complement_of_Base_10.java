import java.util.Scanner;

public class Complement_of_Base_10 {

    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }

        StringBuilder complement = new StringBuilder();
        String binary = Integer.toBinaryString(n);

        for (char c : binary.toCharArray()) {
            if (c == '1') {
                complement.append('0');
            } else {
                complement.append('1');
            }
        }

        return Integer.parseInt(complement.toString(), 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Complement_of_Base_10 obj = new Complement_of_Base_10();

        int result = obj.bitwiseComplement(n);

        System.out.println("Bitwise Complement: " + result);

        sc.close();
    }
}