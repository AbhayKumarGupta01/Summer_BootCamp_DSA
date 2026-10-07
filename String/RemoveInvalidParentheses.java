import java.util.*;

public class RemoveInvalidParentheses {

    public static List<String> removeInvalidParentheses(String s) {

        List<String> ans = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.add(s);
        visited.add(s);

        boolean found = false;

        while (!q.isEmpty()) {

            String curr = q.poll();

            // Check if current string is valid
            if (isValid(curr)) {
                ans.add(curr);
                found = true;
            }

            // Stop generating shorter strings
            if (found) {
                continue;
            }

            // Try removing each parenthesis
            for (int i = 0; i < curr.length(); i++) {

                if (curr.charAt(i) != '(' && curr.charAt(i) != ')') {
                    continue;
                }

                String next = curr.substring(0, i)
                           + curr.substring(i + 1);

                if (!visited.contains(next)) {
                    visited.add(next);
                    q.add(next);
                }
            }
        }

        return ans;
    }

    // Checks whether parentheses are valid
    public static boolean isValid(String s) {

        int balance = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                balance++;
            }
            else if (c == ')') {
                balance--;

                if (balance < 0) {
                    return false;
                }
            }
        }

        return balance == 0;
    }

    public static void main(String[] args) {

        String s = "()())()";

        List<String> result = removeInvalidParentheses(s);

        System.out.println("Input: " + s);
        System.out.println("Output: " + result);
    }
}