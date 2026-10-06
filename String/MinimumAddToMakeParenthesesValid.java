
import java.util.Scanner;

public class MinimumAddToMakeParenthesesValid {

    public static int minAddToMakeValid(String s) {
        int open = 0;
        int add = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    add++;
                }
            }
        }

        return open + add;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        int result = minAddToMakeValid(s);

        System.out.println("Minimum additions required: " + result);

        sc.close();
    }
}
