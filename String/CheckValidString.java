import java.util.Scanner;

public class CheckValidString {

    public static boolean checkValidString(String s) {
        int min = 0;
        int max = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                min++;
                max++;
            } else if (ch == ')') {
                min--;
                max--;
            } else {
                min--;
                max++;
            }

            if (max < 0) {
                return false;
            }

            if (min < 0) {
                min = 0;
            }
        }

        return min == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(checkValidString(s));

        sc.close();
    }
}