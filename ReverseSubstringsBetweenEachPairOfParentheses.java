import java.util.*;

public class ReverseSubstringsBetweenEachPairOfParentheses {

    public static String reverseParentheses(String s) {
        Stack<String> stk = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stk.push(str.toString());
                str.setLength(0);
            }

            else if (c == ')') {
                str.reverse();
                str.insert(0, stk.pop());
            }

            else {
                str.append(c);
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(reverseParentheses(s));
    }
}