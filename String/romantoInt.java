import java.util.*;

public class romantoInt {

    public int romanToInt(String s) {
        int answ = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = val(s.charAt(i));

            if (i < s.length() - 1 && curr < val(s.charAt(i + 1))) {
                answ -= curr;
            } else {
                answ += curr;
            }
        }

        return answ;
    }

    private static int val(char ch) {
        switch (ch) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman Numeral: ");
        String s = sc.nextLine();

        romantoInt obj = new romantoInt();
        System.out.println("Integer Value: " + obj.romanToInt(s));

        sc.close();
    }
}